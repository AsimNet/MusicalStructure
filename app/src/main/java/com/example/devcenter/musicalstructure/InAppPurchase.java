package com.example.devcenter.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InAppPurchase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_app_purchase);

        final Button patNow = (Button) findViewById(R.id.payNow);
        patNow.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Toast.makeText(getApplicationContext(), "PAY NOW", Toast.LENGTH_SHORT).show();
                                      }
                                  }
        );
    }
}
