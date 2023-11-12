package com.example.tabbednavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tabbednavigation.R

class MoviesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_movies, container, false)

        view.findViewById<TextView>(R.id.movie_genre).text =
            arguments?.getString(MOVIE_GENRE) ?: "UnDefined Genre"

        return view
    }

    companion object {
        private const val MOVIE_GENRE = "MOVIE_TYPE"

        @JvmStatic
        fun newInstance(movieGenre: String): MoviesFragment {
            return MoviesFragment().apply {
                arguments = Bundle().apply {
                    putString(MOVIE_GENRE, movieGenre)
                }
            }
        }
    }
}