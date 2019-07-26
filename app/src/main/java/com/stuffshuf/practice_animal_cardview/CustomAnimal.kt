package com.stuffshuf.practice_animal_cardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.new_list.view.*

class CustomAnimal(val animalss:ArrayList<Animals>):RecyclerView.Adapter<CustomAnimal.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val li=parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView=li.inflate(R.layout.new_list, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return animalss.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal1=animalss[position]
        holder.itemView.Name.text=animal1.dog
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
}