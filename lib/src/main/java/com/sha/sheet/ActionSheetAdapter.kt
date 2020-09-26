package com.sha.sheet

import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_sheet.view.*

class ActionSheetAdapter(items: List<ActionItem>) : BaseRecyclerAdapter<ActionItem, ActionSheetAdapter.Vh>(items) {

    override fun getViewHolder(viewGroup: ViewGroup, viewType: Int): Vh {
        return Vh(viewGroup)
    }

    inner class Vh internal constructor(viewGroup: ViewGroup)
        : BaseViewHolder<ActionItem>(viewGroup, R.layout.item_sheet) {
        init {
            itemView.setOnClickListener {
                val item = this.item!!
                if (!item.isEnabled) return@setOnClickListener
                item.action()
            }
        }

        override fun bindView(item: ActionItem) {
            itemView.tvTitle.text = item.title
            if (!item.isEnabled) {
                // TODO: apply color
            }
        }

    }
}