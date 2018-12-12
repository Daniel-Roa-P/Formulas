package com.example.danbr.formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.lista);
        String[] formulas = {"Cuadratica","Integracion por partes","Fuerza","Velocidad","Distancia","Campo electrico","Torque"};
        lista.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, formulas));



    }
}
