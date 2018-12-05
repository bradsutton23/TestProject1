package com.badtechnologies.bad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;




public class home extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setText(getIntent().getStringExtra("TOTAL"));

        final EditText et1 = (EditText)findViewById(R.id.et1);
        final EditText et2 = (EditText)findViewById(R.id.et2);
        final TextView tv2 = (TextView)findViewById(R.id.tv2);
        final EditText et3 = (EditText)findViewById(R.id.et3);
        final EditText et4 = (EditText)findViewById(R.id.et4);
        final TextView tv3 = (TextView)findViewById(R.id.tv3);
        final TextView tv4 = (TextView)findViewById(R.id.tv4);
        final TextView tv5 = (TextView)findViewById(R.id.tv5);


        findViewById(R.id.bmiButton).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String h = et1.getText().toString();
                String w = et2.getText().toString();
                String a = et3.getText().toString();
                String g = et4.getText().toString();

                if(TextUtils.isEmpty(h))
                {
                    et1.setError("Please enter your height!");
                    et1.requestFocus();
                    return;
                }
                if(TextUtils.isEmpty(w))
                {
                    et2.setError("Please enter your weight");
                    et2.requestFocus();
                    return;
                }
                if(TextUtils.isEmpty(a))
                {
                    et3.setError("Please enter your Age");
                    et3.requestFocus();
                    return;
                }
                if(TextUtils.isEmpty(g))
                {
                    et4.setError("Please enter your Gender");
                    et4.requestFocus();
                    return;
                }


                float height = Float.parseFloat(h);
                float weight = Float.parseFloat(w);
                int age = Integer.parseInt(a);
                String gender = g;

                Double mheight = height * 2.54;
                Double mweight  = weight * .45;
                Double bmr = BMR(gender, age, mweight, mheight);


                float bmi = calBMI(weight, height);

                String result = evalBMI(bmi);

                tv2.setText(String.valueOf("Your BMI value is: " + bmi + " Which is " + result));
                tv3.setText(String.valueOf("Your need to consume: " + bmr + " Calories to maintain your weight"));
                tv4.setText(String.valueOf("To gain 1 pound a week you need to consume: " + (bmr + 500) + " Calories"));
                tv5.setText(String.valueOf("To Lose 1 pound a week you need to consume: "+ (bmr - 500) + " Calories"));
            }
        });
    }
    private float calBMI (float weight, float height)
    {
        return  (float) (weight / (height * height)) * 703;
    }


    private Double BMR(String gender, int age, Double mweight, Double mheight)
    {

        if (gender.equalsIgnoreCase("M"))
        {
            return 10 * mweight + 6.25 * mheight - 5 * age + 5;
        }
        else
        {
            return 10 * mweight + 6.25 * mheight - 5 * age - 161;
        }
    }


    private String evalBMI(float bmi) {

        if (bmi < 16) {
            return "Severely underweight";
        } else if (bmi < 18.5) {

            return "Underweight";
        } else if (bmi < 25) {

            return "Normal";
        } else if (bmi < 30) {

            return "Overweight";
        } else {
            return "Obese";
        }
    }



     public void toFood(View view)
    {
        Intent intent = new Intent(this, AddFood.class);
        startActivity(intent);
    }

    public void toLogin(View view)
    {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }
}


