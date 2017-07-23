package com.example.hp.unimap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by hp on 09/03/2017.
 */

public class DetalleMensajeDecano extends Activity {

    Button button_aceptar_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_mensaje_decano);

        final Animation anim_alpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        button_aceptar_mensaje = (Button) findViewById(R.id.button_aceptar_mensaje);
        button_aceptar_mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aceptar_motivo();
                view.startAnimation(anim_alpha);
            }
        });

    }

    public void aceptar_motivo(){


        Toast.makeText(this, "Motivo Aceptado", Toast.LENGTH_SHORT).show();


    }

}
