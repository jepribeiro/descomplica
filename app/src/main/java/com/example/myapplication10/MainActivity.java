package com.example.myapplication10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.array_planetas, android.R.layout.simple_spinner_item);

        // criar o adaptador depois colocar o contexto "this" , onde está o array e o layout (tem padrão no android

        adapter.setDropDownViewResource(android.support.constraint.R.layout.support_simple_spinner_dropdown_item);
        // abrir o adaptador com o layout
        spinner.setAdapter(adapter);
        //set no sipnner com os valores e layout do adapter

        TextView tvQuantidade = (TextView) findViewById(R.id.textView3);
        int quantidade_planetas = spinner.getCount();

        tvQuantidade.setText(getResources().getQuantityString(R.plurals.planeta,quantidade_planetas, quantidade_planetas));

    }
}
