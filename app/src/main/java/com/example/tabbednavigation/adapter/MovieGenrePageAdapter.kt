package com.example.tabbednavigation.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabbednavigation.R
import com.example.tabbednavigation.fragments.MoviesFragment

private val TAB_GENRES_SCROLLABLE = listOf(
    R.string.action,
    R.string.comedy,
    R.string.drama,
    R.string.sci_fi,
    R.string.family,
    R.string.crime,
    R.string.history,
)

private val TAB_GENRES_FIXED = listOf(
    R.string.action,
    R.string.comedy,
    R.string.drama,
)

class MovieGenrePageAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(
        fm,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,
    ) {

    override fun getItem(position: Int): Fragment {
        return MoviesFragment.newInstance(context.resources.getString(TAB_GENRES_FIXED[position]))
    }

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_GENRES_FIXED[position])
    }

    override fun getCount(): Int {
        return TAB_GENRES_FIXED.size
    }
}