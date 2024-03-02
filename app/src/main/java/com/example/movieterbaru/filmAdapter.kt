package com.example.movieterbaru

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class filmAdapter  (var mContext: Context, var resources: Int, var items: List<Film>): ArrayAdapter<Film>(mContext, resources, items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources, null)

        val tvTitle:TextView = view.findViewById(R.id.tv_title)
        val ivposter:ImageView = view.findViewById(R.id.iv_poster)
        val tvdesc:TextView = view.findViewById(R.id.tv_desc)
        val rbMovie: RatingBar = view.findViewById(R.id.ratingBar)

        var mItem : Film = items[position]
        tvTitle.text = mItem.title
        ivposter.setImageDrawable(mContext.resources.getDrawable(mItem.poster!!))
        tvdesc.text = mItem.describe
        rbMovie.rating = mItem.rating

        return view
    }
}