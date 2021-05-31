package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.project_sample.clubHomePage.VAL;
import static com.example.project_sample.clubHomePage.VAL2;

public class rentalHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_home_page);
    }

    public void directPage(View v)
    {
        double i=0,j=0;

        switch(v.getId()) {
            case R.id.button2:
                i=13.347891122069386;
                j=74.7848623155993;
                break;
            case R.id.button3:
                i=13.339753609839008;
                j=74.78702313923282;
                break;
            case R.id.button4:
                i=13.360455955555429;
                j=74.78436282998088;
                break;
            case R.id.button5:
                i=13.34890402541248;
                j=74.78032652385257;
                break;
            case R.id.button6:
                i=13.35672096653668;
                j=74.78393902275991;
                break;
            case R.id.button7:
                i=13.349302120642966;
                j=74.78040960258703;
                break;
            case R.id.button8:
                i=13.35571967875457;
                j=74.79704381793336;
                break;
            case R.id.button9:
                i=13.35950734232869;
                j=74.78484249541609;
                break;

        }

        Intent in = new Intent(this, locationPage.class);
        in.putExtra(VAL,i);
        in.putExtra(VAL2,j);
        startActivity(in);
    }
}