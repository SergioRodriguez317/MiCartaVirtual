package com.example.sergiorodriguez.micartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PantallaConfirmacion extends AppCompatActivity {

    TextView nombreCliente,documento,telefono,fecha,hora,cantidad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_confirmacion);

        nombreCliente=(TextView)findViewById(R.id.nombreCliente);
        documento=(TextView) findViewById(R.id.documentoCliente);
        telefono=(TextView) findViewById(R.id.telefonoCliente);
        fecha=(TextView) findViewById(R.id.fechaReserva);
        hora=(TextView) findViewById(R.id.horaReserva);
        cantidad=(TextView) findViewById(R.id.cantidadPersonas);

        Intent intencion=getIntent();
        Bundle extras=intencion.getExtras();

        if(extras!=null)
        {
            String datoNombre=extras.getString("DATO");
            String datoDocumento=extras.getString("DatoDocumento");
            String datoTelefono=extras.getString("DatoTelefono");
            String datoFecha=extras.getString("DatoFecha");
            String datoHora=extras.getString("DatoHora");
            String datoCantidad=extras.getString("DatoCantidad");
            nombreCliente.setText(datoNombre);
            documento.setText(datoDocumento);
            telefono.setText(datoTelefono);
            fecha.setText(datoFecha);
            hora.setText(datoHora);
            cantidad.setText(datoCantidad);

        }
    }
    public void OnClickBotonAtras(View v){
        Intent intencion=new Intent(getApplicationContext(),PantallaReserva.class);
        startActivity(intencion);
    }
    public void OnClickBotonSalir(View v){
        System.exit(0);
    }

}
