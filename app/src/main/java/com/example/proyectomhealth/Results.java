package com.example.proyectomhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        String suma = getIntent().getStringExtra("SumaTotal");
        TextView TotalMents = findViewById(R.id.TotalMeNTSScore);
        TotalMents.setText(suma);

        String suma_pr = getIntent().getStringExtra("pr");
        TextView Totalpr = findViewById(R.id.ProcedureScore);
        Totalpr.setText(suma_pr);

        String suma_p = getIntent().getStringExtra("p");
        TextView Totalp = findViewById(R.id.PatientScore);
        Totalp.setText(suma_p);

        String suma_d = getIntent().getStringExtra("d");
        TextView Totalpd = findViewById(R.id.DiseaseScore);
        Totalpd.setText(suma_d);

        findViewById(R.id.buttonMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain();

            }
        });
    }

    private void goToMain(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}