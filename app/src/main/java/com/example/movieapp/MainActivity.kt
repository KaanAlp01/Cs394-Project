package com.example.movieapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.adapter.ItemAdapter
import com.example.movieapp.data.DataSource
import com.example.movieapp.ui.theme.MovieAppTheme

class MainActivity : Activity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val movies = DataSource(this).loadMovies()

            val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
            recyclerView.adapter = ItemAdapter(movies)
        }
    }
