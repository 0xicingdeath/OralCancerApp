package com.example.natalie.healthcareapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class SymptomsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
//opening the fatigue page
    public void openFatigue(View view){
        Intent fatigue = new Intent(this,Fatigue.class);
        startActivity(fatigue);
    }
//opening the Nausea and Vomiting page
    public void openNNV(View view){
        Intent NNV = new Intent(this,NauseaVomiting.class);
        startActivity(NNV);
    }
//opening the diarrhea page
    public void openDiarrhea(View view){
        Intent diarrhea = new Intent(this,Diarrhea.class);
        startActivity(diarrhea);
    }
//opening the constipation page
    public void openConstipation(View view){
        Intent constipation = new Intent(this,Constipation.class);
        startActivity(constipation);
    }
//opening the hand & foot syndrome page
    public void openHF(View view){
        Intent HF = new Intent(this,HandFoot.class);
        startActivity(HF);
    }
//opening the Brusing Bleeding page
    public void openBB(View view){
        Intent BB = new Intent(this,BrusingBleeding.class);
        startActivity(BB);
    }



}
