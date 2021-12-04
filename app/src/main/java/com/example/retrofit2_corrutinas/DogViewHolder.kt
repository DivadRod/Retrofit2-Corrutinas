package com.example.retrofit2_corrutinas

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit2_corrutinas.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder (view: View): RecyclerView.ViewHolder(view){

    private val binding = ItemDogBinding.bind(view)

    fun bind(image:String){
        Picasso.get().load(image).into(binding.ivDog)
    }
}