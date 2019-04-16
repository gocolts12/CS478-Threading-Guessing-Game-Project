package com.example.project4;

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

        Button threadVsThreadButton = (Button) findViewById(R.id.ThreadVsThreadButton);
        Button pvpButton = (Button) findViewById(R.id.PlayerVsPlayerButton);

        threadVsThreadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThreadVsThread.class);
                startActivity(i);
            }
        });

        pvpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlayerVPlayer.class);
                startActivity(i);
            }
        });
    }
}
