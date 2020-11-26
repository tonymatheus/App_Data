package com.upis.dev.dataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextActivity (View view){
        EditText dia = (EditText) findViewById(R.id.dia);
        EditText mes = (EditText) findViewById(R.id.mes);
        EditText ano = (EditText) findViewById(R.id.ano);

        Intent intent = new Intent(this, EditDataActivicty.class);

        intent.putExtra("dia", Integer.parseInt(dia.getText().toString()));
        intent.putExtra("mes", Integer.parseInt(mes.getText().toString()));
        intent.putExtra("ano", Integer.parseInt(ano.getText().toString()));

        startActivity(intent);

    }
}