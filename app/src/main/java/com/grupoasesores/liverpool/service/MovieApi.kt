package com.grupoasesores.liverpool.service

import com.grupoasesores.liverpool.service.model.LiverpoolProducts
import com.grupoasesores.liverpool.service.model.LiverpoolProductsInput
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MovieApi {

    @Headers("Content-Type: application/json", "Accept: application/json")
    @GET("plp?force-plp=true&number-of-items-per-page=20")
    fun getMoviesByGenreAsync(
        @Query("search-string") search_string: String,
        @Query("page-number") page_number: Int ) : Deferred<Response<LiverpoolProducts>>

}