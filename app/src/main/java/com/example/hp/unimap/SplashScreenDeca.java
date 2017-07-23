package com.example.hp.unimap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

/**
 * Created by hp on 19/04/2017.
 */

public class SplashScreenDeca extends Activity {

    private static int SPLASH_TIME_OUT = 4000;

    TextView textView_nombre_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_splash_sesion);

        textView_nombre_usuario=(TextView )findViewById(R.id.textView_nombre_usuario);

        Intent i= getIntent();
        Bundle bundle= i.getExtras();

        String deca= (String)bundle.get("decano");
        textView_nombre_usuario.setText(deca);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenDeca.this, MenuDeca.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
}