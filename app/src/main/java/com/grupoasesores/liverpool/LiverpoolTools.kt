package com.grupoasesores.liverpool

import android.app.Activity
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class LiverpoolTools{

    fun showImageByUrl(_url: String, mImageView: ImageView, mActivity: Activity){
        Glide.with(mActivity).load(_url).into(mImageView)
            .apply {
                RequestOptions
                    .placeholderOf(R.drawable.image_placeholder)
                    .error(R.drawable.image_placeholder)
            }
    }

}