package com.sha.sheet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Sha on 4/20/17.
 */

abstract class BaseViewHolder<T>(viewGroup: ViewGroup, @LayoutRes layoutRes: Int)
    : RecyclerView.ViewHolder(LayoutInflater.from(viewGroup.context).inflate(layoutRes, viewGroup, false)) {

    var item: T? = null

    abstract fun bindView(item: T)


    fun getString(@StringRes resId: Int): String = itemView.context.getString(resId)
}
