package com.grupoasesores.liverpool.main

import com.grupoasesores.liverpool.service.model.APIError
import com.grupoasesores.liverpool.service.model.Record

interface ImplMainView {
    fun showProducts(record: List<Record>)
    fun error(error: APIError)
}