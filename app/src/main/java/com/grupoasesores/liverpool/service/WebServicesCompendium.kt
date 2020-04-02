package com.grupoasesores.liverpool.service

import com.grupoasesores.liverpool.service.model.QueryOutput

object WebServicesCompendium {

    fun getInfoMovie(movieId: QueryOutput) {

        MovieWS.getMovieDetail(movieId) { error, response ->
            if (error != null) {
                print(error)
            }
            if (response != null) {
                print(response)
            }
        }

    }


}