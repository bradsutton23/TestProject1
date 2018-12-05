package com.badtechnologies.bad;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;

public class Create_User extends AppCompatActivity {

    EditText username, password, firstname, lastname, gender, age, height, weight;
    AlertDialog ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__user);


        username = (EditText) findViewById(R.id.editText_newUserName);
        password = (EditText) findViewById(R.id.editText_newPassword);
        firstname = (EditText) findViewById(R.id.editText_newFName);
        lastname = (EditText) findViewById(R.id.editText_newLName);
        gender = (EditText) findViewById(R.id.editText_newGender);
        age = (EditText) findViewById(R.id.editText_newAge);
        height = (EditText) findViewById(R.id.editText_newHeight);
        weight = (EditText) findViewById(R.id.editText_newWeight);

    }

    public void OnReg(View v)
    {
        String un = username.getText().toString();
        String pw = password.getText().toString();
        String fn = firstname.getText().toString();
        String ln = lastname.getText().toString();
        String ge = gender.getText().toString();
        String ag = age.getText().toString();
        String h = height.getText().toString();
        String w = weight.getText().toString();
        String type = "register";
        BackgroundWorker BGWorker = new BackgroundWorker(this);
        BGWorker.execute(type, un, pw, fn, ln, ge, ag, h, w);
        ad = new AlertDialog.Builder(this).create();
        ad.setMessage("You Have Successfully Signed Up!");
        ad.show();
        openMain(v);


    }


    public void openCreateUserActivity(View view)
    {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }

    public void openMain(View view)
    {
        Intent intent = new Intent(this, AddFood.class);
        startActivity(intent);
    }

}
