package com.example.aaron.fernbedienung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*

        Button btn = findViewById(R.id.buttonNumPadToggle);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setContentView(R.layout.numpad);
            }
        });

        Button btn2 = findViewById(R.id.buttonBack);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button one = (Button) findViewById(R.id.buttonNumPadToggle);
        one.setOnClickListener(this); // calling onClick() method*/
/*
        Button two = (Button) findViewById(R.id.buttonBack);
        two.setOnClickListener(this);*/
        //Button three = (Button) findViewById(R.id.threeButton);
        //three.setOnClickListener(this);
        /*Button btn2 = findViewById(R.id.buttonBack);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });*/
        //get the spinner from the xml.
        /*Spinner dropdown = findViewById(R.id.spinnerSettingsResolution);
//create a list of items for the spinner.
        String[] items = new String[]{"1", "2", "three"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);*/

    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.buttonNumPadToggle:
                setContentView(R.layout.numpad);
                break;

            case R.id.buttonBack:
                setContentView(R.layout.classic);
                break;
/*
            case R.id.threeButton:
                // do your code
                break;
*/
            default:
                break;
        }

    }
}
