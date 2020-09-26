package com.sha.sheet

import android.graphics.Color
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
            setupEnabled()
            setupStyle()
        }

        private fun setupStyle() {
            if (!item!!.isEnabled) return

            when (item!!.style) {
                Style.DEFAULT -> {
                    itemView.tvTitle.setTextColor(ContextCompat.getColor(itemView.context, R.color.blue_light))
                }
                Style.DESTRUCTIVE -> {
                    itemView.tvTitle.setTextColor(Color.RED)
                }
            }
        }

        private fun setupEnabled() {
            when (item!!.isEnabled) {
                true -> {
                    itemView.tvTitle.setTextColor(ContextCompat.getColor(itemView.context, R.color.blue_light))
                }
                false -> {
                    itemView.tvTitle.setTextColor(ContextCompat.getColor(itemView.context, R.color.black_light))
                }
            }
        }
    }

}