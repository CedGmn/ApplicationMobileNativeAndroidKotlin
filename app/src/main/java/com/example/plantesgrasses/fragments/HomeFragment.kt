package com.example.plantesgrasses.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.plantesgrasses.MainActivity
import com.example.plantesgrasses.PlantModel
import com.example.plantesgrasses.R
import com.example.plantesgrasses.adapter.PlantAdapter

class HomeFragment(private val context: MainActivity) : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view = inflater?.inflate(R.layout.fragment_home,container,false)

        //creation d'un liste qui stocje les cactus
        val plantList = arrayListOf<PlantModel>()

        //enregistrer un premier cactus dans notre liste
        plantList.add(PlantModel(
                "catus grand",
                "beau cactus d'australie",
                "https://cdn.pixabay.com/photo/2016/11/20/08/03/cactus-1842095_960_720.jpg",
                false


        ))

        plantList.add(PlantModel(
                "catus petit",
                "il pique fort !",
                "https://cdn.pixabay.com/photo/2017/08/08/00/57/plants-2609843_960_720.jpg",
                false
        ))
        //on recupère lerecyclerview
        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler)
        horizontalRecyclerView.adapter = PlantAdapter(context, plantList, R.layout.list_horizontale)

        //recupérer second recycler
        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler)
        verticalRecyclerView.adapter = PlantAdapter(context,plantList,R.layout.item_vertical_plant)
        return view


    }


}