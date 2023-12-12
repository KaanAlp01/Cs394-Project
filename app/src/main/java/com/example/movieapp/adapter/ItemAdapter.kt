package com.example.movieapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.MovieViewActivity
import com.example.movieapp.R
import com.example.movieapp.model.Movie

class ItemAdapter(val dataset: List<Movie>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView = view.findViewById(R.id.nameView)
        val posterURLView: TextView = view.findViewById(R.id.posterUrlView)
        private lateinit var movie: Movie

        init {
            view.setOnClickListener {
                val context = itemView.context
                val showUserIntent = Intent(context, MovieViewActivity::class.java)
                showUserIntent.putExtra("USER_KEY", movie)
                context.startActivity(showUserIntent)
            }
        }

        fun bind(movie: Movie) {
            this.movie = movie
            nameView.text = movie.name
            posterURLView.text = movie.posterUrl
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.movie_layout, parent, false)
        return ItemViewHolder(itemLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val movie = dataset[position]
        holder.bind(movie)
    }
}