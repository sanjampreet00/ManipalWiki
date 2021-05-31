package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.project_sample.clubHomePage.VAL;
import static com.example.project_sample.clubHomePage.VAL2;

public class transHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans_home_page);

    }

    public void directPage(View v)
    {
        double i=0,j=0;

        switch(v.getId()) {
            case R.id.button2:
                i=13.35514350573743;
                j=74.79421783547367;
                break;
            case R.id.button3:
                i=13.352420484157912;
                j=74.78381924614801;
                break;
            case R.id.button4:
                i=13.349940401288015;
                j=74.78393191765194;
                break;
            case R.id.button5:
                i=13.358353159073939;
                j=74.78465614012967;
                break;
            case R.id.button6:
                i=13.3592679063424;
                j=74.78443630223522;
                break;
            case R.id.button7:
                i=13.352987848800252;
                j=74.7912135496095;
                break;
            case R.id.button8:
                i=13.353286869463373;
                j=74.79087013712402;
                break;
            case R.id.button9:
                i=13.35505835548198;
                j=74.79486623505079;
                break;
            case R.id.button12:
                i=13.358394773694243;
                j=74.78450002989416;
                break;
            case R.id.button13:
                i=13.348670436523603;
                j=74.7767606280215;
                break;
            case R.id.button14:
                i=13.348743996235665;
                j=74.78594345657336;
                break;
            case R.id.button15:
                i=13.351843633262478;
                j=74.78650571436837;
                break;
            case R.id.button16:
                i=13.346400761281576;
                j=74.79010026572713;
                break;
            case R.id.button17:
                i=13.352932441644953;
                j=74.79012052802835;
                break;
            case R.id.button18:
                i=13.352914435165824;
                j=74.79002809241275;
                break;
            case R.id.button19:
                i=13.357168173170013;
                j=74.78400778900274;
                break;
        }

        Intent in = new Intent(this, locationPage.class);
        in.putExtra(VAL,i);
        in.putExtra(VAL2,j);
        startActivity(in);
    }
}