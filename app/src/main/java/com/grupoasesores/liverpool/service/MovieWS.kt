@file:Suppress("BlockingMethodInNonBlockingContext")
package com.grupoasesores.liverpool.service

import com.google.gson.Gson
import com.grupoasesores.liverpool.service.model.APIError
import com.grupoasesores.liverpool.service.model.LiverpoolProducts
import com.grupoasesores.liverpool.service.model.LiverpoolProductsInput
import com.grupoasesores.liverpool.service.model.QueryOutput
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object MovieWS {

    fun getMovieDetail(query: QueryOutput, handler: (error: APIError?, response: LiverpoolProducts?) -> Unit) {
        val movieApi = ApiFactory.movieApi

        GlobalScope.launch(Dispatchers.Main) {
            try {

                val request = movieApi.getMoviesByGenreAsync(
                    query.searchString.toString(), query.pageNumber.toString().toInt())

                val response = request.await()

                if (!response.isSuccessful) {
                    val error =
                        Gson().fromJson(response.errorBody()?.string(), APIError::class.java)
                    handler(error, null)
                    return@launch
                }

                val body: LiverpoolProducts? = response.body()

                if (body == null) {
                    handler(APIError(678, "no products available"), null)
                    return@launch
                }

                handler(null, body)

            } catch (e: java.lang.Exception) {
                handler(APIError(e.hashCode(), e.message.toString()), null)
            }
        }

    }

}