package com.sha.sheet

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration

class SimpleDividerItemDecoration(context: Context) : ItemDecoration() {
    private val mDivider: Drawable? = ContextCompat.getDrawable(context, R.drawable.line_divider)

    override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDrawOver(c, parent, state)
        val left = parent.paddingLeft
        val right = parent.width - parent.paddingRight
        val childCount = parent.adapter!!.itemCount
        for (i in 0 until childCount) {
            if (i == childCount - 1) {
                continue
            }
            val child: View = parent.getChildAt(i) ?: continue
            val params = child.layoutParams as RecyclerView.LayoutParams
            val top = child.bottom + params.bottomMargin
            val bottom = top + mDivider!!.intrinsicHeight
            mDivider.setBounds(left, top, right, bottom)
            mDivider.draw(c)
        }
    }

}