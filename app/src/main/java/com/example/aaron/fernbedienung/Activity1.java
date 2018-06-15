package com.example.aaron.fernbedienung;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.Button;

public class Activity1 extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.numpad);

        Button two = (Button) findViewById(R.id.buttonBack);
        two.setOnClickListener(this);
        //Button three = (Button) findViewById(R.id.threeButton);
        //three.setOnClickListener(this);
        /*Button btn2 = findViewById(R.id.buttonBack);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });*/

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
