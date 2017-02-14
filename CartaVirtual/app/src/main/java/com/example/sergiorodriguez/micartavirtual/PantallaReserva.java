package com.example.sergiorodriguez.micartavirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PantallaReserva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_reserva);

        Spinner prueba = (Spinner) findViewById(R.id.tipoDocumento);
        //Creamos el adaptador
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.tipoDocumento,android.R.layout.simple_spinner_item);
        //Añadimos el layout para el menú
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Le indicamos al spinner el adaptador a usar
        prueba.setAdapter(adapter);
    }
}
