package com.example.hp.unimap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by hp on 19/04/2017.
 */

public class MenuProfe extends AppCompatActivity {

    Button button_mapa;
    Button button_horario;
    Button button_notificacion;
    Button button_ayuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_profe);

        final Animation anim_alpha= AnimationUtils.loadAnimation(this,R.anim.anim_alpha);

        button_mapa = (Button) findViewById(R.id.button_mapa);
        button_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutar_mapa();
                view.startAnimation(anim_alpha);
            }
        });



        button_notificacion = (Button) findViewById(R.id.button_notificacion);
        button_notificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutar_notificacion();
                view.startAnimation(anim_alpha);
            }
        });


        button_ayuda = (Button) findViewById(R.id.button_ayuda);
        button_ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutar_ayuda();
                view.startAnimation(anim_alpha);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(android.view.Menu mimenu) {

        getMenuInflater().inflate(R.menu.menu_en_activity, mimenu);

        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu) {

        switch (opcion_menu.getItemId()) {
            case R.id.modouso:
                return true;
            case R.id.menu_normal:
                if (opcion_menu.isChecked()) opcion_menu.setChecked(false);
                else opcion_menu.setChecked(true);
                Toast.makeText(this, "Modo Normal Elegido", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.salirapp:
                finish();
                Toast.makeText(this, "Sesion Finalizada", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(opcion_menu);

        }
    }

    public void ejecutar_mapa() {

        Intent i = new Intent(this, com.example.hp.unimap.Mapa.class);
        startActivity(i);

    }


    public void ejecutar_notificacion() {

        Intent i = new Intent(this,  com.example.hp.unimap.NotificacionProfe.class);
        startActivity(i);
    }


    public void ejecutar_ayuda() {

        Intent i = new Intent(this, com.example.hp.unimap.AyudaUsua.class);
        startActivity(i);
    }
}


