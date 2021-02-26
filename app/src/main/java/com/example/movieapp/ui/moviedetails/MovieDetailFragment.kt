package com.example.movieapp.ui.moviedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.movieapp.R
import com.example.movieapp.databinding.FragmentMovieDetailBinding

class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var binding: FragmentMovieDetailBinding
    private val args by navArgs<MovieDetailFragmentArgs>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMovieDetailBinding.bind(view)

        Glide.with(view.context).load("https://image.tmdb.org/t/p/w500${args.backgroundImageUrl}").centerCrop().into(binding.imgBackground)
        Glide.with(view.context).load("https://image.tmdb.org/t/p/w500${args.posterImageUrl}").centerCrop().into(binding.imgMovie)
        binding.title.text = args.title
        binding.txtRating.text = "${args.voteAverage} (${args.voteCount} Reviews) "
        binding.txtReleased.text = "Released ${args.releaseDate}"
        binding.txtDescription.text = args.overview
        binding.txtLanguage.text = "Language ${args.language}"


    }

}