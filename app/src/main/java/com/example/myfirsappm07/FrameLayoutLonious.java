package com.example.myfirsappm07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class FrameLayoutLonious extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton arrow = findViewById(R.id.arrowFrame);
        Button intentando = findViewById(R.id.botonIntentExt);
        Button intentando2 = findViewById(R.id.formIntentExt);
        Button intentando3 = findViewById(R.id.reciclerButton);

        arrow.setOnClickListener(view -> {
            Intent intent = new Intent(FrameLayoutLonious.this,RelativeLayout.class);
            startActivity(intent);
        });
        intentando.setOnClickListener(view -> {
            Intent intent2 = new Intent(FrameLayoutLonious.this,Buttons_extendedLonious.class);
            startActivity(intent2);
        });
        intentando2.setOnClickListener(view -> {
            Intent intent3 = new Intent(FrameLayoutLonious.this,FormulariLonious.class);
            startActivity(intent3);
        });

        intentando3.setOnClickListener(view -> {
            Intent intent4 = new Intent(FrameLayoutLonious.this,ReciclerLonious.class);
            startActivity(intent4);
        });
    }
}