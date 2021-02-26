package com.example.movieapp.ui.movie.adapter.concat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.core.BaseConcatAdapter
import com.example.movieapp.databinding.TopRatedMoviesRowBinding
import com.example.movieapp.ui.movie.adapter.MovieAdapter

class TopRatedConcatAdapter (private val moviesAdapter: MovieAdapter) : RecyclerView.Adapter<BaseConcatAdapter<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseConcatAdapter<*> {
        val itemBinding = TopRatedMoviesRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConcatViewHolder(itemBinding)
    }

    override fun getItemCount(): Int =1

    override fun onBindViewHolder(holder: BaseConcatAdapter<*>, position: Int) {
        when(holder){
            is ConcatViewHolder -> holder.bin(moviesAdapter)
        }
    }

    private inner class ConcatViewHolder(val binding: TopRatedMoviesRowBinding) : BaseConcatAdapter<MovieAdapter>(binding.root) {
        override fun bin(adapter: MovieAdapter) {
            binding.rvTopRatedMovies.adapter = adapter
        }

    }
}