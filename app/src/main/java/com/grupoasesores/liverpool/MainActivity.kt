package com.grupoasesores.liverpool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoasesores.liverpool.service.WebServicesCompendium
import com.grupoasesores.liverpool.service.model.QueryOutput

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        WebServicesCompendium.getInfoMovie(QueryOutput("sofá", 1))
        super.onResume()
    }

}
