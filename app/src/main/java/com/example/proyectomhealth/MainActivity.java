package com.example.proyectomhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Variables globales para procedimiento
    private int valor_pr1 = 0;
    private int valor_pr2 = 0;
    private int valor_pr3 = 0;
    private int valor_pr4 = 0;
    private int valor_pr5 = 0;
    private int valor_pr6 = 0;
    private int valor_pr7 = 0;

    //Variables globales para enfermedad
    private int valor_d1 = 0;
    private int valor_d2 = 0;
    private int valor_d3 = 0;
    private int valor_d4 = 0;
    private int valor_d5 = 0;
    private int valor_d6 = 0;


    //Variables globales para paciente
    private int valor_p1 = 0;
    private int valor_p2 = 0;
    private int valor_p3 = 0;
    private int valor_p4 = 0;
    private int valor_p5 = 0;
    private int valor_p6 = 0;
    private int valor_p7 = 0;
    private int valor_p8 = 0;

    // Variable global para el total de la suma

    private String Total = "";
    private String strSuma_pr="";
    private String strSuma_p="";
    private String strSuma_d="";

    // Variables globales para pasar a ventana de results
    private int suma_pr;
    private int suma_d;
    private int suma_p;
    private int Total_int;
    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);

        EdgeToEdge.enable(this);
        // La vista que queremos ver al correr la app
        setContentView(R.layout.activity_main);
        // declarar variable spinner con el nombre del spinner
        Spinner spinner_pr1 = findViewById(R.id.spinner_pr1);
        // Array de valores numéricos correspondientes a cada opción
        final int[] valores = {1, 2, 3, 4, 5};
        //TextView textresult= findViewById(R.id.textresultado);
        // Asociar metodos
        // Se le da una funcion a cada uno de los items de la lista
        // Al ponerle un listener a cada item, es necesario tener un AdapterView que es el que va permitir pasarle una lista
        spinner_pr1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView_pr1, View view, int position, long id) {
                String item_pr1 = adapterView_pr1.getItemAtPosition(position).toString();
                valor_pr1 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        String[] lista_pr1 = {"<=30 min", "31-60 min", "61-120 min", "121-180 min", ">=181 min"};
        ArrayAdapter<String> adapter_pr1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_pr1);
        adapter_pr1.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_pr1.setAdapter(adapter_pr1);


        //-------------------------------------------

        Spinner spinner_pr2 = findViewById(R.id.spinner_pr2);

        spinner_pr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_pr2, View view, int position, long id) {
                // Tipos del item
                String item_pr2 = adapterView_pr2.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_pr2 = valores[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_pr2 = {"Outpatient", "<23 hrs", "24-48 hrs", "<=3d", ">4d"};
        ArrayAdapter<String> adapter_pr2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_pr2);
        adapter_pr2.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_pr2.setAdapter(adapter_pr2);


        //-------------------------------------------
        Spinner spinner_pr3 = findViewById(R.id.spinner_pr3);

        spinner_pr3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_pr3, View view, int position, long id) {
                // Tipos del item
                String item_pr3 = adapterView_pr3.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_pr3 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_pr3 = {"Very Unlikely", "<5%", "5-10%", "11-25%", ">=25%"};
        ArrayAdapter<String> adapter_pr3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_pr3);
        adapter_pr3.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_pr3.setAdapter(adapter_pr3);

        //-------------------------------------------
        Spinner spinner_pr4 = findViewById(R.id.spinner_pr4);

        spinner_pr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_pr4, View view, int position, long id) {
                // Tipos del item
                String item_pr4 = adapterView_pr4.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_pr4 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_pr4 = {"<100cc", "101-250cc", "251-500cc", "501-750cc", ">=750cc"};
        ArrayAdapter<String> adapter_pr4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_pr4);
        adapter_pr4.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_pr4.setAdapter(adapter_pr4);


        //-------------------------------------------
        Spinner spinner_pr5 = findViewById(R.id.spinner_pr5);

        spinner_pr5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_pr5, View view, int position, long id) {
                // Tipos del item
                String item_pr5 = adapterView_pr5.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_pr5 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_pr5 = {"1", "2", "3", "4", "5"};
        ArrayAdapter<String> adapter_pr5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_pr5);
        adapter_pr5.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_pr5.setAdapter(adapter_pr5);


        //-------------------------------------------
        Spinner spinner_pr6 = findViewById(R.id.spinner_pr6);

        spinner_pr6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_pr6, View view, int position, long id) {
                // Tipos del item
                String item_pr6 = adapterView_pr6.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_pr6 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_pr6 = {"<=1", "1-5%", "6-10%", "11-25%", ">=25%"};
        ArrayAdapter<String> adapter_pr6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_pr6);
        adapter_pr6.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_pr6.setAdapter(adapter_pr6);

        //-------------------------------------------
        Spinner spinner_pr7 = findViewById(R.id.spinner_pr7);

        spinner_pr7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_pr7, View view, int position, long id) {
                // Tipos del item
                String item_pr7 = adapterView_pr7.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_pr7 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_pr7 = {"None", " MIS Surgery", "Infraumbilical", " Supraumbilical", "OHNS"};
        ArrayAdapter<String> adapter_pr7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_pr7);
        adapter_pr7.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_pr7.setAdapter(adapter_pr7);


        //-------------------------------------------
        Spinner spinner_d1 = findViewById(R.id.spinner_d1);

        spinner_d1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_d1, View view, int position, long id) {
                // Tipos del item
                String item_d1 = adapterView_d1.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_d1 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_d1 = {"None", "<40% ", "40-60%", " 60-95%", "available"};
        ArrayAdapter<String> adapter_d1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_d1);
        adapter_d1.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_d1.setAdapter(adapter_d1);


        //-------------------------------------------
        Spinner spinner_d2 = findViewById(R.id.spinner_d2);

        spinner_d2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_d2, View view, int position, long id) {
                // Tipos del item
                String item_d2 = adapterView_d2.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_d2 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_d2 = {"not applicable", "somewhat worse ", "Equivalent", " Somewhat better", "Significantly better"};
        ArrayAdapter<String> adapter_d2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_d2);
        adapter_d2.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_d2.setAdapter(adapter_d2);


        //-------------------------------------------
        Spinner spinner_d3 = findViewById(R.id.spinner_d3);

        spinner_d3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_d3, View view, int position, long id) {
                // Tipos del item
                String item_d3 = adapterView_d3.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_d3 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_d3 = {"Significantly worse", " worse ", "Moderately worse", " Slightly worse", "Minimally worse"};
        ArrayAdapter<String> adapter_d3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_d3);
        adapter_d3.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_d3.setAdapter(adapter_d3);

        //-------------------------------------------
        Spinner spinner_d4 = findViewById(R.id.spinner_d4);

        spinner_d4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_d4, View view, int position, long id) {
                // Tipos del item
                String item_d4 = adapterView_d4.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_d4 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_d4 = {"Significantly worse", " worse ", "Moderately worse", " Slightly worse", "Minimally worse"};
        ArrayAdapter<String> adapter_d4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_d4);
        adapter_d4.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_d4.setAdapter(adapter_d4);


        //-------------------------------------------
        Spinner spinner_d5 = findViewById(R.id.spinner_d5);

        spinner_d5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_d5, View view, int position, long id) {
                // Tipos del item
                String item_d5 = adapterView_d5.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_d5 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_d5 = {"Significantly worse", " worse ", "Moderately worse", " Slightly worse", "Minimally worse"};
        ArrayAdapter<String> adapter_d5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_d5);
        adapter_d5.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_d5.setAdapter(adapter_d5);


        //-------------------------------------------
        Spinner spinner_d6 = findViewById(R.id.spinner_d6);

        spinner_d6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_d6, View view, int position, long id) {
                // Tipos del item
                String item_d6 = adapterView_d6.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_d6 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_d6 = {"Significantly worse", " worse ", "Moderately worse", " Slightly worse", "Minimally worse"};
        ArrayAdapter<String> adapter_d6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_d6);
        adapter_d6.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_d6.setAdapter(adapter_d6);


        //-------------------------------------------
        Spinner spinner_p1 = findViewById(R.id.spinner_p1);

        spinner_p1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_p1, View view, int position, long id) {
                // Tipos del item
                String item_p1 = adapterView_p1.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_p1 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_p1 = {"<20 years", " 21-40 years ", "41-50 years", " 51-65 years", ">65 years"};
        ArrayAdapter<String> adapter_p1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_p1);
        adapter_p1.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_p1.setAdapter(adapter_p1);


        //-------------------------------------------
        Spinner spinner_p2 = findViewById(R.id.spinner_p2);

        spinner_p2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_p2, View view, int position, long id) {
                // Tipos del item
                String item_p2 = adapterView_p2.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_p2 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_p2 = {"None", " - ", "-", "Minimal (rare inhaler) ", "> Minimal"};
        ArrayAdapter<String> adapter_p2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_p2);
        adapter_p2.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_p2.setAdapter(adapter_p2);


        //-------------------------------------------
        Spinner spinner_p3 = findViewById(R.id.spinner_p3);

        spinner_p3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_p3, View view, int position, long id) {
                // Tipos del item
                String item_p3 = adapterView_p3.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_p3 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_p3 = {"Not present", " - ", "-", "Mild/Moderate (no CPAP) ", "On CPAP"};
        ArrayAdapter<String> adapter_p3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_p3);
        adapter_p3.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_p3.setAdapter(adapter_p3);


        //-------------------------------------------
        Spinner spinner_p4 = findViewById(R.id.spinner_p4);

        spinner_p4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_p4, View view, int position, long id) {
                // Tipos del item
                String item_p4 = adapterView_p4.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_p4 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_p4 = {"None", " Minimal (no meds) ", "Mild (≤ 1 med)", "Moderate (2 meds) ", "Severe (≥ 3 meds)"};
        ArrayAdapter<String> adapter_p4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_p4);
        adapter_p4.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_p4.setAdapter(adapter_p4);


        //-------------------------------------------
        Spinner spinner_p5 = findViewById(R.id.spinner_p5);

        spinner_p5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_p5, View view, int position, long id) {
                // Tipos del item
                String item_p5 = adapterView_p5.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_p5 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_p5 = {"None", " - ", "Mild (no meds)", "Moderate (PO meds only) ", "moderate (insulin)"};
        ArrayAdapter<String> adapter_p5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_p5);
        adapter_p5.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_p5.setAdapter(adapter_p5);


        //-------------------------------------------
        Spinner spinner_p6 = findViewById(R.id.spinner_p6);

        spinner_p6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_p6, View view, int position, long id) {
                // Tipos del item
                String item_p6 = adapterView_p6.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_p6 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_p6 = {"No", " - ", "-", "Moderate", "Severe"};
        ArrayAdapter<String> adapter_p6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_p6);
        adapter_p6.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_p6.setAdapter(adapter_p6);


        //-------------------------------------------
        Spinner spinner_p7 = findViewById(R.id.spinner_p7);

        spinner_p7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_p7, View view, int position, long id) {
                // Tipos del item
                String item_p7 = adapterView_p7.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_p7 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_p7 = {"None(Asymptomatic)", " - ", "-", "-", "Yes"};
        ArrayAdapter<String> adapter_p7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_p7);
        adapter_p7.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_p7.setAdapter(adapter_p7);


        //-------------------------------------------
        Spinner spinner_p8 = findViewById(R.id.spinner_p8);

        spinner_p8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView_p8, View view, int position, long id) {
                // Tipos del item
                String item_p8 = adapterView_p8.getItemAtPosition(position).toString(); // Se debe pasar a string porque arriba estoy diciento que es un int
                valor_p8 = valores[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String[] lista_p8 = {"No", " Probably Not ", "Possibly", "Probably", "Yes"};
        ArrayAdapter<String> adapter_p8 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista_p8);
        adapter_p8.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner_p8.setAdapter(adapter_p8);

        findViewById(R.id.buttonMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SumaTotal();
                irAResults();

            }
        });
    }
    private void SumaTotal() {

        int suma_pr=valor_pr1+valor_pr2+valor_pr3+valor_pr4+valor_pr5+valor_pr6+valor_pr7;
        int suma_d=valor_d1+valor_d2+valor_d3+valor_d4+valor_d5+valor_d6;
        int suma_p = valor_p1+valor_p2+valor_p3+valor_p4+valor_p5+valor_p6+valor_p7+valor_p8;
        int Total_int= suma_pr+suma_d+suma_p;
        Total = String.valueOf(Total_int);
        strSuma_pr= String.valueOf(suma_pr);
        strSuma_p= String.valueOf(suma_p);
        strSuma_d= String.valueOf(suma_d);
    }
    public void irAResults() {
        // Obtén el valor del EditText
        EditText UpperTextNumber = findViewById(R.id.UpperTextNumber);
        String Upnumero = UpperTextNumber.getText().toString();
        EditText LowerTextNumber = findViewById(R.id.LowerTextNumber);
        String Lnumero = LowerTextNumber.getText().toString();


        // Crea un Intent para iniciar la Activity2
        Intent intent = new Intent(this, Results.class);
        // Agrega el valor del número como extra al Intent
        intent.putExtra("numero_extraUp", Upnumero);
        intent.putExtra("numero_extraL", Lnumero);
        intent.putExtra("SumaTotal", Total);
        intent.putExtra("pr", strSuma_pr);
        intent.putExtra("p", strSuma_p);
        intent.putExtra("d", strSuma_d);

        // Inicia Results
        startActivity(intent);
    }
}
