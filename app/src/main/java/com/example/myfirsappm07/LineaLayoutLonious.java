package com.example.myfirsappm07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LineaLayoutLonious extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linea_layout_lonious);
        ImageButton arrow = findViewById(R.id.arrowLineal);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LineaLayoutLonious.this,TableLayoutLonious.class);
                startActivity(intent);
            }
        });
    }
}