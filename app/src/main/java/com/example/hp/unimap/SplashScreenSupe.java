package com.example.hp.unimap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

/**
 * Created by hp on 19/04/2017.
 */

public class SplashScreenSupe extends Activity {
    private static int SPLASH_TIME_OUT = 4000;
    TextView textView_nombre_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_splash_sesion);


        textView_nombre_usuario=(TextView)findViewById(R.id.textView_nombre_usuario);

        Intent i= getIntent();
        Bundle bundle= i.getExtras();

        String supe= (String)bundle.get("superior");
        textView_nombre_usuario.setText(supe);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenSupe.this, MenuSuperior.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
}
