package com.grupoasesores.liverpool.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.grupoasesores.liverpool.R
import com.grupoasesores.liverpool.service.model.APIError
import com.grupoasesores.liverpool.service.model.LiverpoolProducts
import com.grupoasesores.liverpool.service.model.QueryOutput
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ImplMainView {

    private lateinit var presenter: MainPresenter
    private lateinit var tvSearch: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        initView()
    }

    private fun initView() {
        tvSearch = findViewById(R.id.tv_search)

        findViewById<Button>(R.id.btn_search)
            .setOnClickListener {
                val searchText = tvSearch.text.toString()
                if (searchText.isNotEmpty()){
                    tvSearch.setText("")
                    presenter.executeService(QueryOutput(searchText, 1))
                }else{
                    tvSearch.error = getString(R.string.text_et_search)
                }
            }
    }

    override fun showProducts(record: List<LiverpoolProducts.Record>) {
        rvProducts.layoutManager = GridLayoutManager(this, 2)
        rvProducts.adapter = ProductAdapter(this, record)
    }

    override fun error(error: APIError) {
        Toast.makeText(this@MainActivity, error.message, Toast.LENGTH_LONG).show()
    }

}