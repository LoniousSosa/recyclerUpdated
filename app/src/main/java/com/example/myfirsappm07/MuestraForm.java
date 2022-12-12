package com.example.myfirsappm07;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MuestraForm extends AppCompatActivity {

    static String[] textos = new String[7];
    TextView[] textosReal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_form);
        textosReal = new TextView[]{findViewById(R.id.nombreMuestra), findViewById(R.id.cognomMuestra),
        findViewById(R.id.telefonoMuestra), findViewById(R.id.mailMuestra),
        findViewById(R.id.direccionMuestra), findViewById(R.id.spinner1Muestra),
        findViewById(R.id.spinner2Muestra)};
        for (int i = 0; i < textos.length; i++) {
            textosReal[i].setText(textos[i]);
        }
    }
}