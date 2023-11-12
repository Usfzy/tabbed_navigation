package com.example.tabbednavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.tabbednavigation.adapter.MovieGenrePageAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val viewPage = findViewById<ViewPager>(R.id.view_page)
        val tabs = findViewById<TabLayout>(R.id.tabs)

        viewPage.adapter = MovieGenrePageAdapter(this, supportFragmentManager)
        tabs?.tabMode = TabLayout.MODE_FIXED
        tabs.setupWithViewPager(viewPage)

    }
}