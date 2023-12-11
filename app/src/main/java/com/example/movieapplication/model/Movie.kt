package com.example.movieapplication.model


import java.io.Serializable

data class Movie(val name: String, val address: String, val profileDesc: String) : Serializable{
}