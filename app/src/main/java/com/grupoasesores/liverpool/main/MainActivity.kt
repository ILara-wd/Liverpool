package com.grupoasesores.liverpool.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.grupoasesores.liverpool.R
import com.grupoasesores.liverpool.service.model.APIError
import com.grupoasesores.liverpool.service.model.QueryOutput
import com.grupoasesores.liverpool.service.model.Record

class MainActivity : AppCompatActivity(), ImplMainView {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
    }

    override fun onResume() {
        presenter.executeService(QueryOutput("silla", 1))
        super.onResume()
    }

    override fun showProducts(record: List<Record>) {

    }

    override fun error(error: APIError) {
        Toast.makeText(this@MainActivity, error.message, Toast.LENGTH_LONG).show()
    }

}