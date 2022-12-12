package com.example.myfirsappm07;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubmitAnswers extends AppCompatActivity {
    static int resumen1;
    static int resumen2;
    TextView resumenText1;
    TextView resumenText2;

    public static int getResumen2() {
        return resumen2;
    }

    public static void setResumen2(int resumen2) {
        SubmitAnswers.resumen2 = resumen2;
    }

    public static int getResumen1() {
        return resumen1;
    }

    public static void setResumen1(int resumen1) {
        SubmitAnswers.resumen1 = resumen1;
    }

    //Vaya código espagueti mas guarro, me da asco
    public void changeTextResumen(){
        if(resumen1 ==1){
            resumenText1.setText(getString(R.string.marcam));
        }
        else if(resumen1 ==2){
            resumenText1.setText(getString(R.string.marcam) +"\n"+getString(R.string.ami));
        }
        else if(resumen1==3){
            resumenText1.setText(getString(R.string.marcam) +"\n"+
                    getString(R.string.ami) + "\n" +getString(R.string.goz));
        }
        else if(resumen1==4){
            resumenText1.setText(getString(R.string.marcam) +"\n"+getString(R.string.goz));
        }
        else if(resumen1==5){
            resumenText1.setText(getString(R.string.ami));
        }
        else if(resumen1==6){
            resumenText1.setText(getString(R.string.marcam) +"\n"+getString(R.string.ami));
        }
        else {
            resumenText1.setText("No has escogido ninguno.");
        }

        if(resumen2==1){
            resumenText2.setText(getString(R.string.opcio1));
        }
        else if(resumen2==2){
            resumenText2.setText(getString(R.string.opcio2));
        }
        else if(resumen2==3){
            resumenText2.setText(getString(R.string.opcio3));
        }
        else if(resumen2==4){
            resumenText2.setText(getString(R.string.opcio4));
        }
        else{
            resumenText2.setText("No has escogido ninguno.");
        }
        resumen1=0;
        resumen2=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_answers);
        resumenText1 = findViewById(R.id.resumenText1);
        resumenText2 = findViewById(R.id.resumenText2);
        changeTextResumen();
    }
}