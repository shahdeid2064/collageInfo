package com.atefmousa.collageinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        CardView students_card = findViewById(R.id.cardView_students);

        students_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent  = new Intent(MainActivity.this,DetaliedActivtiy.class);
               startActivity(intent);
            }
        });
        CardView stuff_card = findViewById(R.id.cardView_stuff);

        stuff_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "stuff Info", Toast.LENGTH_SHORT).show();
            }
        });


    }
}