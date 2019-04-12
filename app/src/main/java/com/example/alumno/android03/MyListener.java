package com.example.alumno.android03;

import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 04/04/2019.
 */

public class MyListener implements View.OnClickListener{

    public MainActivity act = new MainActivity();

    @Override
    public void onClick(View v) {

        Log.d("mens","llega");
    }
}
