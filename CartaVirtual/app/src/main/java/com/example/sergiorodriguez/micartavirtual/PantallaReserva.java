package com.example.sergiorodriguez.micartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PantallaReserva extends AppCompatActivity {

    EditText texto_Nombre,documento,telefono,fecha,hora,cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_reserva);

        texto_Nombre=(EditText)findViewById(R.id.texto_Nombre);
        documento=(EditText)findViewById(R.id.numeroDocumento);
        fecha=(EditText)findViewById(R.id.fechaReserva);
        hora=(EditText)findViewById(R.id.horaReserva);
        telefono=(EditText)findViewById(R.id.telefono);
        cantidad=(EditText)findViewById(R.id.cantidadPersonas);

        Spinner prueba = (Spinner) findViewById(R.id.tipoDocumento);
        //Creamos el adaptador
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.tipoDocumento,android.R.layout.simple_spinner_item);
        //Añadimos el layout para el menú
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Le indicamos al spinner el adaptador a usar
        prueba.setAdapter(adapter);
    }

    public void OnClickBotonSalir(View v){
        Intent intencion=new Intent(getApplicationContext(),PantallaPrincipal.class);
        startActivity(intencion);
    }
    public void OnClickBotonConfirmar(View v){

        String datoNombre=texto_Nombre.getText().toString();
        String datoDocumento=documento.getText().toString();
        String datoFecha=fecha.getText().toString();
        String datoHora=hora.getText().toString();
        String datoTelefono=telefono.getText().toString();
        String datoCantidad=cantidad.getText().toString();
        Intent intencion=new Intent(getApplicationContext(),PantallaConfirmacion.class);
        intencion.putExtra("DATO",datoNombre);
        intencion.putExtra("DatoDocumento",datoDocumento);
        intencion.putExtra("DatoFecha",datoFecha);
        intencion.putExtra("DatoHora",datoHora);
        intencion.putExtra("DatoTelefono",datoTelefono);
        intencion.putExtra("DatoCantidad",datoCantidad);
        startActivity(intencion);
    }
}
