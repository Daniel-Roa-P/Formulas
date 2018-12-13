package com.example.danbr.formulas.Principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import com.example.danbr.formulas.Formulas.Campo;
import com.example.danbr.formulas.Formulas.Cuadratica;
import com.example.danbr.formulas.Formulas.Distancia;
import com.example.danbr.formulas.Formulas.EnergiaCinetica;
import com.example.danbr.formulas.Formulas.EnergiaPotencia;
import com.example.danbr.formulas.Formulas.FuerzaE;
import com.example.danbr.formulas.Formulas.FuerzaNewton;
import com.example.danbr.formulas.Formulas.IntegracionPartes;
import com.example.danbr.formulas.Formulas.Series;
import com.example.danbr.formulas.Formulas.Trabajo;
import com.example.danbr.formulas.Formulas.Velocidad;
import com.example.danbr.formulas.R;
import com.example.danbr.formulas.Formulas.Ecuaciones;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private ImageView imagen;
    private Ecuaciones e;

    private void liskov(Ecuaciones f){

        f.setCadena();
        this.e=f;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.lista);
        String[] formulas = {"Campo Electrico","Cuadratica","Distancia","Energia cinetica","Energia Potencial","Fuerza (2 ley de Newton)","Fuerza (electrica)","Integracion por partes","Series de Taylor","Trabajo","Velocidad"};
        lista.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, formulas));

        imagen = (ImageView)findViewById(R.id.imageView2);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    liskov(new Campo());

                    System.out.print("spj");
                } else if (position == 1) {
                    liskov(new Cuadratica());
                } else if (position == 2) {
                    liskov(new Distancia());
                } else if (position == 3) {
                    liskov(new EnergiaCinetica());
                } else if (position == 4) {
                    liskov(new EnergiaPotencia());
                } else if (position == 5) {
                    liskov(new FuerzaNewton());
                } else if (position == 6) {
                    liskov(new FuerzaE());
                } else if (position == 7) {
                    liskov(new IntegracionPartes());
                } else if (position == 8) {
                    liskov(new Series());
                } else if (position == 9) {
                    liskov(new Trabajo());
                } else if (position == 10) {
                    liskov(new Velocidad());
                }
                System.out.println(e.getCadena());
                System.out.println(position);

                int idImagen = getResources().getIdentifier("com.example.danbr.formulas:mipmap/" + e.getCadena(), null, null);

                imagen.setImageResource(idImagen);

            }
        });

    }
}
