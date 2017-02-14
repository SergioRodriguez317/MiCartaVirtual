package com.example.sergiorodriguez.micartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PantallaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_menu);
    }

    public void OnClickBotonDesayunos(View v){
        Intent intencion=new Intent(getApplicationContext(),MenuDesayuno.class);
        startActivity(intencion);
    }
    public void OnClickBotonAlmuerzos(View v){
        Intent intencion=new Intent(getApplicationContext(),MenuAlmuerzo.class);
        startActivity(intencion);
    }
    public void OnClickMenuComidas(View v){
        Intent intencion=new Intent(getApplicationContext(),MenuComida.class);
        startActivity(intencion);
    }
    public void OnClickMenuBebidas(View v){
        Intent intencion=new Intent(getApplicationContext(),MenuBebida.class);
        startActivity(intencion);
    }
}
