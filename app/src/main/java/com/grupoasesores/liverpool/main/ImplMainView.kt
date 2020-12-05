package com.grupoasesores.liverpool.main

import com.grupoasesores.liverpool.service.model.APIError
import com.grupoasesores.liverpool.service.model.LiverpoolProducts

interface ImplMainView {
    fun showProducts(record: List<LiverpoolProducts.Record>)
    fun error(error: APIError)
}