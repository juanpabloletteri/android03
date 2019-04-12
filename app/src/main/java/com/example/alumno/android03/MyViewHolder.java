package com.example.alumno.android03;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 04/04/2019.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView tvNombre;
    public TextView tvApellido;

    public MyViewHolder(View v) {
        super(v);
        //en este caso el listener esta aca (por eso this)
        v.setOnClickListener(this);
        tvNombre = (TextView) v.findViewById(R.id.tvNombre);
        tvApellido = (TextView) v.findViewById(R.id.tvApellido);
    }

    @Override
    public void onClick(View v) {
        Log.d("Click","Click sobre contacto");
    }
}
