package com.example.movieapplication.data

import android.content.Context
import com.example.movieapplication.R
import com.example.movieapplication.model.Movie

class DataSource(val context: Context) {

    fun getMovieNames(): Array<String> {
        return context.resources.getStringArray(R.array.movie_name_array)
    }
    fun getMovieDescriptions(): Array<String> {
        return context.resources.getStringArray(R.array.movie_description_array)
    }
    fun getMoviePosterURL(): Array<String> {
        return context.resources.getStringArray(R.array.movie_posterURL_array)
    }
    fun getMovieRuntime(): Array<String> {
        return context.resources.getStringArray(R.array.movie_runtime_array)
    }
    fun getMovieReleaseDates(): Array<String> {
        return context.resources.getStringArray(R.array.movie_releaseDate_array)
    }
    fun getMovieRatings(): Array<String> {
        return context.resources.getStringArray(R.array.movie_rating_array)
    }
    fun loadMovies(): List<Movie> {
        val movieNameList = getMovieNames()
        val movieDescriptionList = getMovieDescriptions()
        val moviePosterList = getMoviePosterURL()
        val movieRuntimeList = getMovieRuntime()
        val movieReleaseDateList = getMovieReleaseDates()
        val movieRatingList = getMovieRatings()
        val movies = mutableListOf<Movie>()
        for (i in 0..9) {
            val movie = Movie(movieNameList[i], movieDescriptionList[i], moviePosterList[i],movieRuntimeList[i],movieReleaseDateList[i],movieRatingList[i])
            movies.add(movie)
        }
        return movies
    }

}