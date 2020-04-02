package com.grupoasesores.liverpool.main

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.grupoasesores.liverpool.LiverpoolTools
import com.grupoasesores.liverpool.R
import com.grupoasesores.liverpool.service.model.Record

class ProductAdapter (private val mActivity: Activity, private val items: List<Record>)
    : RecyclerView.Adapter<ProductAdapter.MainViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_main_item, parent, false)
        return MainViewHolder(v)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val record = items[position]
        LiverpoolTools().showImageByUrl(record.xlImage.toString(), holder.ivThumbnail, mActivity)
    }

    class MainViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivThumbnail: ImageView = itemView.findViewById(R.id.iv_thumbnail)
        val tvTitle: TextView = itemView.findViewById(R.id.tv_title)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_price)
        val tvLocations: TextView = itemView.findViewById(R.id.tv_locations)
    }

}