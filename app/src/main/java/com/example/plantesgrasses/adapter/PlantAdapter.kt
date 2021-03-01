package com.example.plantesgrasses.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.plantesgrasses.MainActivity
import com.example.plantesgrasses.PlantModel
import com.example.plantesgrasses.R
import kotlin.coroutines.coroutineContext

class PlantAdapter(
        private val context :  MainActivity,
        private val plantList : List<PlantModel>,
        private val layoutID: Int): RecyclerView.Adapter<PlantAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val plantAdapter = view.findViewById<ImageView>(R.id.plant_adapter)
        val plantImage = view.findViewById<ImageView>(R.id.image_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(layoutID, parent, false)
        return ViewHolder(view)
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //recuperer les informatons de la plante
        val currentPlant = plantList[position]
        currentPlant.description

        //utiliser glide pour recuperer l'image a partir du lien puis ajouter en composant
        Glide.with(context).load(Uri.parse(currentPlant.imageUrl)).into(holder.plantImage)

    }

    override fun getItemCount(): Int {
        return plantList.size
    }

}