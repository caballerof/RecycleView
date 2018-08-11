package com.mtw.caballero.recycleview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.contacto_list_item.view.*

class ContactoListAdapter(private val contactosList: ArrayList<Contacto>) : RecyclerView.Adapter<ContactoListAdapter.myViewHolder>() {
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.bind(contactosList[position])
    }

    override fun getItemCount(): Int {
        return contactosList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactoListAdapter.myViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return myViewHolder(layoutInflater.inflate(R.layout.contacto_list_item, parent, false))
    }

    class myViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun bind(contacto: Contacto) {
            itemView.tvNombre.text = contacto.nombre
            itemView.tvTelefono.text = contacto.telefono
            itemView.setOnClickListener {
                Toast.makeText(it.context, "Magic", Toast.LENGTH_LONG).show()
            }
        }
    }
}