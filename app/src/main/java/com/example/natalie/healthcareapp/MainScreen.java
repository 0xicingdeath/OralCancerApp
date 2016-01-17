package com.example.natalie.healthcareapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void openDrugPage(View view){
        //do something in response to button click
        Intent drugPage = new Intent(this,DrugList.class);
        Log.e("test", "Button is clicked");
        startActivity(drugPage);
    }
    public void openTravelTipPage(View view){

        Intent travelTipPage = new Intent(this,TravelTipPage.class);
        startActivity(travelTipPage);
    }
    public void openSymptomsPage(View view){
        Intent symptomsPage = new Intent(this,SymptomsPage.class);
        startActivity(symptomsPage);
    }
    public void openContactPage(View view){
        Intent contactPage = new Intent(this,ContactInformation.class);
        startActivity(contactPage);
    }

    public void openODPage(View view){
        Intent OD = new Intent(this,OralTreatments.class);
        startActivity(OD);
    }
    public void openSEPage(View view){
        Intent SE = new Intent(this,SideEffects.class);
        startActivity(SE);
    }
    public void openProperHSDPage(View view){
        Intent HSD = new Intent(this,HandlingStorage.class);
        startActivity(HSD);

    }
    public void openMDPage(View view){
        Intent MD = new Intent(this,MissingTooMuch.class);
        startActivity(MD);
    }
    public void openLSPage(View view){
        Intent LS = new Intent(this,LifestyleConsiderations.class);
        startActivity(LS);
    }

}
