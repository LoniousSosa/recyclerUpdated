package com.example.myfirsappm07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class ReciclerLonious extends AppCompatActivity {

    RecyclerView recView;
    ArrayList<Titular> datos;
    AdaptadorRecicler adaptador;
    Button botonInsertar;
    Button botonEliminar;
    Button botonMover;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicler_lonious);
        datos = new ArrayList<>();
        botonInsertar = findViewById(R.id.insertar);
        botonMover = findViewById(R.id.mover);
        botonEliminar = findViewById(R.id.eliminar);
        recView = findViewById(R.id.recView);
        recView.setHasFixedSize(true);
        recView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recView.setLayoutManager((new GridLayoutManager(this,3)));
        for (int i =0; i < 50; i++) {
            datos.add(i,new Titular("Título "+(i+1),"Subtítulo " +(i+1)));
        }
        adaptador = new AdaptadorRecicler(datos);
        recView.setAdapter(adaptador);

        botonInsertar.setOnClickListener(view -> {
            int size = datos.size();
            datos.add(size,new Titular("Título "+(size+1),"Subtítulo " +(size+1)));
            adaptador = new AdaptadorRecicler(datos);
            recView.setAdapter(adaptador);
            Log.d("Se ha añadido un Título","");
        });

        botonEliminar.setOnClickListener(view -> {
            int size = datos.size();
            datos.remove(size-1);
            adaptador = new AdaptadorRecicler(datos);
            recView.setAdapter(adaptador);
            Log.d("Se eliminó el Título:",Integer.toString(size));
        });

        botonMover.setOnClickListener(view -> {
            int position1 = (int)(Math.random()*datos.size());
            int position2 = (int)(Math.random()*datos.size());
            System.out.println(position2);
            Titular prueba = datos.get(position1);
            datos.set(position1, datos.get(position2));
            datos.set(position2,prueba);
            adaptador = new AdaptadorRecicler(datos);
            recView.setAdapter(adaptador);
            Log.d("Se movió el Título:",Integer.toString(position1));
        });
    }
}