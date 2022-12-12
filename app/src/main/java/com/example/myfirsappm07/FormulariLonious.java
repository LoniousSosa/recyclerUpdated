package com.example.myfirsappm07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class FormulariLonious extends AppCompatActivity {

    ListView simpleListView;
    Spinner spinner;
    String text;
    String[] courseList = {"Adria","Quedate","Computer Science","Tomate"};
    EditText[] inputs;
    Button muestra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulari_lonious);
        simpleListView = findViewById(R.id.spinTextList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.item_view, R.id.itemTextView, courseList);
        simpleListView.setAdapter(arrayAdapter);

        spinner = findViewById(R.id.spin);
        ArrayAdapter<CharSequence> arrayAdapter2 =
                ArrayAdapter.createFromResource(this,R.array.valors_array,
                        android.R.layout.simple_spinner_item);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter2);

        inputs = new EditText[]{findViewById(R.id.nom),findViewById(R.id.cognomLayout),
                findViewById(R.id.telLayout), findViewById(R.id.mailLayout),
                findViewById(R.id.direccionLayout)};

        muestra = findViewById(R.id.buttonForm);

        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                text = String.valueOf(adapterView.getItemAtPosition(position));
                MuestraForm.textos[5] = text;
            }
        });

        muestra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 5; i++) {
                    MuestraForm.textos[i] = String.valueOf(inputs[i].getText());
                }
                text = spinner.getSelectedItem().toString();
                System.out.println(text);
                MuestraForm.textos[6] = text;
                Intent intent = new Intent(FormulariLonious.this,MuestraForm.class);
                startActivity(intent);
            }
        });
    }
}