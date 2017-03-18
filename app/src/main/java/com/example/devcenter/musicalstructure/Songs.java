package com.example.devcenter.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        final Button gotoSongs = (Button) findViewById(R.id.gotoSongSetails);
        gotoSongs.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent gotoSongDetails = new Intent(Songs.this, SongDetails.class);
                                             startActivity(gotoSongDetails);
                                         }
                                     }
        );
    }
}
