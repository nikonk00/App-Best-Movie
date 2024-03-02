package com.example.movieterbaru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ListMovieActionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_movie_action)

        var listview = findViewById<ListView>(R.id.lv_action)
        var list = mutableListOf<Film>()

        for ( i in DummyDataAction.titleMovie.indices) {
            list.add(
                Film(
                    DummyDataAction.titleMovie[i],
                    DummyDataAction.descMovie[i],
                    DummyDataAction.posterMovie[i],
                    DummyDataAction.ratingMovie[i]
                )
            )
        }

        listview.adapter = filmAdapter(this, R.layout.list_movie, list)

    }
}