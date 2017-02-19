package com.example.sergiorodriguez.micartavirtual;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import static com.example.sergiorodriguez.micartavirtual.R.id.telefono;

public class PantallaPrincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void OnClickBotonMenu(View v) {
        Intent intencion = new Intent(getApplicationContext(), PantallaMenu.class);
        startActivity(intencion);
    }

    public void OnClickBotonUbicacion(View v) {
        Intent intencion = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(intencion);
    }

    public void OnClickBotonReserva(View v) {
        Intent intencion = new Intent(getApplicationContext(), PantallaReserva.class);
        startActivity(intencion);
    }

    public void OnClickLlamar(View v) {
        // Intent i = new Intent(android.content.Intent.ACTION_CALL,
        // Uri.parse("tel:+3748593458"));
        Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                Uri.parse("tel:+571234567")); //Se pone el teléfono al que se va a llamar
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pantalla_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_ubicacion) {
            Intent intencion=new Intent(getApplicationContext(),MapsActivity.class);
            startActivity(intencion);
            // Handle the camera action
        } else if (id == R.id.nav_menu) {
            Intent intencion=new Intent(getApplicationContext(),PantallaMenu.class);
            startActivity(intencion);

        } else if (id == R.id.nav_reserva) {
            Intent intencion=new Intent(getApplicationContext(),PantallaReserva.class);
            startActivity(intencion);

        } else if (id == R.id.nav_ayuda) {

        } else if (id == R.id.nav_tripadvisor) {
            Uri uri = Uri.parse("http://www.tripadvisor.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        } else if (id == R.id.nav_facebook) {
            Uri uri = Uri.parse("http://www.facebook.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        } else if (id == R.id.nav_youtube) {
            Uri uri = Uri.parse("http://www.youtube.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
