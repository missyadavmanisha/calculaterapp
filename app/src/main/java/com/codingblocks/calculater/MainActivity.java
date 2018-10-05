package com.codingblocks.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,add,subtract,divide,multiply,equalsto,clr,log,factorial,power,percent;
    EditText edit;
    float num1,num2;
    boolean ap,sp,mp,dp,fp,pp,lp,perp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        add=(Button)findViewById(R.id.plus);
        subtract=(Button)findViewById(R.id.minus);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        clr=(Button)findViewById(R.id.clear);
        equalsto=(Button)findViewById(R.id.power);
        edit= (EditText) findViewById(R.id.edit);
        log=(Button)findViewById(R.id.log);
        percent=(Button)findViewById(R.id.percent);
        factorial=(Button)findViewById(R.id.factorial);
        power=(Button)findViewById(R.id.power1);





    }

    public void nine(View view) {
        edit.setText(edit.getText()+"9");
    }

    public void clr(View view) {
        edit.setText("");
    }

    public void zero(View view) {
        edit.setText(edit.getText()+"0");
    }

    public void seven(View view) {
        edit.setText(edit.getText()+"7");
    }

    public void six(View view) {
        edit.setText(edit.getText()+"6");
    }

    public void five(View view) {
        edit.setText(edit.getText()+"5");
    }

    public void four(View view) {
        edit.setText(edit.getText()+"4");
    }

    public void three(View view) {
        edit.setText(edit.getText()+"3");
    }

    public void two(View view) {
        edit.setText(edit.getText()+"2");
    }

    public void one(View view) {
        edit.setText(edit.getText()+"1");
    }

    public void eight(View view) {
        edit.setText(edit.getText()+"8");
    }

    public void equalsto(View view) {

            num2 = Float.parseFloat(edit.getText() + "");

        if(ap==true)
        {
            edit.setText((num1+num2)+"");
            ap=false;
        }
        if(dp==true)
        {
            edit.setText((num1/num2)+"");
            dp=false;
        }
        if(sp==true)
        {
            edit.setText((num1-num2)+"");
            sp=false;
        }
        if(mp==true)
        {
            edit.setText((num1*num2)+"");
            mp=false;
        }
        if(pp==true)

        {
            int m= (int)Math.pow(num1,num2);
            edit.setText((m)+"");
            pp=false;
        }
        if(lp==true)
        {
            float m= (float)Math.log(num1);
            edit.setText((m)+"");
            lp=false;
        }
        if(perp==true)
        {
            edit.setText(((num1+num2)/2)+"");
            mp=false;
        }
        if(fp==true)
        {
            if(edit==null)
            {
                edit.setText("");
            }
            int m=(int)num1;int fact=1;
            for(int i=1;i<=m;i++)
            {
               fact=fact*i;
            }
            edit.setText(fact+"");
            fp=false;
        }
    }

    public void divide(View view) {
        num1=Float.parseFloat(edit.getText()+"");
        dp=true;
        edit.setText(null);
    }

    public void multiply(View view) {
        num1=Float.parseFloat(edit.getText()+"");
        mp=true;
        edit.setText(null);
    }

    public void subtract(View view) {
        num1=Float.parseFloat(edit.getText()+"");
        sp=true;
        edit.setText(null);
    }

    public void add(View view) {
        num1=Float.parseFloat(edit.getText()+"");
        ap=true;
        edit.setText(null);

    }

    public void percent(View view) {

        num1 = Float.parseFloat(edit.getText() + "");
        perp = true;
        edit.setText(null);
    }


    public void power(View view) {
        num1=Float.parseFloat(edit.getText()+"");
        pp=true;
        edit.setText(null);

    }

    public void factorial(View view) {
        num1=Float.parseFloat(edit.getText()+"");
        fp=true;


    }

    public void log(View view) {
        num1=Float.parseFloat(edit.getText()+"");
        lp=true;


    }
}
