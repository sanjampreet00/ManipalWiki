package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.project_sample.clubHomePage.VAL;
import static com.example.project_sample.clubHomePage.VAL2;

public class resHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_home_page);
    }

    public void directPage(View v)
    {
        double i=0,j=0;

        switch(v.getId()) {
            case R.id.button2:
                i=13.35226232500303;
                j=74.78413367397108;
                break;
            case R.id.button3:
                i=13.351568732819187;
                j=74.78743593972877;
                break;
            case R.id.button4:
                i=13.34887447600765;
                j=74.77994169781509;
                break;
            case R.id.button5:
                i=13.361186765882547;
                j=74.78302558809017;
                break;
            case R.id.button6:
                i=13.351028692659343;
                j=74.78394328611445;
                break;
            case R.id.button7:
                i=13.351897746797755;
                j=74.78747772279209;
                break;
            case R.id.button8:
                i=13.34782329563462;
                j=74.78374690201423;
                break;
            case R.id.button9:
                i=13.35243551520213;
                j=74.78865580124265;
                break;
            case R.id.button20:
                i=13.346953923884785;
                j=74.78419859468734;
                break;
            case R.id.button21:
                i=13.330189015715955;
                j=74.74385335654807;
                break;
            case R.id.button22:
                i=13.359151779515745;
                j=74.78432279516952;
                break;
            case R.id.button23:
                i=13.358429288821164;
                j=74.78427814790022;
                break;
            case R.id.button24:
                i=13.35917780785641;
                j=74.78521005720557;
                break;
            case R.id.button25:
                i=13.350290719672438;
                j=74.7873942195287;
                break;
            case R.id.button26:
                i=13.352764669738455;
                j=74.78954881295974;
                break;
            case R.id.button27:
                i=13.348940629559355;
                j=74.78200553991903;
                break;
            case R.id.button28:
                i=13.3510772031001;
                j=74.78796929408028;
                break;
            case R.id.button29:
                i=13.348296034702079;
                j=74.78280579063636;
                break;
            case R.id.button30:
                i=13.354186140241072;
                j=74.7841245131171;
                break;
            case R.id.button31:
                i=13.353283341623163;
                j=74.7881123748435;
                break;
            case R.id.button32:
                i=13.353410632815851;
                j=74.78975668724199;
                break;
            case R.id.button33:
                i=13.35375262159819;
                j=74.78577414120547;
                break;

        }

        Intent in = new Intent(this, locationPage.class);
        in.putExtra(VAL,i);
        in.putExtra(VAL2,j);
        startActivity(in);
    }
}