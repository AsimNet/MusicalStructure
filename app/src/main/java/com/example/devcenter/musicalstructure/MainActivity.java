package com.example.devcenter.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button gotoSongs = (Button) findViewById(R.id.gotoSongs);
        gotoSongs.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                            Intent songsList = new Intent(MainActivity.this,Songs.class);
                                             startActivity(songsList);
                                         }
                                     }
        );
    }
}
