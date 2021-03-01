package com.example.plantesgrasses.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.plantesgrasses.R
import com.example.plantesgrasses.adapter.PlantAdapter

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view = inflater?.inflate(R.layout.fragment_home,container,false)

        //on recupère lerecyclerview
        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler)
        horizontalRecyclerView.adapter = PlantAdapter()
        return view


    }


}