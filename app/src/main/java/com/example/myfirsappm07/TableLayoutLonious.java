package com.example.myfirsappm07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TableLayoutLonious extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout_lonious);
        ImageButton arrow = findViewById(R.id.arrowTable);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TableLayoutLonious.this,GridLayoutLonious.class);
                startActivity(intent);
            }
        });
    }
}