package com.example.recyclerviewkotlin2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import org.w3c.dom.Text

class CustomAdapter(private val contactslist : ArrayList<Contacts>) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,
            false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return contactslist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = contactslist[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.txt_heading.text = currentItem.heading
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val txt_heading : TextView = itemView.findViewById(R.id.txt_heading)

    }
}