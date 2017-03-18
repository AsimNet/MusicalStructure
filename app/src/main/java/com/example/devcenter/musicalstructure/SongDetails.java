package com.example.devcenter.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);


        final Button gotoSongs = (Button) findViewById(R.id.payNow);
        gotoSongs.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent gotoPayment = new Intent(SongDetails.this, InAppPurchase.class);
                                             startActivity(gotoPayment);
                                         }
                                     }
        );
    }
}
