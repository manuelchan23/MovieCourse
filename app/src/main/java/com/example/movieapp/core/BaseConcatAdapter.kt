package com.example.movieapp.core

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseConcatAdapter<T>(itemView: View): RecyclerView.ViewHolder(itemView) {
    abstract fun bin(adapter: T)
}