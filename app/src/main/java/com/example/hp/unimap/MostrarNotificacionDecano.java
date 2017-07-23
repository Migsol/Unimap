package com.example.hp.unimap;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 03/03/2017.
 */

public class MostrarNotificacionDecano extends Activity {

    private RecyclerView recyclerView;
    private RecyclerAdapterDecano adapter;
    private List<RecyclerItemDeca> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_mensaje_deca);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        //Generate sample data
        listItems.add(new RecyclerItemDeca("Motivo" , "Buenas tardes no podre ir a la clase de matematicas" ));
        listItems.add(new RecyclerItemDeca("Motivo" , "hoy no podre ir a la universidad" ));
        listItems.add(new RecyclerItemDeca("Motivo" , "no podre ir a la universidad por motivos ajenos" ));

        //Set adapter
        adapter = new RecyclerAdapterDecano(listItems, this);
        recyclerView.setAdapter(adapter);
    }


}
