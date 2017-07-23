package com.example.hp.unimap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_ingresar;
    EditText editText_correo;
    EditText editText_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio_sesion();
    }


    public void inicio_sesion(){

        final Animation anim_alpha= AnimationUtils.loadAnimation(this,R.anim.anim_alpha);

        editText_correo=(EditText)findViewById(R.id.editText_correo);
        editText_contraseña=(EditText)findViewById(R.id.editText_contraseña);
        button_ingresar = (Button) findViewById(R.id.button_ingresar);



        button_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String dato = editText_correo.getText().toString();

                if (dato.equals("admin") && editText_contraseña.getText().toString().equals("123")) {
                    Intent i = new Intent(MainActivity.this, SplashScreenAdmi.class);
                    ((EditText) findViewById(R.id.editText_contraseña)).getText().clear();
                    i.putExtra("admin", dato);
                    startActivity(i);
                    view.startAnimation(anim_alpha);

                } else if (dato.equals("deca") && editText_contraseña.getText().toString().equals("123")) {
                    Intent i = new Intent(MainActivity.this, SplashScreenDeca.class);
                    ((EditText) findViewById(R.id.editText_contraseña)).getText().clear();
                    i.putExtra("decano", dato);
                    startActivity(i);
                    view.startAnimation(anim_alpha);

                } else if (dato.equals("vblanco.8329@unimar.edu.ve") && editText_contraseña.getText().toString().equals("123")) {
                    Intent i = new Intent(MainActivity.this, SplashScreenEstu.class);
                    ((EditText) findViewById(R.id.editText_contraseña)).getText().clear();
                    i.putExtra("estudiante", dato);
                    startActivity(i);
                    view.startAnimation(anim_alpha);
                } else if (dato.equals("vice") && editText_contraseña.getText().toString().equals("123")) {
                    Intent i = new Intent(MainActivity.this, SplashScreenSupe.class);
                    ((EditText) findViewById(R.id.editText_contraseña)).getText().clear();
                    i.putExtra("superior", dato);
                    startActivity(i);
                    view.startAnimation(anim_alpha);
                } else if (dato.equals("rector") && editText_contraseña.getText().toString().equals("123")) {
                    Intent i = new Intent(MainActivity.this, SplashScreenSupe.class);
                    ((EditText) findViewById(R.id.editText_contraseña)).getText().clear();
                    i.putExtra("superior", dato);
                    startActivity(i);
                    view.startAnimation(anim_alpha);

                } else if (dato.equals("profe") && editText_contraseña.getText().toString().equals("123")) {
                    Intent i = new Intent(MainActivity.this, SplashScreenProfe.class);
                    ((EditText) findViewById(R.id.editText_contraseña)).getText().clear();
                    i.putExtra("profesor", dato);
                    startActivity(i);
                    view.startAnimation(anim_alpha);

                } else {

                    validar_campos_vacios();
                    Toast.makeText(MainActivity.this, "Usuario No Encontrado", Toast.LENGTH_SHORT).show();


                }

            }
        });

    }

    public void validar_campos_vacios(){

        String dato1= editText_correo.getText().toString();
        String dato2= editText_contraseña.getText().toString();
        if(TextUtils.isEmpty(dato1))
        {
            editText_correo.setError("Por Favor Ingrese su Correo");
            editText_correo.requestFocus();
        }
        else  if(TextUtils.isEmpty(dato2))
        {
            editText_contraseña.setError("Por Favor Ingrese su Contraseña");
            editText_contraseña.requestFocus();


        }

    }
}