package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
    public void openNew(View v)
    {
        if(v.getId()==R.id.p2)
        {
            Intent in = new Intent(this, beachHomePage.class);
            startActivity(in);
        }else if(v.getId()==R.id.p3)
        {
            Intent in = new Intent(this, resHomePage.class);
            startActivity(in);
        }
        else if(v.getId()==R.id.p4)
        {
            Intent in = new Intent(this, rentalHomePage.class);
            startActivity(in);
        }
        else if(v.getId()==R.id.b4)
        {
            Intent in = new Intent(this, sightHomePage.class);
            startActivity(in);
        }
        else if(v.getId()==R.id.p5)
        {
            Intent in = new Intent(this, recHomePage.class);
            startActivity(in);
        }
        else if(v.getId()==R.id.b6)
        {
            Intent in = new Intent(this, clubHomePage.class);
            startActivity(in);
        }else if(v.getId()==R.id.b7)
        {
            Intent in = new Intent(this, transHomePage.class);
            startActivity(in);
        }
        else if(v.getId()==R.id.b8)
        {
            Intent in = new Intent(this, locationPage.class);
            startActivity(in);
        }


    }
}