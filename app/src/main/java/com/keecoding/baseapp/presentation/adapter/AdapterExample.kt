package com.keecoding.baseapp.presentation.adapter
//
//import android.R.attr
//import android.annotation.SuppressLint
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.FrameLayout
//import android.widget.LinearLayout
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import android.R.attr.data
//
//class Adapter(
//    private val dataList: MutableList<Data>,
//    val onUpdate: (Int, Data) -> Unit,
//): RecyclerView.Adapter<Adapter.ViewHolder>() {
//
//    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
//        // Bind data to ViewHolder
//        fun bind(data: Data, position: Int) {
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bind(dataList[position], position)
//
//    }
//
//    override fun getItemCount(): Int = dataList.size
//
//}