package com.example.myfirsappm07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Buttons_extendedLonious extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_check_lonious);

        CheckBox chkMarcam = findViewById(R.id.chkMarcam);
        CheckBox chk2 = findViewById(R.id.chk2);
        CheckBox chk3 = findViewById(R.id.chk3);
        Button submit = findViewById(R.id.submit);
        RadioGroup grbGrupo1 = findViewById(R.id.grbGrup1);
        RadioButton option1 = findViewById(R.id.rbOpcio1);
        RadioButton option2 = findViewById(R.id.rbOpcio2);
        RadioButton option3 = findViewById(R.id.rbOpcio3);
        RadioButton option4 = findViewById(R.id.rbOpcio4);

        chkMarcam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkMarcam.isChecked())
                    chkMarcam.setText("Checkbox marcat!");
                else
                    chkMarcam.setText("Checkbox desmarcat!");;
            }
        });
        chk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chk2.isChecked())
                    chk2.setText("QUE LA NOCHE SIN TI");
                else
                    chk2.setText("DUEEELE");
            }
        });
        chk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chk3.isChecked())
                    chk3.setText("Es bastante malo");
                else
                    chk3.setText("No es tan malo");
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkMarcam.isChecked()){
                    if(chk2.isChecked()){
                        if(chk3.isChecked())
                            SubmitAnswers.setResumen1(3);
                        else
                            SubmitAnswers.setResumen1(2);
                    }
                    else
                        if (chk3.isChecked())
                        SubmitAnswers.setResumen1(4);
                        else
                            SubmitAnswers.setResumen1(1);
                }
                else if(chk2.isChecked()){
                    SubmitAnswers.setResumen1(5);
                    if(chk3.isChecked()){
                        SubmitAnswers.setResumen1(6);
                    }
                }
                if (option1.isChecked()){
                    SubmitAnswers.setResumen2(1);
                }
                else if (option2.isChecked())
                    SubmitAnswers.setResumen2(2);
                else if (option3.isChecked())
                    SubmitAnswers.setResumen2(3);
                else if(option4.isChecked())
                    SubmitAnswers.setResumen2(4);
                Intent intent = new Intent(Buttons_extendedLonious.this,SubmitAnswers.class);
                startActivity(intent);
            }
        });
    }
}