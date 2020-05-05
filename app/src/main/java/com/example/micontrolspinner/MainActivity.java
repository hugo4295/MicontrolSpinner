package com.example.micontrolspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] strEsrtados;
    List<String> listEstados;
    ArrayAdapter<String> Adaptador;
    Spinner ContenedorEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContenedorEstados = findViewById(R.id.spinnerEstados);

        strEsrtados = new String[] {"Baja California sur", "Baja California norte", "Aguascalientes","Durango","Chiapas","Oaxaca"};
        listEstados = new ArrayList<String>();
        Collections.addAll(listEstados,strEsrtados);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listEstados);
        ContenedorEstados.setAdapter(Adaptador);

        ContenedorEstados.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String texto = ContenedorEstados.getSelectedItem().toString();
        Toast.makeText(this,"Valor seleccionado " + texto,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}
