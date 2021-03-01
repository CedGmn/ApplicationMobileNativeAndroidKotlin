package com.example.plantesgrasses.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.plantesgrasses.R

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val plantAdapter = view.findViewById<ImageView>(R.id.plant_adapter)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_horizontale, parent, false)
        return ViewHolder(view)
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }

}