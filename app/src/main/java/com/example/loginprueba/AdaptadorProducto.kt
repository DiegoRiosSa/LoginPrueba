package com.example.loginprueba

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorProducto (private val context: Context,
                          private val productos: MutableList<Producto>):
                            RecyclerView.Adapter<AdaptadorProducto.ViewHolder>(){
       class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

           var imagen: ImageView = itemView.findViewById(R.id.imgCard)
           var producto: TextView = itemView.findViewById(R.id.producto)
           var contenido: TextView = itemView.findViewById(R.id.contenido)
           var precio: TextView = itemView.findViewById(R.id.precio)

           fun bind(producto: Producto){
               itemView.setOnClickListener {
                   Toast.makeText(itemView.context, "Elegiste: ${producto.productoTexto}, ${producto.productoContenido}, $${producto.productoPrecio}", Toast.LENGTH_LONG).show()
               }
           }
       }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutInflater: LayoutInflater = LayoutInflater.from(context)
        var view = layoutInflater.inflate(R.layout.producto, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var producto: Producto = productos[position]

        holder.imagen.setImageResource(producto.productoImagen)
        holder.producto.text = producto.productoTexto
        holder.contenido.text = producto.productoContenido
        holder.precio.text = producto.productoPrecio
        holder.bind(producto)



    }

    override fun getItemCount(): Int {
        return productos.size

    }
}