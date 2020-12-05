package com.grupoasesores.liverpool.main

import com.grupoasesores.liverpool.service.model.APIError
import com.grupoasesores.liverpool.service.model.LiverpoolProducts
import com.grupoasesores.liverpool.service.model.LiverpoolProductsInput
import com.grupoasesores.liverpool.service.model.QueryOutput

interface ImplMainPresenter {
    fun error(error: APIError)
    fun getResponseData(response: LiverpoolProducts)
    fun executeService(queryOutput: QueryOutput)
}