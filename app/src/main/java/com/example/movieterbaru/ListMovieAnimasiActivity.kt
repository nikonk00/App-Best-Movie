package com.example.movieterbaru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ListMovieAnimasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_movie_animasi)

        var listview = findViewById<ListView>(R.id.lv_animasi)
        var list = mutableListOf<Film>()

        for ( i in DummyDataAnimasi.titleMovie.indices) {
            list.add(
                Film(
                    DummyDataAnimasi.titleMovie[i],
                    DummyDataAnimasi.descMovie[i],
                    DummyDataAnimasi.posterMovie[i],
                    DummyDataAnimasi.ratingMovie[i]
                )
            )
        }

        listview.adapter = filmAdapter(this, R.layout.list_movie, list)
    }
}