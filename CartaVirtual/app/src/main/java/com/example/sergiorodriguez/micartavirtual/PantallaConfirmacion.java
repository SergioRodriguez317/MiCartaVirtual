package com.example.sergiorodriguez.micartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PantallaConfirmacion extends AppCompatActivity {

    PantallaReserva nombreCliente=new PantallaReserva();
    PantallaReserva documentoCliente=new PantallaReserva();
    PantallaReserva telefonoCliente=new PantallaReserva();
    PantallaReserva fechaReserva=new PantallaReserva();
    PantallaReserva horaReserva=new PantallaReserva();
    PantallaReserva cantidadPersonas=new PantallaReserva();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_confirmacion);
    }
    public void OnClickBotonAtras(View v){
        Intent intencion=new Intent(getApplicationContext(),PantallaReserva.class);
        startActivity(intencion);
    }
    public void OnClickBotonSalir(View v){
        System.exit(0);
    }

}
