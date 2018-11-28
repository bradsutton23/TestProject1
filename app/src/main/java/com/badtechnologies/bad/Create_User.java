package com.badtechnologies.bad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Create_User extends AppCompatActivity {
    Button returnToLogin;
    Button login_screen;
    EditText username, password, firstname, lastname, gender, age, height, weight;
    String str_username, str_password, str_firstname, str_lastname, str_gender, str_age, str_height, str_weight;


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

    public void OnReg(View view)
    {
        String str_username = username.getText().toString();
        String str_password = password.getText().toString();
        String str_firstname = firstname.getText().toString();
        String str_lastname = lastname.getText().toString();
        String str_gender = gender.getText().toString();
        String str_age = age.getText().toString();
        String str_height = height.getText().toString();
        String str_weight = weight.getText().toString();
        String type = "register";
        BackgroundWorker BGWorker = new BackgroundWorker(this);
        BGWorker.execute(type, str_username, str_password, str_firstname, str_lastname, str_gender, str_age, str_height, str_weight);
    }

    public void openCreateUserActivity()
    {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }







}
