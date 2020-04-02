package com.grupoasesores.liverpool.service

object ApiFactory {

    val movieApi: MovieApi = RetrofitFactory
        .retrofit("https://shoppapp.liverpool.com.mx/appclienteservices/services/v3/")
        .create(MovieApi::class.java)

}