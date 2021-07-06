package com.example.shopapp.extensions

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.shopapp.R


fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.INVISIBLE
}

fun View.hideIf(visibility: Boolean) {
    if (visibility) {
        show()
    } else {
        hide()
    }
}

fun ImageView.loadImg(url: String) {
    Glide.with(this.context)
        .load(url)
        .centerCrop()
        .placeholder(R.drawable.ic_placeholder)
        .error(R.drawable.ic_not_found)
        .into(this)
}