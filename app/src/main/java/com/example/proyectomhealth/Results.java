package com.example.proyectomhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        // Obtén el valor del extra del Intent
        String Upnumero = getIntent().getStringExtra("numero_extraUp");
        // Obtén el TextView en la Activity2
        TextView Umbral_alto = findViewById(R.id.Umbral_alto);
        // Establece el valor del número en el TextView
        Umbral_alto.setText(Upnumero);
        String Lnumero = getIntent().getStringExtra("numero_extraL");
        // Obtén el TextView en la Activity2
        TextView umbral_bajo = findViewById(R.id.umbral_bajo);
        // Establece el valor del número en el TextView
        umbral_bajo.setText(Lnumero);
    }
}