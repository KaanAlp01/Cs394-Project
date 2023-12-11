package com.example.movieapplication.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapplication.MovieInteractionActivity
import com.example.movieapplication.model.Movie
import com.example.movieapplication.R

class ItemAdapter(val dataset:List<Movie>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val nameView: TextView = view.findViewById(R.id.)
        val descriptionView: TextView = view.findViewById(R.id.description)
        private lateinit var movie:Movie

        init{
            view.setOnClickListener{
                val context = itemView.context
                val showUserIntent = Intent(context, MovieInteractionActivity::class.java)
                showUserIntent.putExtra("MOVIE_KEY", movie)
                context.startActivity(showUserIntent)

            }
        }

        fun bind(movie:Movie){
            this.movie = movie
            nameView.text = movie.name
            descriptionView.text = movie.description

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(itemLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val user = dataset[position]
        holder.bind(user)
    }
}