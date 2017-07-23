package com.example.hp.unimap;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hp on 20/02/2017.
 */

public class Horario extends Activity {

    TextView Fila1_lunes;
    TextView Fila1_martes;
    TextView Fila1_miercoles;
    TextView Fila1_jueves;
    TextView Fila1_viernes;
    TextView Fila1_sabado;
    TextView Fila2_lunes;
    TextView Fila2_martes;
    TextView Fila2_miercoles;
    TextView Fila2_jueves;
    TextView Fila2_viernes;
    TextView Fila2_sabado;
    TextView Fila3_lunes;
    TextView Fila3_martes;
    TextView Fila3_miercoles;
    TextView Fila3_jueves;
    TextView Fila3_viernes;
    TextView Fila3_sabado;
    TextView Fila4_lunes;
    TextView Fila4_martes;
    TextView Fila4_miercoles;
    TextView Fila4_jueves;
    TextView Fila4_viernes;
    TextView Fila4_sabado;
    TextView Fila5_lunes;
    TextView Fila5_martes;
    TextView Fila5_miercoles;
    TextView Fila5_jueves;
    TextView Fila5_viernes;
    TextView Fila5_sabado;
    TextView Fila6_lunes;
    TextView Fila6_martes;
    TextView Fila6_miercoles;
    TextView Fila6_jueves;
    TextView Fila6_viernes;
    TextView Fila6_sabado;
    TextView Fila7_lunes;
    TextView Fila7_martes;
    TextView Fila7_miercoles;
    TextView Fila7_jueves;
    TextView Fila7_viernes;
    TextView Fila7_sabado;
    TextView Fila8_lunes;
    TextView Fila8_martes;
    TextView Fila8_miercoles;
    TextView Fila8_jueves;
    TextView Fila8_viernes;
    TextView Fila8_sabado;
    TextView Fila9_lunes;
    TextView Fila9_martes;
    TextView Fila9_miercoles;
    TextView Fila9_jueves;
    TextView Fila9_viernes;
    TextView Fila9_sabado;
    TextView Fila10_lunes;
    TextView Fila10_martes;
    TextView Fila10_miercoles;
    TextView Fila10_jueves;
    TextView Fila10_viernes;
    TextView Fila10_sabado;
    TextView Fila11_lunes;
    TextView Fila11_martes;
    TextView Fila11_miercoles;
    TextView Fila11_jueves;
    TextView Fila11_viernes;
    TextView Fila11_sabado;
    TextView Fila12_lunes;
    TextView Fila12_martes;
    TextView Fila12_miercoles;
    TextView Fila12_jueves;
    TextView Fila12_viernes;
    TextView Fila12_sabado;
    TextView Fila13_lunes;
    TextView Fila13_martes;
    TextView Fila13_miercoles;
    TextView Fila13_jueves;
    TextView Fila13_viernes;
    TextView Fila13_sabado;
    TextView Fila14_lunes;
    TextView Fila14_martes;
    TextView Fila14_miercoles;
    TextView Fila14_jueves;
    TextView Fila14_viernes;
    TextView Fila14_sabado;
    TextView Fila15_lunes;
    TextView Fila15_martes;
    TextView Fila15_miercoles;
    TextView Fila15_jueves;
    TextView Fila15_viernes;
    TextView Fila15_sabado;
    TextView Fila16_lunes;
    TextView Fila16_martes;
    TextView Fila16_miercoles;
    TextView Fila16_jueves;
    TextView Fila16_viernes;
    TextView Fila16_sabado;
    TextView Fila17_lunes;
    TextView Fila17_martes;
    TextView Fila17_miercoles;
    TextView Fila17_jueves;
    TextView Fila17_viernes;
    TextView Fila17_sabado;
    TextView Fila18_lunes;
    TextView Fila18_martes;
    TextView Fila18_miercoles;
    TextView Fila18_jueves;
    TextView Fila18_viernes;
    TextView Fila18_sabado;
    TextView Fila1_codigo;
    TextView Fila1_asignatura;
    TextView Fila1_seccion;
    TextView Fila1_turno;
    TextView Fila2_codigo;
    TextView Fila2_asignatura;
    TextView Fila2_seccion;
    TextView Fila2_turno;
    TextView Fila3_codigo;
    TextView Fila3_asignatura;
    TextView Fila3_seccion;
    TextView Fila3_turno;
    TextView Fila4_codigo;
    TextView Fila4_asignatura;
    TextView Fila4_seccion;
    TextView Fila4_turno;
    TextView Fila5_codigo;
    TextView Fila5_asignatura;
    TextView Fila5_seccion;
    TextView Fila5_turno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horario_menu);


        Fila1_codigo = (TextView) findViewById(R.id.Fila1_codigo);
        Fila1_asignatura = (TextView) findViewById(R.id.Fila1_asignatura);
        Fila1_seccion = (TextView) findViewById(R.id.Fila1_seccion);
        Fila1_turno = (TextView) findViewById(R.id.Fila1_turno);

        Fila2_codigo = (TextView) findViewById(R.id.Fila2_codigo);
        Fila2_asignatura = (TextView) findViewById(R.id.Fila2_asignatura);
        Fila2_seccion = (TextView) findViewById(R.id.Fila2_seccion);
        Fila2_turno = (TextView) findViewById(R.id.Fila2_turno);

        Fila3_codigo = (TextView) findViewById(R.id.Fila3_codigo);
        Fila3_asignatura = (TextView) findViewById(R.id.Fila3_asignatura);
        Fila3_seccion = (TextView) findViewById(R.id.Fila3_seccion);
        Fila3_turno = (TextView) findViewById(R.id.Fila3_turno);

        Fila4_codigo = (TextView) findViewById(R.id.Fila4_codigo);
        Fila4_asignatura = (TextView) findViewById(R.id.Filas4_asignatura);
        Fila4_seccion = (TextView) findViewById(R.id.Fila4_seccion);
        Fila4_turno = (TextView) findViewById(R.id.Fila4_turno);

        Fila5_codigo = (TextView) findViewById(R.id.Fila5_codigo);
        Fila5_asignatura = (TextView) findViewById(R.id.Fila5_asignatura);
        Fila5_seccion = (TextView) findViewById(R.id.Fila5_seccion);
        Fila5_turno = (TextView) findViewById(R.id.Fila5_turno);



        String dato=Fila1_codigo.getText().toString();
        Fila1_codigo.setText(dato);

        String dato2 =Fila1_asignatura.getText().toString();
        Fila1_asignatura.setText(dato2);

        String dato3 =Fila1_seccion.getText().toString();
        Fila1_seccion.setText(dato3);

        String dato4 =Fila1_turno.getText().toString();
        Fila1_turno.setText(dato4);


        String dato5=Fila2_codigo.getText().toString();
        Fila2_codigo.setText(dato5);

        String dato6=Fila2_asignatura.getText().toString();
        Fila2_asignatura.setText(dato6);

        String dato7 =Fila2_seccion.getText().toString();
        Fila2_seccion.setText(dato7);

        String dato8 =Fila2_turno.getText().toString();
        Fila2_turno.setText(dato8);


        String dato9=Fila3_codigo.getText().toString();
        Fila3_codigo.setText(dato9);

        String dato10=Fila3_asignatura.getText().toString();
        Fila3_asignatura.setText(dato10);

        String dato11 =Fila3_seccion.getText().toString();
        Fila3_seccion.setText(dato11);

        String dato12 =Fila3_turno.getText().toString();
        Fila3_turno.setText(dato12);

        String dato13=Fila4_codigo.getText().toString();
        Fila4_codigo.setText(dato13);

        String dato14=Fila4_asignatura.getText().toString();
        Fila4_asignatura.setText(dato14);

        String dato15 =Fila4_seccion.getText().toString();
        Fila4_seccion.setText(dato15);

        String dato16 =Fila4_turno.getText().toString();
        Fila4_turno.setText(dato16);


        String dato17=Fila5_codigo.getText().toString();
        Fila5_codigo.setText(dato17);

        String dato18=Fila5_asignatura.getText().toString();
        Fila5_asignatura.setText(dato18);

        String dato19 =Fila5_seccion.getText().toString();
        Fila5_seccion.setText(dato19);

        String dato20 =Fila5_turno.getText().toString();
        Fila5_turno.setText(dato20);


        Fila1_lunes = (TextView) findViewById(R.id.Fila1_lunes);
        Fila1_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                String dato=Fila1_lunes.getText().toString();
                Fila1_lunes.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                guardar_recordatorio();

                return false;
            }

        });


        Fila1_martes = (TextView) findViewById(R.id.Fila1_martes);
        Fila1_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                String dato=Fila1_martes.getText().toString();
                Fila1_martes.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                guardar_recordatorio();
                return false;
            }

        });



        Fila1_miercoles = (TextView) findViewById(R.id.Fila1_miercoles);
        Fila1_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                String dato=Fila1_miercoles.getText().toString();
                Fila1_miercoles.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila1_jueves = (TextView) findViewById(R.id.Fila1_jueves);
        Fila1_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila1_jueves.getText().toString();
                Fila1_jueves.setText(dato);


                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila1_viernes = (TextView) findViewById(R.id.Fila1_viernes);
        Fila1_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila1_viernes.getText().toString();
                Fila1_viernes.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila1_sabado = (TextView) findViewById(R.id.Fila1_sabado);
        Fila1_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                String dato=Fila1_sabado.getText().toString();
                Fila1_sabado.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila2_lunes = (TextView) findViewById(R.id.Fila2_lunes);
        Fila2_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila2_lunes.getText().toString();
                Fila2_lunes.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila2_martes = (TextView) findViewById(R.id.Fila2_martes);
        Fila2_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila2_martes.getText().toString();
                Fila2_martes.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();

                return false;
            }

        });


        Fila2_miercoles = (TextView) findViewById(R.id.Fila2_miercoles);
        Fila2_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila2_miercoles.getText().toString();
                Fila2_miercoles.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila2_jueves = (TextView) findViewById(R.id.Fila2_jueves);
        Fila2_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila2_jueves.getText().toString();
                Fila2_jueves.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila2_viernes = (TextView) findViewById(R.id.Fila2_viernes);
        Fila2_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila2_viernes.getText().toString();
                Fila2_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila2_sabado = (TextView) findViewById(R.id.Fila2_sabado);
        Fila2_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila2_sabado.getText().toString();
                Fila2_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila3_lunes = (TextView) findViewById(R.id.Fila3_lunes);
        Fila3_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila3_lunes.getText().toString();
                Fila3_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila3_martes = (TextView) findViewById(R.id.Fila3_martes);
        Fila3_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila3_martes.getText().toString();
                Fila3_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila3_miercoles = (TextView) findViewById(R.id.Fila3_miercoles);
        Fila3_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila3_miercoles.getText().toString();
                Fila3_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila3_jueves = (TextView) findViewById(R.id.Fila3_jueves);
        Fila3_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila3_jueves.getText().toString();
                Fila3_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila3_viernes = (TextView) findViewById(R.id.Fila3_viernes);
        Fila3_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila3_viernes.getText().toString();
                Fila3_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila3_sabado = (TextView) findViewById(R.id.Fila3_sabado);
        Fila3_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila3_sabado.getText().toString();
                Fila3_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila4_lunes = (TextView) findViewById(R.id.Fila4_lunes);
        Fila4_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila4_lunes.getText().toString();
                Fila4_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila4_martes = (TextView) findViewById(R.id.Fila4_martes);
        Fila4_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila4_martes.getText().toString();
                Fila4_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila4_miercoles = (TextView) findViewById(R.id.Fila4_miercoles);
        Fila4_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila4_miercoles.getText().toString();
                Fila4_miercoles.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila4_jueves = (TextView) findViewById(R.id.Fila4_jueves);
        Fila4_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila4_jueves.getText().toString();
                Fila4_jueves.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila4_viernes = (TextView) findViewById(R.id.Fila4_viernes);
        Fila4_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                String dato=Fila4_viernes.getText().toString();
                Fila4_viernes.setText(dato);

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila4_sabado = (TextView) findViewById(R.id.Fila4_sabado);
        Fila4_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila4_sabado.getText().toString();
                Fila4_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila5_lunes = (TextView) findViewById(R.id.Fila5_lunes);
        Fila5_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila5_lunes.getText().toString();
                Fila5_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila5_martes = (TextView) findViewById(R.id.Fila5_martes);
        Fila5_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila5_martes.getText().toString();
                Fila5_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila5_miercoles = (TextView) findViewById(R.id.Fila5_miercoles);
        Fila5_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila5_miercoles.getText().toString();
                Fila5_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila5_jueves = (TextView) findViewById(R.id.Fila5_jueves);
        Fila5_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila5_jueves.getText().toString();
                Fila5_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila5_viernes = (TextView) findViewById(R.id.Fila5_viernes);
        Fila5_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila5_viernes.getText().toString();
                Fila5_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila5_sabado = (TextView) findViewById(R.id.Fila5_sabado);
        Fila5_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila5_sabado.getText().toString();
                Fila5_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila6_lunes = (TextView) findViewById(R.id.Fila6_lunes);
        Fila6_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila6_lunes.getText().toString();
                Fila6_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila6_martes = (TextView) findViewById(R.id.Fila6_martes);
        Fila6_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila6_martes.getText().toString();
                Fila6_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila6_miercoles = (TextView) findViewById(R.id.Fila6_miercoles);
        Fila6_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila6_miercoles.getText().toString();
                Fila6_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila6_jueves = (TextView) findViewById(R.id.Fila6_jueves);
        Fila6_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila6_jueves.getText().toString();
                Fila6_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });



        Fila6_viernes = (TextView) findViewById(R.id.Fila6_viernes);
        Fila6_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila6_viernes.getText().toString();
                Fila6_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila6_sabado = (TextView) findViewById(R.id.Fila6_sabado);
        Fila6_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila6_sabado.getText().toString();
                Fila6_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila7_lunes = (TextView) findViewById(R.id.Fila7_lunes);
        Fila7_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila7_lunes.getText().toString();
                Fila7_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila7_martes = (TextView) findViewById(R.id.Fila7_martes);
        Fila7_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila7_martes.getText().toString();
                Fila7_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila7_miercoles = (TextView) findViewById(R.id.Fila7_miercoles);
        Fila7_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila7_miercoles.getText().toString();
                Fila7_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila7_jueves = (TextView) findViewById(R.id.Fila7_jueves);
        Fila7_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila7_jueves.getText().toString();
                Fila7_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila7_viernes = (TextView) findViewById(R.id.Fila7_viernes);
        Fila7_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila7_viernes.getText().toString();
                Fila7_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila7_sabado = (TextView) findViewById(R.id.Fila7_sabado);
        Fila7_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila7_sabado.getText().toString();
                Fila7_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila8_lunes = (TextView) findViewById(R.id.Fila8_lunes);
        Fila8_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila8_lunes.getText().toString();
                Fila8_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila8_martes = (TextView) findViewById(R.id.Fila8_martes);
        Fila8_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila8_martes.getText().toString();
                Fila8_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila8_miercoles = (TextView) findViewById(R.id.Fila8_miercoles);
        Fila8_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila8_miercoles.getText().toString();
                Fila8_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila8_jueves = (TextView) findViewById(R.id.Fila8_jueves);
        Fila8_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila8_jueves.getText().toString();
                Fila8_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila8_viernes = (TextView) findViewById(R.id.Fila8_viernes);
        Fila8_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila8_viernes.getText().toString();
                Fila8_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila8_sabado = (TextView) findViewById(R.id.Fila8_sabado);
        Fila8_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila8_sabado.getText().toString();
                Fila8_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila9_lunes = (TextView) findViewById(R.id.Fila9_lunes);
        Fila9_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila9_lunes.getText().toString();
                Fila9_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila9_martes = (TextView) findViewById(R.id.Fila9_martes);
        Fila9_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila9_martes.getText().toString();
                Fila9_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila9_miercoles = (TextView) findViewById(R.id.Fila9_miercoles);
        Fila9_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila9_miercoles.getText().toString();
                Fila9_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila9_jueves = (TextView) findViewById(R.id.Fila9_jueves);
        Fila9_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila9_jueves.getText().toString();
                Fila9_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila9_viernes = (TextView) findViewById(R.id.Fila9_viernes);
        Fila9_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila9_viernes.getText().toString();
                Fila9_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila9_sabado = (TextView) findViewById(R.id.Fila9_sabado);
        Fila9_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila9_sabado.getText().toString();
                Fila9_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila10_lunes = (TextView) findViewById(R.id.Fila10_lunes);
        Fila10_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila10_lunes.getText().toString();
                Fila10_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila10_martes = (TextView) findViewById(R.id.Fila10_martes);
        Fila10_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila10_martes.getText().toString();
                Fila10_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila10_miercoles = (TextView) findViewById(R.id.Fila10_miercoles);
        Fila10_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila10_miercoles.getText().toString();
                Fila10_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila10_jueves = (TextView) findViewById(R.id.Fila10_jueves);
        Fila10_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila10_jueves.getText().toString();
                Fila10_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila10_viernes = (TextView) findViewById(R.id.Fila10_viernes);
        Fila10_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila10_viernes.getText().toString();
                Fila10_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila10_sabado = (TextView) findViewById(R.id.Fila10_sabado);
        Fila10_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila10_sabado.getText().toString();
                Fila10_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila11_lunes = (TextView) findViewById(R.id.Fila11_lunes);
        Fila11_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila11_lunes.getText().toString();
                Fila11_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila11_martes = (TextView) findViewById(R.id.Fila11_martes);
        Fila11_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila11_martes.getText().toString();
                Fila11_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila11_miercoles = (TextView) findViewById(R.id.Fila11_miercoles);
        Fila11_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila11_miercoles.getText().toString();
                Fila11_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila11_jueves = (TextView) findViewById(R.id.Fila11_jueves);
        Fila11_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila11_jueves.getText().toString();
                Fila11_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila11_viernes = (TextView) findViewById(R.id.Fila11_viernes);
        Fila11_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila11_viernes.getText().toString();
                Fila11_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila11_sabado = (TextView) findViewById(R.id.Fila11_sabado);
        Fila11_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila11_sabado.getText().toString();
                Fila11_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila12_lunes = (TextView) findViewById(R.id.Fila12_lunes);
        Fila12_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila12_lunes.getText().toString();
                Fila12_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila12_martes = (TextView) findViewById(R.id.Fila12_martes);
        Fila12_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila12_martes.getText().toString();
                Fila12_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila12_miercoles = (TextView) findViewById(R.id.Fila12_miercoles);
        Fila12_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila12_miercoles.getText().toString();
                Fila12_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila12_jueves = (TextView) findViewById(R.id.Fila12_jueves);
        Fila12_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila12_jueves.getText().toString();
                Fila12_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila12_viernes = (TextView) findViewById(R.id.Fila12_viernes);
        Fila12_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila12_viernes.getText().toString();
                Fila12_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila12_sabado = (TextView) findViewById(R.id.Fila12_sabado);
        Fila12_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila12_sabado.getText().toString();
                Fila12_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila13_lunes = (TextView) findViewById(R.id.Fila13_lunes);
        Fila13_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila13_lunes.getText().toString();
                Fila13_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila13_martes = (TextView) findViewById(R.id.Fila13_martes);
        Fila13_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila13_martes.getText().toString();
                Fila13_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila13_miercoles = (TextView) findViewById(R.id.Fila13_miercoles);
        Fila13_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila13_miercoles.getText().toString();
                Fila13_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila13_jueves = (TextView) findViewById(R.id.Fila13_jueves);
        Fila13_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila13_jueves.getText().toString();
                Fila13_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila13_viernes = (TextView) findViewById(R.id.Fila13_viernes);
        Fila13_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila13_viernes.getText().toString();
                Fila13_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila13_sabado = (TextView) findViewById(R.id.Fila13_sabado);
        Fila13_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila13_sabado.getText().toString();
                Fila13_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });
        Fila14_lunes = (TextView) findViewById(R.id.Fila14_lunes);
        Fila14_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila14_lunes.getText().toString();
                Fila14_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila14_martes = (TextView) findViewById(R.id.Fila14_martes);
        Fila14_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila14_martes.getText().toString();
                Fila14_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila14_miercoles = (TextView) findViewById(R.id.Fila14_miercoles);
        Fila14_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila14_miercoles.getText().toString();
                Fila14_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila14_jueves = (TextView) findViewById(R.id.Fila14_jueves);
        Fila14_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila14_jueves.getText().toString();
                Fila14_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila14_viernes = (TextView) findViewById(R.id.Fila14_viernes);
        Fila14_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila14_viernes.getText().toString();
                Fila14_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila14_sabado = (TextView) findViewById(R.id.Fila14_sabado);
        Fila14_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila14_sabado.getText().toString();
                Fila14_sabado.setText(dato);
                guardar_recordatorio();
                return false;
            }

        });

        Fila15_lunes = (TextView) findViewById(R.id.Fila15_lunes);
        Fila15_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila15_lunes.getText().toString();
                Fila15_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila15_martes = (TextView) findViewById(R.id.Fila15_martes);
        Fila15_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila15_martes.getText().toString();
                Fila15_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila15_miercoles = (TextView) findViewById(R.id.Fila15_miercoles);
        Fila15_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila15_miercoles.getText().toString();
                Fila15_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila15_jueves = (TextView) findViewById(R.id.Fila15_jueves);
        Fila15_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila15_jueves.getText().toString();
                Fila15_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila15_viernes = (TextView) findViewById(R.id.Fila15_viernes);
        Fila15_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila15_viernes.getText().toString();
                Fila15_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila15_sabado = (TextView) findViewById(R.id.Fila15_sabado);
        Fila15_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila15_sabado.getText().toString();
                Fila15_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila16_lunes = (TextView) findViewById(R.id.Fila16_lunes);
        Fila16_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila16_lunes.getText().toString();
                Fila16_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila16_martes = (TextView) findViewById(R.id.Fila16_martes);
        Fila16_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila16_martes.getText().toString();
                Fila16_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila16_miercoles = (TextView) findViewById(R.id.Fila16_miercoles);
        Fila16_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila16_miercoles.getText().toString();
                Fila16_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila16_jueves = (TextView) findViewById(R.id.Fila16_jueves);
        Fila16_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila16_jueves.getText().toString();
                Fila16_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila16_viernes = (TextView) findViewById(R.id.Fila16_viernes);
        Fila16_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila16_viernes.getText().toString();
                Fila16_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila16_sabado = (TextView) findViewById(R.id.Fila16_sabado);
        Fila16_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila16_sabado.getText().toString();
                Fila16_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila17_lunes = (TextView) findViewById(R.id.Fila17_lunes);
        Fila17_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila17_lunes.getText().toString();
                Fila17_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila17_martes = (TextView) findViewById(R.id.Fila17_martes);
        Fila17_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila17_martes.getText().toString();
                Fila17_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila17_miercoles = (TextView) findViewById(R.id.Fila17_miercoles);
        Fila17_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila17_miercoles.getText().toString();
                Fila17_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila17_jueves = (TextView) findViewById(R.id.Fila17_jueves);
        Fila17_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila17_jueves.getText().toString();
                Fila17_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila17_viernes = (TextView) findViewById(R.id.Fila17_viernes);
        Fila17_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila17_viernes.getText().toString();
                Fila17_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila17_sabado = (TextView) findViewById(R.id.Fila17_sabado);
        Fila17_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila17_sabado.getText().toString();
                Fila17_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });

        Fila18_lunes = (TextView) findViewById(R.id.Fila18_lunes);
        Fila18_lunes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila18_lunes.getText().toString();
                Fila18_lunes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila18_martes = (TextView) findViewById(R.id.Fila18_martes);
        Fila18_martes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila18_martes.getText().toString();
                Fila18_martes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila18_miercoles = (TextView) findViewById(R.id.Fila18_miercoles);
        Fila18_miercoles.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila18_miercoles.getText().toString();
                Fila18_miercoles.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila18_jueves = (TextView) findViewById(R.id.Fila18_jueves);
        Fila18_jueves.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila18_jueves.getText().toString();
                Fila18_jueves.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila18_viernes = (TextView) findViewById(R.id.Fila18_viernes);
        Fila18_viernes.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila18_viernes.getText().toString();
                Fila18_viernes.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();
                return false;
            }

        });


        Fila18_sabado = (TextView) findViewById(R.id.Fila18_sabado);
        Fila18_sabado.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                String dato=Fila18_sabado.getText().toString();
                Fila18_sabado.setText(dato);
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);
                guardar_recordatorio();

                return false;
            }

        });


    }

    public void guardar_recordatorio() {

        Toast.makeText(this, "Recordatorio Guardado", Toast.LENGTH_SHORT).show();


    }
}

