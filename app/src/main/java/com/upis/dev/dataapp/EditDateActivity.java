package com.upis.dev.dataapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.upis.dev.dataapp.data.*;
public class EditDateActivity extends AppCompatActivity {
    private Data date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_date);


        Intent intent = getIntent();
        int dia = intent.getIntExtra("dia", 0);
        int mes = intent.getIntExtra("mes", 0);
        int ano = intent.getIntExtra("ano", 0);

        this.date = new Data(dia, mes, ano);

        TextView diaView = findViewById(R.id.diaEdit);
        TextView mesView = findViewById(R.id.mesEdit);
        TextView anoView = findViewById(R.id.anoEdit);

        diaView.setText(String.valueOf(dia));
        mesView.setText(String.valueOf(mes));
        anoView.setText(String.valueOf(ano));
    }


    public void incrementaDia(View view) {
        this.date.incrementaDia();
        TextView diaView = findViewById(R.id.diaEdit);
        diaView.setText(String.valueOf(this.date.getDia()));
    }

    public void incrementaMes(View view) {
        this.date.incrementaMes();
        TextView diaView = findViewById(R.id.mesEdit);
        diaView.setText(String.valueOf(this.date.getMes()));
    }

    public void incrementaAno(View view) {
        this.date.incrementaAno();
        TextView diaView = findViewById(R.id.anoEdit);
        diaView.setText(String.valueOf(this.date.getAno()));
    }

    public void nextActivity(View view) {
        EditText dia = (EditText) findViewById(R.id.diaEdit);
        EditText mes = (EditText) findViewById(R.id.mesEdit);
        EditText ano = (EditText) findViewById(R.id.anoEdit);

        Intent intent = new Intent(this, EndActivity.class);

        intent.putExtra("dia", Integer.parseInt(dia.getText().toString()));
        intent.putExtra("mes", Integer.parseInt(mes.getText().toString()));
        intent.putExtra("ano", Integer.parseInt(ano.getText().toString()));

        startActivity(intent);
    }
}
