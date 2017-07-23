package com.example.hp.unimap;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by hp on 20/02/2017.
 */

public class AyudaAdmi extends Activity {

    Button button_descargar_manual_usuario;
    Button button_descargar_manual_sistema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda_admi);

        final Animation anim_alpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        button_descargar_manual_usuario = (Button) findViewById(R.id.button_descargar_manual_usuario);
        button_descargar_manual_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                descargar_manual_usuario();
                view.startAnimation(anim_alpha);
            }
        });

        button_descargar_manual_sistema = (Button) findViewById(R.id.button_descargar_manual_sistema);
        button_descargar_manual_sistema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                descargar_manual_sistema();
                view.startAnimation(anim_alpha);
            }
        });

    }

    public void descargar_manual_usuario() {


        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0BwjModVpYKTmR3VkaGN3MGVLTWM/view?usp=sharing"));
        startActivity(i);

        Toast.makeText(this, "Descargando Manual de Usuario", Toast.LENGTH_SHORT).show();

    }

    public void descargar_manual_sistema() {


        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0BwjModVpYKTmRzRHMEtFZ2ZKZWM/view?usp=sharing"));
        startActivity(i);

        Toast.makeText(this, "Descargando Manual de Sistema", Toast.LENGTH_SHORT).show();

    }


}

