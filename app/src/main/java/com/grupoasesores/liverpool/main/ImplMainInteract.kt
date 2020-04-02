package com.grupoasesores.liverpool.main

import com.grupoasesores.liverpool.service.model.QueryOutput

interface ImplMainInteract {
    fun getResultLiverpoolProducts(queryOutput: QueryOutput)
}