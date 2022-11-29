package com.example.navigatorapp.recyclerEcMusics.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigatorapp.recyclerEcMusics.EcMusic
import com.example.navigatorapp.databinding.ItemPlayerBinding

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemPlayerBinding.bind(view)
    @SuppressLint("SetTextI18n")
    fun render(ecPlayer: EcMusic){
        binding.tvEcPlayerName.text = ecPlayer.cantante
        binding.tvEcPlayerTeam.text = "Cancion: " + ecPlayer.nombre
        binding.tvEcPlayerAge.text = "Duracion: " + ecPlayer.duracion.toString()
        Glide.with(binding.ivEcPlayer.context).load(ecPlayer.photo).into(binding.ivEcPlayer)
    }
}