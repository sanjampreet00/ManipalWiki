package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.project_sample.clubHomePage.VAL;
import static com.example.project_sample.clubHomePage.VAL2;

public class beachHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach_home_page);
    }

    public void directPage(View v)
    {
        double i=0,j=0;

        switch(v.getId()) {
            case R.id.button2:
                i=13.301866201967817;
                j=74.71902172502789;
                break;
            case R.id.button3:
                i=13.362398596054508;
                j=74.697478443403;
                break;
            case R.id.button4:
                i=13.614707741548873;
                j=74.67055162748596;
                break;
            case R.id.button5:
                i=13.416610841339608;
                j=74.69653675150656;
                break;
            case R.id.button6:
                i=13.705240572478974;
                j=74.64240081209476;
                break;
            case R.id.button7:
                i=13.27388967403391;
                j=74.72497161233643;
                break;
            case R.id.button8:
                i=13.136359161820874;
                j=74.7621692574308;
                break;
            case R.id.button9:
                i=13.223422168123852;
                j=74.73737925452436;
                break;
            case R.id.button10:
                i=13.516009238615217;
                j=74.68497035827302;
                break;
            case R.id.button11:
                i=13.41906535467912;
                j=74.6959250199192;
                break;
        }

        Intent in = new Intent(this, locationPage.class);
        in.putExtra(VAL,i);
        in.putExtra(VAL2,j);
        startActivity(in);
    }
}