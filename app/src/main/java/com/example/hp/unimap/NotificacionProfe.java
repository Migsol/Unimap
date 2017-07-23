package com.example.hp.unimap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by hp on 19/04/2017.
 */

public class NotificacionProfe extends Activity {

    String [] datos={ "Nuevo Mensaje" };//declarar un arreglo para ponerle datos al listview
    ListView lista_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notificacion_menu);

        lista_listview=(ListView)findViewById(R.id.lista_listview);

        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, datos);
        lista_listview.setAdapter(adaptador);


        lista_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent i = new Intent(getApplicationContext(), NuevoMensaje.class);
                        startActivity(i);
                        break;
                    default:
                        return;
                }
            }
        });
    }
}


