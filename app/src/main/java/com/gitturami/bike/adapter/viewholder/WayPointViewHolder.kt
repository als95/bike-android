package com.gitturami.bike.adapter.viewholder

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gitturami.bike.R
import com.gitturami.bike.data.RecyclerItem
import kotlinx.android.synthetic.main.rv_item.view.*

class WayPointViewHolder(context: Context, parent: ViewGroup?, private val clickListenerFunc: ((Int) -> Unit)?)
    : RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false)) {

    private val titleTextView by lazy {
        itemView.recommend_itemTitle as TextView
    }

    private val addressTextView by lazy {
        itemView.recommend_itemAddress as TextView
    }

    private val distanceTextView by lazy {
        itemView.recommend_itemDistance as TextView
    }

    fun onBind(data : RecyclerItem, position: Int) {
        titleTextView.text = data.title
        addressTextView.text = data.content
        // TODO: get distance
        distanceTextView.text = "3.5km"

        itemView.setOnClickListener {
            clickListenerFunc?.invoke(position)
        }
    }
}