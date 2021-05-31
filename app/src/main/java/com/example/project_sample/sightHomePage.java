package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.project_sample.clubHomePage.VAL;
import static com.example.project_sample.clubHomePage.VAL2;

public class sightHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight_home_page);
    }

    public void directPage(View v)
    {
        double i=0,j=0;

        switch(v.getId()) {
            case R.id.button2:
                i=13.375185291400781;
                j=74.78204762004708;
                break;
            case R.id.button3:
                i=13.372926040368096;
                j=74.78528631597895;
                break;
            case R.id.button4:
                i=13.342034287967536;
                j=74.78561678090783;
                break;
            case R.id.button5:
                i=13.367216336042235;
                j=74.7689813105161;
                break;
            case R.id.button6:
                i=13.297596395793033;
                j=74.754369498406;
                break;
            case R.id.button7:
                i=13.404297852449961;
                j=74.72325599466464;
                break;
            case R.id.button8:
                i=13.302408192466666;
                j=74.71966107071154;
                break;
            case R.id.button9:
                i=13.559307518422846;
                j=75.16837059826848;
                break;
            case R.id.button12:
                i=13.410248232736038;
                j=74.71547231210694;
                break;
            case R.id.button13:
                i=13.103869913687209;
                j=74.79017291048407;
                break;
            case R.id.button14:
                i=13.38250337626942;
                j=74.6738576072577;
                break;
            case R.id.button15:
                i=13.34581365003406;
                j=74.79110827531969;
                break;
            case R.id.button16:
                i=13.337081930938503;
                j=74.79351917530539;
                break;
            case R.id.button17:
                i=13.350512296221112;
                j=74.69103233413487;
                break;
            case R.id.button18:
                i=13.371991398850176;
                j=74.76113563356479;
                break;
        }

        Intent in = new Intent(this, locationPage.class);
        in.putExtra(VAL,i);
        in.putExtra(VAL2,j);
        startActivity(in);
    }
}