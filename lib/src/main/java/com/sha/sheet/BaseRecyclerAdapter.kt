package com.sha.sheet

import android.view.ViewGroup

/**
 * Created by Sha on 4/20/17.
 */

abstract class BaseRecyclerAdapter<M, VH
: BaseViewHolder<M>>(var items: List<M>) : androidx.recyclerview.widget.RecyclerView.Adapter<VH>(){

    protected var isLoadingAdded: Boolean = false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return getViewHolder(parent, viewType)
    }

    abstract fun getViewHolder(viewGroup: ViewGroup, viewType: Int): VH

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items[position]
        holder.item = item
        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun item(position: Int): M {
        return items[position]
    }

    fun list(): List<M> {
        return items
    }

}
