package com.example.lost.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_artist);
        Button toLibrary = (Button) findViewById(R.id.library6);
        toLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLibraryLayer = new Intent(artist.this, library.class);
                startActivity(toLibraryLayer);
            }
        });

        Button toHome = (Button) findViewById(R.id.now_playing6);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toHome1 = new Intent(artist.this, MainActivity.class);
                startActivity(toHome1);
            }
        });
        Button toFavorites = (Button) findViewById(R.id.favorite6);
        toFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toFavoriteLayer = new Intent(artist.this, favorites.class);
                startActivity(toFavoriteLayer);
            }
        });
        Button toSearch = (Button) findViewById(R.id.search6);
        toSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSearchLayer = new Intent(artist.this, search.class);
                startActivity(toSearchLayer);
            }
        });
    }
}
