package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class clubHomePage extends AppCompatActivity implements View.OnClickListener{

    public static final String VAL="com.example.project_sample.VAL";
    public static final String VAL2="com.example.project_sample.VAL2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_home_page);

        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Button button5=findViewById(R.id.button5);
        Button button6=findViewById(R.id.button6);
        Button button7=findViewById(R.id.button7);
        Button button8=findViewById(R.id.button8);
        Button button9=findViewById(R.id.button9);
        Button button10=findViewById(R.id.button10);

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

    }
    public void directPage(View view)
    {

    }

    @Override
    public void onClick(View v) {
        double i=0,j=0;

        switch(v.getId()) {
            case R.id.button2:
                i=13.355087544811102;
                j=74.79795858802285;
                break;
            case R.id.button3:
                i=13.355489434427241;
                j=74.79692983420142;
                break;
            case R.id.button4:
                i=13.354779849179144;
                j=74.79315391856929;
                break;
            case R.id.button5:
                i=13.36172954844803;
                j=74.78270274913334;
                break;
            case R.id.button6:
                i=13.354810013094186;
                j=74.79592913730664;
                break;
            case R.id.button7:
                i=13.365570908308923;
                j=74.77421162717674;
                break;
            case R.id.button8:
                i=13.358305138760985;
                j=74.78461882242487;
                break;
            case R.id.button9:
                i=13.359217548415948;
                j=74.78502117315531;
                break;
            case R.id.button10:
                i=13.355380241842672;
                j=74.79829994725638;
                break;
        }

        Intent in = new Intent(this, locationPage.class);
        in.putExtra(VAL,i);
        in.putExtra(VAL2,j);
        startActivity(in);
    }
}