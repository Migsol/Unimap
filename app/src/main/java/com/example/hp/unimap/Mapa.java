package com.example.hp.unimap;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ZoomControls;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by hp on 20/02/2017.
 */

public class Mapa extends Activity {


    EditText editTextbuscar;
    Button buttonbuscar;
    TextView nombre_profesor_1;
    TextView nombre_materia_1;
    TextView hora_clase_1;
    TextView numero_aula_1;
    TextView nombre_profesor_2;
    TextView nombre_materia_2;
    TextView hora_clase_2;
    TextView numero_aula_2;
    TextView nombre_profesor_3;
    TextView nombre_materia_3;
    TextView hora_clase_3;
    TextView numero_aula_3;
    TextView nombre_profesor_4;
    TextView nombre_materia_4;
    TextView hora_clase_4;
    TextView numero_aula_4;
    TextView nombre_profesor_5;
    TextView nombre_materia_5;
    TextView hora_clase_5;
    TextView numero_aula_5;
    TextView nombre_profesor_6;
    TextView nombre_materia_6;
    TextView hora_clase_6;
    TextView numero_aula_6;
    TextView nombre_profesor_7;
    TextView nombre_materia_7;
    TextView hora_clase_7;
    TextView numero_aula_7;
    TextView nombre_profesor_8;
    TextView nombre_materia_8;
    TextView hora_clase_8;
    TextView numero_aula_8;
    TextView nombre_profesor_9;
    TextView nombre_materia_9;
    TextView hora_clase_9;
    TextView numero_aula_9;
    TextView nombre_profesor_10;
    TextView nombre_materia_10;
    TextView hora_clase_10;;
    TextView numero_aula_10;
    TextView nombre_profesor_11;
    TextView nombre_materia_11;
    TextView hora_clase_11;
    TextView numero_aula_11;
    TextView nombre_profesor_12;
    TextView nombre_materia_12;
    TextView hora_clase_12;
    TextView numero_aula_12;
    TextView nombre_profesor_13;
    TextView nombre_materia_13;
    TextView hora_clase_13;
    TextView numero_aula_13;
    TextView nombre_profesor_14;
    TextView nombre_materia_14;
    TextView hora_clase_14;
    TextView numero_aula_14;
    TextView nombre_profesor_15;
    TextView nombre_materia_15;
    TextView hora_clase_15;
    TextView numero_aula_15;
    TextView nombre_profesor_16;
    TextView nombre_materia_16;
    TextView hora_clase_16;
    TextView numero_aula_16;
    TextView nombre_profesor_17;
    TextView nombre_materia_17;
    TextView hora_clase_17;
    TextView numero_aula_17;
    TextView nombre_profesor_18;
    TextView nombre_materia_18;
    TextView hora_clase_18;
    TextView numero_aula_18;
    TextView nombre_profesor_19;
    TextView nombre_materia_19;
    TextView hora_clase_19;
    TextView numero_aula_19;
    TextView nombre_profesor_20;
    TextView nombre_materia_20;
    TextView hora_clase_20;
    TextView numero_aula_20;
    TextView nombre_profesor_21;
    TextView nombre_materia_21;
    TextView hora_clase_21;
    TextView numero_aula_21;
    TextView nombre_profesor_22;
    TextView nombre_materia_22;
    TextView hora_clase_22;
    TextView numero_aula_22;
    TextView nombre_profesor_23;
    TextView nombre_materia_23;
    TextView hora_clase_23;
    TextView numero_aula_23;
    TextView nombre_profesor_24;
    TextView nombre_materia_24;
    TextView hora_clase_24;
    TextView numero_aula_24;
    TextView nombre_profesor_25;
    TextView nombre_materia_25;
    TextView hora_clase_25;
    TextView numero_aula_25;
    TextView nombre_profesor_26;
    TextView nombre_materia_26;
    TextView hora_clase_26;
    TextView numero_aula_26;
    TextView nombre_profesor_27;
    TextView nombre_materia_27;
    TextView hora_clase_27;
    TextView numero_aula_27;
    TextView nombre_profesor_28;
    TextView nombre_materia_28;
    TextView hora_clase_28;
    TextView numero_aula_28;
    TextView nombre_profesor_29;
    TextView nombre_materia_29;
    TextView hora_clase_29;
    TextView numero_aula_29;
    TextView nombre_profesor_30;
    TextView nombre_materia_30;
    TextView hora_clase_30;
    TextView numero_aula_30;
    ImageButton imageViewButton_rojo;
    ImageButton imageViewButton_rojo2;
    ImageButton imageViewButton_rojo3;
    ImageButton imageViewButton_rojo4;
    ImageButton imageViewButton_rojo5;
    ImageButton imageViewButton_rojo6;
    ImageButton imageViewButton_rojo7;
    ImageButton imageViewButton_rojo8;
    ImageButton imageViewButton_rojo9;
    ImageButton imageViewButton_rojo10;
    ImageButton imageViewButton_verde;
    ImageButton imageViewButton_verde2;
    ImageButton imageViewButton_verde3;
    ImageButton imageViewButton_verde4;
    ImageButton imageViewButton_verde5;
    ImageButton imageViewButton_verde6;
    ImageButton imageViewButton_verde7;
    ImageButton imageViewButton_verde8;
    ImageButton imageViewButton_verde9;
    ImageButton imageViewButton_verde10;
    ImageButton imageViewButton_gris ;
    ImageButton imageViewButton_gris2 ;
    ImageButton imageViewButton_gris3 ;
    ImageButton imageViewButton_gris4 ;
    ImageButton imageViewButton_gris5 ;
    ImageButton imageViewButton_gris6 ;
    ImageButton imageViewButton_gris7 ;
    ImageButton imageViewButton_gris8 ;
    ImageButton imageViewButton_gris9 ;
    ImageButton imageViewButton_gris10 ;
    ImageButton imageButton_apuntador1;
    ImageButton imageButton_apuntador2;
    ImageButton imageButton_apuntador3;
    ImageButton imageButton_apuntador4;
    ImageButton imageButton_apuntador5;
    ImageButton imageButton_apuntador6;
    ImageButton imageButton_apuntador7;
    ImageButton imageButton_apuntador8;
    ImageButton imageButton_apuntador9;
    ImageButton imageButton_apuntador10;
    ImageButton imageButton_apuntador11;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa_menu);



        nombre_profesor_1 = (TextView) findViewById(R.id.nombre_profesor_1);
        nombre_materia_1 = (TextView) findViewById(R.id.nombre_materia_1);
        hora_clase_1 = (TextView) findViewById(R.id.hora_clase_1);
        numero_aula_1 = (TextView) findViewById(R.id.numero_aula_1);

        nombre_profesor_2 = (TextView) findViewById(R.id.nombre_profesor_2);
        nombre_materia_2 = (TextView) findViewById(R.id.nombre_materia_2);
        hora_clase_2 = (TextView) findViewById(R.id.hora_clase_2);
        numero_aula_2 = (TextView) findViewById(R.id.numero_aula_2);


        nombre_profesor_3 = (TextView) findViewById(R.id.nombre_profesor_3);
        nombre_materia_3 = (TextView) findViewById(R.id.nombre_materia_3);
        hora_clase_3 = (TextView) findViewById(R.id.hora_clase_3);
        numero_aula_3 = (TextView) findViewById(R.id.numero_aula_3);

        nombre_profesor_4 = (TextView) findViewById(R.id.nombre_profesor_4);
        nombre_materia_4 = (TextView) findViewById(R.id.nombre_materia_4);
        hora_clase_4 = (TextView) findViewById(R.id.hora_clase_4);
        numero_aula_4 = (TextView) findViewById(R.id.numero_aula_4);

        nombre_profesor_5 = (TextView) findViewById(R.id.nombre_profesor_5);
        nombre_materia_5 = (TextView) findViewById(R.id.nombre_materia_5);
        hora_clase_5 = (TextView) findViewById(R.id.hora_clase_5);
        numero_aula_5 = (TextView) findViewById(R.id.numero_aula_5);

        nombre_profesor_6 = (TextView) findViewById(R.id.nombre_profesor_6);
        nombre_materia_6 = (TextView) findViewById(R.id.nombre_materia_6);
        hora_clase_6 = (TextView) findViewById(R.id.hora_clase_6);
        numero_aula_6 = (TextView) findViewById(R.id.numero_aula_6);

        nombre_profesor_7 = (TextView) findViewById(R.id.nombre_profesor_7);
        nombre_materia_7 = (TextView) findViewById(R.id.nombre_materia_7);
        hora_clase_7= (TextView) findViewById(R.id.hora_clase_7);
        numero_aula_7 = (TextView) findViewById(R.id.numero_aula_7);

        nombre_profesor_8 = (TextView) findViewById(R.id.nombre_profesor_8);
        nombre_materia_8 = (TextView) findViewById(R.id.nombre_materia_8);
        hora_clase_8= (TextView) findViewById(R.id.hora_clase_8);
        numero_aula_8 = (TextView) findViewById(R.id.numero_aula_8);


        nombre_profesor_9= (TextView) findViewById(R.id.nombre_profesor_9);
        nombre_materia_9 = (TextView) findViewById(R.id.nombre_materia_9);
        hora_clase_9 = (TextView) findViewById(R.id.hora_clase_9);
        numero_aula_9 = (TextView) findViewById(R.id.numero_aula_9);

        nombre_profesor_10 = (TextView) findViewById(R.id.nombre_profesor_10);
        nombre_materia_10 = (TextView) findViewById(R.id.nombre_materia_10);
        hora_clase_10 = (TextView) findViewById(R.id.hora_clase_10);
        numero_aula_10 = (TextView) findViewById(R.id.numero_aula_10);

        nombre_profesor_11 = (TextView) findViewById(R.id.nombre_profesor_11);
        nombre_materia_11 = (TextView) findViewById(R.id.nombre_materia_11);
        hora_clase_11= (TextView) findViewById(R.id.hora_clase_11);
        numero_aula_11 = (TextView) findViewById(R.id.numero_aula_11);

        nombre_profesor_12 = (TextView) findViewById(R.id.nombre_profesor_12);
        nombre_materia_12 = (TextView) findViewById(R.id.nombre_materia_12);
        hora_clase_12= (TextView) findViewById(R.id.hora_clase_12);
        numero_aula_12= (TextView) findViewById(R.id.numero_aula_12);

        nombre_profesor_13 = (TextView) findViewById(R.id.nombre_profesor_13);
        nombre_materia_13 = (TextView) findViewById(R.id.nombre_materia_13);
        hora_clase_13 = (TextView) findViewById(R.id.hora_clase_13);
        numero_aula_13 = (TextView) findViewById(R.id.numero_aula_13);

        nombre_profesor_14 = (TextView) findViewById(R.id.nombre_profesor_14);
        nombre_materia_14 = (TextView) findViewById(R.id.nombre_materia_14);
        hora_clase_14 = (TextView) findViewById(R.id.hora_clase_14);
        numero_aula_14 = (TextView) findViewById(R.id.numero_aula_14);

        nombre_profesor_15 = (TextView) findViewById(R.id.nombre_profesor_15);
        nombre_materia_15 = (TextView) findViewById(R.id.nombre_materia_15);
        hora_clase_15 = (TextView) findViewById(R.id.hora_clase_15);
        numero_aula_15 = (TextView) findViewById(R.id.numero_aula_15);

        nombre_profesor_16 = (TextView) findViewById(R.id.nombre_profesor_16);
        nombre_materia_16 = (TextView) findViewById(R.id.nombre_materia_16);
        hora_clase_16= (TextView) findViewById(R.id.hora_clase_16);
        numero_aula_16= (TextView) findViewById(R.id.numero_aula_16);

        nombre_profesor_17 = (TextView) findViewById(R.id.nombre_profesor_17);
        nombre_materia_17 = (TextView) findViewById(R.id.nombre_materia_17);
        hora_clase_17= (TextView) findViewById(R.id.hora_clase_17);
        numero_aula_17 = (TextView) findViewById(R.id.numero_aula_17);

        nombre_profesor_18 = (TextView) findViewById(R.id.nombre_profesor_18);
        nombre_materia_18 = (TextView) findViewById(R.id.nombre_materia_18);
        hora_clase_18= (TextView) findViewById(R.id.hora_clase_18);
        numero_aula_18 = (TextView) findViewById(R.id.numero_aula_18);

        nombre_profesor_19 = (TextView) findViewById(R.id.nombre_profesor_19);
        nombre_materia_19 = (TextView) findViewById(R.id.nombre_materia_19);
        hora_clase_19 = (TextView) findViewById(R.id.hora_clase_19);
        numero_aula_19 = (TextView) findViewById(R.id.numero_aula_19);

        nombre_profesor_20 = (TextView) findViewById(R.id.nombre_profesor_20);
        nombre_materia_20 = (TextView) findViewById(R.id.nombre_materia_20);
        hora_clase_20= (TextView) findViewById(R.id.hora_clase_20);
        numero_aula_20 = (TextView) findViewById(R.id.numero_aula_20);

        nombre_profesor_21 = (TextView) findViewById(R.id.nombre_profesor_21);
        nombre_materia_21 = (TextView) findViewById(R.id.nombre_materia_21);
        hora_clase_21= (TextView) findViewById(R.id.hora_clase_21);
        numero_aula_21 = (TextView) findViewById(R.id.numero_aula_21);


        nombre_profesor_22 = (TextView) findViewById(R.id.nombre_profesor_22);
        nombre_materia_22 = (TextView) findViewById(R.id.nombre_materia_22);
        hora_clase_22= (TextView) findViewById(R.id.hora_clase_22);
        numero_aula_22 = (TextView) findViewById(R.id.numero_aula_22);

        nombre_profesor_23 = (TextView) findViewById(R.id.nombre_profesor_23);
        nombre_materia_23 = (TextView) findViewById(R.id.nombre_materia_23);
        hora_clase_23 = (TextView) findViewById(R.id.hora_clase_23);
        numero_aula_23 = (TextView) findViewById(R.id.numero_aula_23);

        nombre_profesor_24 = (TextView) findViewById(R.id.nombre_profesor_24);
        nombre_materia_24 = (TextView) findViewById(R.id.nombre_materia_24);
        hora_clase_24= (TextView) findViewById(R.id.hora_clase_24);
        numero_aula_24 = (TextView) findViewById(R.id.numero_aula_24);

        nombre_profesor_25= (TextView) findViewById(R.id.nombre_profesor_25);
        nombre_materia_25 = (TextView) findViewById(R.id.nombre_materia_25);
        hora_clase_25= (TextView) findViewById(R.id.hora_clase_25);
        numero_aula_25 = (TextView) findViewById(R.id.numero_aula_25);

        nombre_profesor_26= (TextView) findViewById(R.id.nombre_profesor_26);
        nombre_materia_26 = (TextView) findViewById(R.id.nombre_materia_26);
        hora_clase_26= (TextView) findViewById(R.id.hora_clase_26);
        numero_aula_26 = (TextView) findViewById(R.id.numero_aula_26);

        nombre_profesor_27 = (TextView) findViewById(R.id.nombre_profesor_27);
        nombre_materia_27 = (TextView) findViewById(R.id.nombre_materia_27);
        hora_clase_27= (TextView) findViewById(R.id.hora_clase_27);
        numero_aula_27 = (TextView) findViewById(R.id.numero_aula_27);

        nombre_profesor_28 = (TextView) findViewById(R.id.nombre_profesor_28);
        nombre_materia_28 = (TextView) findViewById(R.id.nombre_materia_28);
        hora_clase_28= (TextView) findViewById(R.id.hora_clase_28);
        numero_aula_28 = (TextView) findViewById(R.id.numero_aula_28);

        nombre_profesor_29= (TextView) findViewById(R.id.nombre_profesor_29);
        nombre_materia_29 = (TextView) findViewById(R.id.nombre_materia_29);
        hora_clase_29 = (TextView) findViewById(R.id.hora_clase_29);
        numero_aula_29 = (TextView) findViewById(R.id.numero_aula_29);

        nombre_profesor_30 = (TextView) findViewById(R.id.nombre_profesor_30);
        nombre_materia_30 = (TextView) findViewById(R.id.nombre_materia_30);
        hora_clase_30 = (TextView) findViewById(R.id.hora_clase_30);
        numero_aula_30 = (TextView) findViewById(R.id.numero_aula_30);




        imageViewButton_rojo= (ImageButton) findViewById(R.id.imageButton_rojo);
        imageViewButton_rojo.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes();

                return false;
            }

        });
        imageViewButton_rojo2= (ImageButton) findViewById(R.id.imageButton_rojo2);
        imageViewButton_rojo2.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes2();

                return false;
            }

        });


        imageViewButton_rojo3= (ImageButton) findViewById(R.id.imageButton_rojo3);
        imageViewButton_rojo3.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes3();

                return false;
            }

        });

        imageViewButton_rojo4= (ImageButton) findViewById(R.id.imageButton_rojo4);
        imageViewButton_rojo4.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes4();

                return false;
            }

        });


        imageViewButton_rojo5= (ImageButton) findViewById(R.id.imageButton_rojo5);
        imageViewButton_rojo5.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes5();

                return false;
            }

        });


        imageViewButton_rojo6= (ImageButton) findViewById(R.id.imageButton_rojo6);
        imageViewButton_rojo6.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes6();

                return false;
            }

        });


        imageViewButton_rojo7= (ImageButton) findViewById(R.id.imageButton_rojo7);
        imageViewButton_rojo7.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes7();

                return false;
            }

        });


        imageViewButton_rojo8= (ImageButton) findViewById(R.id.imageButton_rojo8);
        imageViewButton_rojo8.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes8();

                return false;
            }

        });


        imageViewButton_rojo9= (ImageButton) findViewById(R.id.imageButton_rojo9);
        imageViewButton_rojo9.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes9();

                return false;
            }

        });


        imageViewButton_rojo10= (ImageButton) findViewById(R.id.imageButton_rojo10);
        imageViewButton_rojo10.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_ausentes10();

                return false;
            }

        });



        imageViewButton_verde= (ImageButton) findViewById(R.id.imageButton_verde);
        imageViewButton_verde.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes();

                return false;
            }

        });


        imageViewButton_verde2= (ImageButton) findViewById(R.id.imageButton_verde2);
        imageViewButton_verde2.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes2();

                return false;
            }

        });


        imageViewButton_verde3= (ImageButton) findViewById(R.id.imageButton_verde3);
        imageViewButton_verde3.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes3();

                return false;
            }

        });


        imageViewButton_verde4= (ImageButton) findViewById(R.id.imageButton_verde4);
        imageViewButton_verde4.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes4();

                return false;
            }

        });


        imageViewButton_verde5= (ImageButton) findViewById(R.id.imageButton_verde5);
        imageViewButton_verde5.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes5();

                return false;
            }

        });


        imageViewButton_verde6= (ImageButton) findViewById(R.id.imageButton_verde6);
        imageViewButton_verde6.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes6();

                return false;
            }

        });


        imageViewButton_verde7= (ImageButton) findViewById(R.id.imageButton_verde7);
        imageViewButton_verde7.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes7();

                return false;
            }

        });


        imageViewButton_verde8= (ImageButton) findViewById(R.id.imageButton_verde8);
        imageViewButton_verde8.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes8();

                return false;
            }

        });


        imageViewButton_verde9= (ImageButton) findViewById(R.id.imageButton_verde9);
        imageViewButton_verde9.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes9();

                return false;
            }

        });


        imageViewButton_verde10= (ImageButton) findViewById(R.id.imageButton_verde10);
        imageViewButton_verde10.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_presentes10();

                return false;
            }

        });



        imageViewButton_gris= (ImageButton) findViewById(R.id.imageButton_gris);
        imageViewButton_gris.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera();

                return false;
            }

        });

        imageViewButton_gris2= (ImageButton) findViewById(R.id.imageButton_gris2);
        imageViewButton_gris2.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera2();

                return false;
            }

        });

        imageViewButton_gris3= (ImageButton) findViewById(R.id.imageButton_gris3);
        imageViewButton_gris3.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera3();

                return false;
            }

        });

        imageViewButton_gris4= (ImageButton) findViewById(R.id.imageButton_gris4);
        imageViewButton_gris4.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera4();

                return false;
            }

        });

        imageViewButton_gris5= (ImageButton) findViewById(R.id.imageButton_gris5);
        imageViewButton_gris5.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera5();

                return false;
            }

        });

        imageViewButton_gris6= (ImageButton) findViewById(R.id.imageButton_gris6);
        imageViewButton_gris6.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera6();

                return false;
            }

        });

        imageViewButton_gris7= (ImageButton) findViewById(R.id.imageButton_gris7);
        imageViewButton_gris7.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera7();

                return false;
            }

        });

        imageViewButton_gris8= (ImageButton) findViewById(R.id.imageButton_gris8);
        imageViewButton_gris8.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera8();

                return false;
            }

        });

        imageViewButton_gris9= (ImageButton) findViewById(R.id.imageButton_gris9);
        imageViewButton_gris9.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera9();

                return false;
            }

        });

        imageViewButton_gris10= (ImageButton) findViewById(R.id.imageButton_gris10);
        imageViewButton_gris10.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE) ;
                vb.vibrate(50);

                mostrar_informacion_espera10();

                return false;
            }

        });


        final Animation anim_alpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        editTextbuscar = (EditText) findViewById(R.id.editTextbuscar);

        buttonbuscar = (Button) findViewById(R.id.buttonbuscar);

        buttonbuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub

                if (editTextbuscar.getText().toString().equals("verde")) {
                    profe_presente();
                    view.startAnimation(anim_alpha);




                } else {

                    if (editTextbuscar.getText().toString().equals("rojo")) {
                        profe_retrasado();
                        view.startAnimation(anim_alpha);



                    } else {

                        if (editTextbuscar.getText().toString().equals("gris")) {
                            profe_en_espera();
                            view.startAnimation(anim_alpha);


                        } else {

                            Toast.makeText(Mapa.this, "Datos incorrecto", Toast.LENGTH_SHORT).show();

                        }


                    }
                }
            }
        });

    }






    private void profe_presente() {


        imageViewButton_verde.setImageResource(R.drawable.verde);
        imageViewButton_verde2.setImageResource(R.drawable.verde);
        imageViewButton_verde3.setImageResource(R.drawable.verde);
        imageViewButton_verde4.setImageResource(R.drawable.verde);
        imageViewButton_verde5.setImageResource(R.drawable.verde);
        imageViewButton_verde6.setImageResource(R.drawable.verde);
        imageViewButton_verde7.setImageResource(R.drawable.verde);
        imageViewButton_verde8.setImageResource(R.drawable.verde);
        imageViewButton_verde9.setImageResource(R.drawable.verde);
        imageViewButton_verde10.setImageResource(R.drawable.verde);








    }



    private void profe_retrasado() {


        imageViewButton_rojo.setImageResource(R.drawable.rojo);
        imageViewButton_rojo2.setImageResource(R.drawable.rojo);
        imageViewButton_rojo3.setImageResource(R.drawable.rojo);
        imageViewButton_rojo4.setImageResource(R.drawable.rojo);
        imageViewButton_rojo5.setImageResource(R.drawable.rojo);
        imageViewButton_rojo6.setImageResource(R.drawable.rojo);
        imageViewButton_rojo7.setImageResource(R.drawable.rojo);
        imageViewButton_rojo8.setImageResource(R.drawable.rojo);
        imageViewButton_rojo9.setImageResource(R.drawable.rojo);
        imageViewButton_rojo10.setImageResource(R.drawable.rojo);




    }

    private void profe_en_espera() {

        imageViewButton_gris.setImageResource(R.drawable.gris);
        imageViewButton_gris2.setImageResource(R.drawable.gris);
        imageViewButton_gris3.setImageResource(R.drawable.gris);
        imageViewButton_gris4.setImageResource(R.drawable.gris);
        imageViewButton_gris5.setImageResource(R.drawable.gris);
        imageViewButton_gris6.setImageResource(R.drawable.gris);
        imageViewButton_gris7.setImageResource(R.drawable.gris);
        imageViewButton_gris8.setImageResource(R.drawable.gris);
        imageViewButton_gris9.setImageResource(R.drawable.gris);
        imageViewButton_gris10.setImageResource(R.drawable.gris);






    }


    public void mostrar_informacion_presentes(){

        String profe = nombre_profesor_1.getText().toString();
        String materia = nombre_materia_1.getText().toString();
        String hora = hora_clase_1.getText().toString();
        String aula = numero_aula_1.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+"Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }

    public void mostrar_informacion_presentes2(){


        String profe = nombre_profesor_2.getText().toString();
        String materia = nombre_materia_2.getText().toString();
        String hora = hora_clase_2.getText().toString();
        String aula = numero_aula_2.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_presentes3(){


        String profe = nombre_profesor_3.getText().toString();
        String materia = nombre_materia_3.getText().toString();
        String hora = hora_clase_3.getText().toString();
        String aula = numero_aula_3.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }

    public void mostrar_informacion_presentes4(){


        String profe = nombre_profesor_4.getText().toString();
        String materia = nombre_materia_4.getText().toString();
        String hora = hora_clase_4.getText().toString();
        String aula = numero_aula_4.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_presentes5(){


        String profe = nombre_profesor_5.getText().toString();
        String materia = nombre_materia_5.getText().toString();
        String hora = hora_clase_5.getText().toString();
        String aula = numero_aula_5.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }

    public void mostrar_informacion_presentes6(){


        String profe = nombre_profesor_6.getText().toString();
        String materia = nombre_materia_6.getText().toString();
        String hora = hora_clase_6.getText().toString();
        String aula = numero_aula_6.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }

    public void mostrar_informacion_presentes7(){


        String profe = nombre_profesor_7.getText().toString();
        String materia = nombre_materia_7.getText().toString();
        String hora = hora_clase_7.getText().toString();
        String aula = numero_aula_7.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }

    public void mostrar_informacion_presentes8(){


        String profe = nombre_profesor_8.getText().toString();
        String materia = nombre_materia_8.getText().toString();
        String hora = hora_clase_8.getText().toString();
        String aula = numero_aula_8.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }

    public void mostrar_informacion_presentes9(){


        String profe = nombre_profesor_9.getText().toString();
        String materia = nombre_materia_9.getText().toString();
        String hora = hora_clase_9.getText().toString();
        String aula = numero_aula_9.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_presentes10(){


        String profe = nombre_profesor_10.getText().toString();
        String materia = nombre_materia_10.getText().toString();
        String hora = hora_clase_10.getText().toString();
        String aula = numero_aula_10.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }



    public void mostrar_informacion_ausentes(){


        String profe = nombre_profesor_11.getText().toString();
        String materia = nombre_materia_11.getText().toString();
        String hora = hora_clase_11.getText().toString();
        String aula = numero_aula_11.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);


        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }

    public void mostrar_informacion_ausentes2(){


        String profe = nombre_profesor_12.getText().toString();
        String materia = nombre_materia_12.getText().toString();
        String hora = hora_clase_12.getText().toString();
        String aula = numero_aula_12.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_ausentes3(){


        String profe = nombre_profesor_13.getText().toString();
        String materia = nombre_materia_13.getText().toString();
        String hora = hora_clase_13.getText().toString();
        String aula = numero_aula_13.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_ausentes4(){


        String profe = nombre_profesor_14.getText().toString();
        String materia = nombre_materia_14.getText().toString();
        String hora = hora_clase_14.getText().toString();
        String aula = numero_aula_14.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_ausentes5(){


        String profe = nombre_profesor_15.getText().toString();
        String materia = nombre_materia_15.getText().toString();
        String hora = hora_clase_15.getText().toString();
        String aula = numero_aula_15.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_ausentes6(){


        String profe = nombre_profesor_16.getText().toString();
        String materia = nombre_materia_16.getText().toString();
        String hora = hora_clase_16.getText().toString();
        String aula = numero_aula_16.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_ausentes7(){


        String profe = nombre_profesor_17.getText().toString();
        String materia = nombre_materia_17.getText().toString();
        String hora = hora_clase_17.getText().toString();
        String aula = numero_aula_17.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_ausentes8(){


        String profe = nombre_profesor_18.getText().toString();
        String materia = nombre_materia_18.getText().toString();
        String hora = hora_clase_18.getText().toString();
        String aula = numero_aula_18.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_ausentes9(){


        String profe = nombre_profesor_19.getText().toString();
        String materia = nombre_materia_19.getText().toString();
        String hora = hora_clase_19.getText().toString();
        String aula = numero_aula_19.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_ausentes10(){


        String profe = nombre_profesor_20.getText().toString();
        String materia = nombre_materia_20.getText().toString();
        String hora = hora_clase_20.getText().toString();
        String aula = numero_aula_20.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }


    public void mostrar_informacion_espera(){


        String profe = nombre_profesor_21.getText().toString();
        String materia = nombre_materia_21.getText().toString();
        String hora = hora_clase_21.getText().toString();
        String aula = numero_aula_21.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }


    public void mostrar_informacion_espera2(){


        String profe = nombre_profesor_22.getText().toString();
        String materia = nombre_materia_22.getText().toString();
        String hora = hora_clase_22.getText().toString();
        String aula = numero_aula_22.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_espera3(){


        String profe = nombre_profesor_23.getText().toString();
        String materia = nombre_materia_23.getText().toString();
        String hora = hora_clase_23.getText().toString();
        String aula = numero_aula_23.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_espera4(){


        String profe = nombre_profesor_24.getText().toString();
        String materia = nombre_materia_24.getText().toString();
        String hora = hora_clase_24.getText().toString();
        String aula = numero_aula_24.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_espera5(){


        String profe = nombre_profesor_25.getText().toString();
        String materia = nombre_materia_25.getText().toString();
        String hora = hora_clase_25.getText().toString();
        String aula = numero_aula_25.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_espera6(){


        String profe = nombre_profesor_26.getText().toString();
        String materia = nombre_materia_26.getText().toString();
        String hora = hora_clase_26.getText().toString();
        String aula = numero_aula_26.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_espera7(){


        String profe = nombre_profesor_27.getText().toString();
        String materia = nombre_materia_27.getText().toString();
        String hora = hora_clase_27.getText().toString();
        String aula = numero_aula_27.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_espera8(){


        String profe = nombre_profesor_28.getText().toString();
        String materia = nombre_materia_28.getText().toString();
        String hora = hora_clase_28.getText().toString();
        String aula = numero_aula_28.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_espera9(){


        String profe = nombre_profesor_29.getText().toString();
        String materia = nombre_materia_29.getText().toString();
        String hora = hora_clase_29.getText().toString();
        String aula = numero_aula_29.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");


        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }
    public void mostrar_informacion_espera10(){


        String profe = nombre_profesor_30.getText().toString();
        String materia = nombre_materia_30.getText().toString();
        String hora = hora_clase_30.getText().toString();
        String aula = numero_aula_30.getText().toString();


        AlertDialog alertDialog = new AlertDialog.Builder(
                Mapa.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Asistencias");

        // Setting Dialog Message
        alertDialog.setMessage("Profesor:"+profe+"\n"+ "Materia:"+materia+"\n"+ "Hora:"+hora+"\n"+ "Aula:"+aula);



        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.icono_profesor);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
            }
        });

        // Showing Alert Message
        alertDialog.show();


    }


}


