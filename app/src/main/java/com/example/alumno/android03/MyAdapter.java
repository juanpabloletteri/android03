package com.example.alumno.android03;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alumno on 04/04/2019.
 */

public class MyAdapter extends RecyclerView.Adapter <MyViewHolder> {

    List<Persona> personas;

    public MyAdapter(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //TextView tvNombre = (TextView)holder.itemView.findViewById(R.id.tvNombre);
        //TextView tvApellido = (TextView)holder.itemView.findViewById(R.id.tvApellido);
        Persona p = this.personas.get(position);
        //tvNombre.setText(p.getNombre());
        //tvApellido.setText(p.getApellido());
        holder.tvNombre.setText(p.getNombre());
        holder.tvApellido.setText(p.getApellido());
    }

    @Override
    public int getItemCount() {
        return this.personas.size();
    }
}
