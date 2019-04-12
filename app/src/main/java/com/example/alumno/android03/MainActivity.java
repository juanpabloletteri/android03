package com.example.alumno.android03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("juan", "letteri", "15-6558-9987"));
        personas.add(new Persona("jose", "perez", "15-4444-1111"));
        personas.add(new Persona("maria", "letteri", "15-7777-8888"));
        personas.add(new Persona("celeste", "gomez", "15-6558-9999"));
        personas.add(new Persona("juan", "sanchez", "15-4444-1111"));
        personas.add(new Persona("francisco", "mazzeo", "15-1111-9987"));

        RecyclerView rvPersona = (RecyclerView) super.findViewById(R.id.rvPersonas);

        MyAdapter adapter = new MyAdapter(personas);
        rvPersona.setAdapter(adapter);;
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvPersona.setLayoutManager(layoutManager);

        ///////boton agregar
        MyListener listenerControlador = new MyListener();
        Button btnAgregar = (Button)this.findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(listenerControlador);
    }

    public void llamar(int index){

    }

}
