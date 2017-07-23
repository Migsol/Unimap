package com.example.hp.unimap;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 19/04/2017.
 */

public class MostrarNotificacionEstu extends Activity {


    private RecyclerView recyclerView2;
    private RecyclerAdapterEstu adapter;
    private List<RecyclerItemEstu> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_mensaje_estu);

        recyclerView2 = (RecyclerView) findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        //Generate sample data
        listItems.add(new RecyclerItemEstu("Recordatorio" , "recuerda que tienes clase" ));
        listItems.add(new RecyclerItemEstu("Aviso" , "No tendran clase de sistema el dia de hoy" ));
        listItems.add(new RecyclerItemEstu("Recordatorio" , "recuerda que tienes clase en el aula 12" ));
        listItems.add(new RecyclerItemEstu("Recordatorio" , "recuerda que tienes clase en el aula 30" ));


        //Set adapter
        adapter = new RecyclerAdapterEstu(listItems, this);
        recyclerView2.setAdapter(adapter);
    }

}
