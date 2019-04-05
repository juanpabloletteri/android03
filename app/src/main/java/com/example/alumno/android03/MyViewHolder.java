package com.example.alumno.android03;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 04/04/2019.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNombre;
    public TextView tvApellido;

    public MyViewHolder(View v) {
        super(v);
        tvNombre = (TextView) v.findViewById(R.id.tvNombre);
        tvApellido = (TextView) v.findViewById(R.id.tvApellido);
    }

}
