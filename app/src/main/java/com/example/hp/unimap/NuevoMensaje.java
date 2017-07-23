package com.example.hp.unimap;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by hp on 03/03/2017.
 */

public class NuevoMensaje extends Activity {

    String[] items = {"Auditoria de Sistemas", "Ética y Deontología", "Pasantía I", "Programación II"};
    Spinner spinner1;
    EditText editText_descripcion;

    Button button_enviar_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nuevo_mensaje);

        spinner1 = (Spinner) findViewById(R.id.spinner1);

        editText_descripcion=(EditText)findViewById(R.id.editText_descripcion);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        final Animation anim_alpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        button_enviar_mensaje = (Button) findViewById(R.id.button_enviar_mensaje);
        button_enviar_mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar_motivo();
                view.startAnimation(anim_alpha);
            }
        });
    }

    public void enviar_motivo() {

        String dato1= editText_descripcion.getText().toString();

       if(TextUtils.isEmpty(dato1))
        {
            editText_descripcion.setError("Por Favor Ingrese su Motivo");
            editText_descripcion.requestFocus();
            Toast.makeText(this, "Mensaje no Enviado", Toast.LENGTH_SHORT).show();
        }else{

           Toast.makeText(this, "Mensaje Enviado", Toast.LENGTH_SHORT).show();
       }

        }
    }
