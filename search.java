package com.example.lost.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button toLibrary3 = (Button) findViewById(R.id.library3);
        toLibrary3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLibraryLayer = new Intent(search.this, library.class);
                startActivity(toLibraryLayer);
            }
        });

        Button toArtist = (Button) findViewById(R.id.artist3);
        toArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toArtistLayer = new Intent(search.this, artist.class);
                startActivity(toArtistLayer);
            }
        });
        Button toSearch = (Button) findViewById(R.id.now_playing3);
        toSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSearchLayer = new Intent(search.this, MainActivity.class);
                startActivity(toSearchLayer);
            }
        });
        Button toFavorite = (Button) findViewById(R.id.favorite3);
        toFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toFavoriteLayer = new Intent(search.this, favorites.class);
                startActivity(toFavoriteLayer);
            }
        });


    }
}
