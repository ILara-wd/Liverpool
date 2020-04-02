package com.grupoasesores.liverpool.main

import com.grupoasesores.liverpool.service.model.APIError
import com.grupoasesores.liverpool.service.model.LiverpoolProductsInput
import com.grupoasesores.liverpool.service.model.QueryOutput

class MainPresenter(private val implMainView: ImplMainView) : ImplMainPresenter {

    private lateinit var interact: MainInteract

    override fun executeService(queryOutput: QueryOutput){
        interact = MainInteract(this)
        interact.getResultLiverpoolProducts(queryOutput = queryOutput)
    }

    override fun error(error: APIError) {
        implMainView.error(error)
    }

    override fun getResponseData(response: LiverpoolProductsInput) {
        implMainView.showProducts(response.plpResults?.records.orEmpty())
    }

}