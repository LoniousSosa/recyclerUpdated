package com.example.myfirsappm07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class ReciclerLonious extends AppCompatActivity {

    RecyclerView recView;
    Titular[]datos;
    AdaptadorRecicler adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicler_lonious);
        recView = findViewById(R.id.recView);
        recView.setHasFixedSize(true);
        recView.setLayoutManager(
                        (new LinearLayoutManager
                                (this, LinearLayoutManager.VERTICAL, false)));
        datos = new Titular[50];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Titular("Título "+(i+1),"Subtítulo " +(i+1));
        }
        adaptador = new AdaptadorRecicler(datos);
        recView.setAdapter(adaptador);
    }
}