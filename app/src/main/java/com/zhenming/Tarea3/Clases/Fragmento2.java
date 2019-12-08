package com.zhenming.Tarea3.Clases;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.zhenming.Tarea3.Fragmentos.FragmentoPrimero;
import com.zhenming.Tarea3.Fragmentos.FragmentoSegundo;
import com.zhenming.Tarea3.R;

public class Fragmento2 extends AppCompatActivity implements FragmentoPrimero.OnFragmentInteractionListener, FragmentoSegundo.OnFragmentInteractionListener {

    FragmentoPrimero fragR;
    FragmentoSegundo fragV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento2);

        fragR = new FragmentoPrimero();
        fragV = new FragmentoSegundo();

        getSupportFragmentManager().beginTransaction().add(R.id.contFragments, fragR).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri){

    }

    public void onClick(View view){
        FragmentTransaction fragt = getSupportFragmentManager().beginTransaction();
         switch (view.getId()){
             case R.id.btn1:
                 fragt.replace(R.id.contFragments, fragR);
                 break;

             case R.id.btn2:
                 fragt.replace(R.id.contFragments, fragV);
                 break;

         }

         fragt.commit();

    }

}
