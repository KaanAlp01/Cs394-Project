package com.example.movieapplication.model


import java.io.Serializable

data class Movie(val name: String, val description: String, val posterUrl: String, val runtime: String, val releaseDate: String, val rating: String) : Serializable{
    
}