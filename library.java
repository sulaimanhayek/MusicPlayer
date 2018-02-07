package com.example.lost.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Button toNowPlaying = (Button) findViewById(R.id.now_playing);
        toNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toNowPlayingLayer = new Intent(library.this, MainActivity.class);
                startActivity(toNowPlayingLayer);
            }
        });
        Button toArtisth = (Button) findViewById(R.id.artist2);
        toArtisth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toArtistLayerh = new Intent(library.this, artist.class);
                startActivity(toArtistLayerh);
            }
        });

    }

}
