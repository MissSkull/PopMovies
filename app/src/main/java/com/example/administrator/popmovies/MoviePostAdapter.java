package com.example.administrator.popmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 2017/4/14.
 */

public class MoviePostAdapter extends ArrayAdapter<MoviePostAdapter.MoviePost> {
    public MoviePostAdapter(Context context, List<MoviePost> moviePostList) {
        super(context, 0, moviePostList);
    }

    public View getView(int position, View coverView, ViewGroup parent){
        MoviePost moviePost = getItem(position);

        if(coverView == null){
            coverView = LayoutInflater.from(getContext()).inflate(R.layout.layout, parent, false);
        }
        ImageView iconView = (ImageView) coverView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(moviePost.image);
        return coverView;
    }

    public class MoviePost {
        int image;
        public MoviePost(int image){
            this.image = image;
        }
    }
}
