package com.upis.dev.dataapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import  com.upis.dev.dataapp.data.*;


public class EndActivity extends AppCompatActivity {

    private Data date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Intent intent = getIntent();

        int dia = intent.getIntExtra("dia", 0);
        int mes = intent.getIntExtra("mes", 0);
        int ano = intent.getIntExtra("ano", 0);

        this.date = new Data(dia, mes, ano);

        TextView showDate = findViewById(R.id.showDate);

        showDate.setText(this.date.toString());

    }



}

