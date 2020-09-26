package com.sha.sheet

import android.view.ViewGroup
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.item_sheet.view.*

class ActionSheetAdapter(items: List<ActionItem>, private val onDismiss: () -> Unit) : BaseRecyclerAdapter<ActionItem, ActionSheetAdapter.Vh>(items) {

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
                onDismiss()
            }
        }

        override fun bindView(item: ActionItem) {
            itemView.tvTitle.text = item.title
            if (!item.isEnabled) {
                itemView.tvTitle.setTextColor(ContextCompat.getColor(itemView.context, R.color.black_light))
            }
        }

    }
}