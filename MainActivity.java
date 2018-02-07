package com.example.lost.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysong = MediaPlayer.create(MainActivity.this, R.raw.hello);
        final Button button = (Button) findViewById(R.id.expanded_menu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.show();
            }


        });
        Button toLibrary = (Button) findViewById(R.id.library);
        toLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLibraryLayer = new Intent(MainActivity.this, library.class);
                startActivity(toLibraryLayer);
            }
        });

        Button toArtist = (Button) findViewById(R.id.artist);
        toArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toArtistLayer = new Intent(MainActivity.this, artist.class);
                startActivity(toArtistLayer);
            }
        });
        Button toSearch = (Button) findViewById(R.id.search);
        toSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSearchLayer = new Intent(MainActivity.this, search.class);
                startActivity(toSearchLayer);
            }
        });
        Button toFavorite = (Button) findViewById(R.id.favorite);
        toFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toFavoriteLayer = new Intent(MainActivity.this, favorites.class);
                startActivity(toFavoriteLayer);
            }
        });
        Button toPayment = (Button) findViewById(R.id.subscribe);
        toPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toPaymentLayer = new Intent(MainActivity.this, payments.class);
                startActivity(toPaymentLayer);
            }
        });
        Button play = (Button) findViewById(R.id.now_playing);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mysong.start();
            }
        });
        Button stop = (Button) findViewById(R.id.stopSong);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mysong.stop();
            }
        });
        SeekBar simpleSeekBar = (SeekBar) findViewById(R.id.Seek_bar); // initiate the progress bar

        simpleSeekBar.setMax(200); // 200 maximum value for the Seek bar

        simpleSeekBar.setProgress(50); // 50 default progress value
    }


}