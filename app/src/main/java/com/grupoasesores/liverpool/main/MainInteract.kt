package com.grupoasesores.liverpool.main

import com.grupoasesores.liverpool.service.MovieWS
import com.grupoasesores.liverpool.service.model.LiverpoolProductsInput
import com.grupoasesores.liverpool.service.model.QueryOutput

class MainInteract(private val implMainPresenter: ImplMainPresenter) : ImplMainInteract {

    override fun getResultLiverpoolProducts(queryOutput: QueryOutput) {

        MovieWS.getMovieDetail(queryOutput) { error, response ->
            if (error != null) {
                implMainPresenter.error(error)
            }
            if (response != null) {
                implMainPresenter.getResponseData(response)
            }
        }
    }

}