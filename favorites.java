package com.example.lost.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Button toLibrary3 = (Button) findViewById(R.id.library5);
        toLibrary3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLibraryLayer = new Intent(favorites.this, library.class);
                startActivity(toLibraryLayer);
            }
        });

        Button toArtist = (Button) findViewById(R.id.artist5);
        toArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toArtistLayer = new Intent(favorites.this, artist.class);
                startActivity(toArtistLayer);
            }
        });
        Button toHome = (Button) findViewById(R.id.now_playing5);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSearchLayer = new Intent(favorites.this, MainActivity.class);
                startActivity(toSearchLayer);
            }
        });
        Button toSearch = (Button) findViewById(R.id.library5);
        toSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toFavoriteLayer = new Intent(favorites.this, search.class);
                startActivity(toFavoriteLayer);
            }
        });

    }
}
