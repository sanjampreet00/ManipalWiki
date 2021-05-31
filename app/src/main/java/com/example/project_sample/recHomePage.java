package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.project_sample.clubHomePage.VAL;
import static com.example.project_sample.clubHomePage.VAL2;

public class recHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_home_page);
    }

    public void directPage(View v)
    {
        double i=0,j=0;

        switch(v.getId()) {
            case R.id.button2:
                i=13.351515183189512;
                j=74.78382084612674;
                break;
            case R.id.button3:
                i=13.35509411164832;
                j=74.79342907756308;
                break;
            case R.id.button4:
                i=13.352997013845403;
                j=74.79025774983538;
                break;
            case R.id.button5:
                i=13.349310940815037;
                j=74.7829281849431;
                break;
            case R.id.button6:
                i=13.35465544515876;
                j=74.79297908744907;
                break;
            case R.id.button7:
                i=13.351364309204449;
                j=74.78400371600424;
                break;
            case R.id.button8:
                i=13.353125887197102;
                j=74.78421973773456;
                break;
            case R.id.button9:
                i=13.349050121781907;
                j=74.78123978377079;
                break;

        }

        Intent in = new Intent(this, locationPage.class);
        in.putExtra(VAL,i);
        in.putExtra(VAL2,j);
        startActivity(in);
    }
}