package com.badtechnologies.bad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginScreen extends AppCompatActivity {


    EditText UsernameET, PasswordET;
    Button create_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        create_user = (Button) findViewById(R.id.button_create_user);
        create_user.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateUserActivity();
            }
        }));

        UsernameET = (EditText)findViewById(R.id.editText_username);
        PasswordET = (EditText)findViewById(R.id.editText_password);
    }

    public void openCreateUserActivity()
    {
        Intent intent = new Intent(this, Create_User.class);
        startActivity(intent);
    }

    public void openIdle(View view)
    {
        Intent a = new Intent(this, AddFood.class);
        startActivity(a);
    }







}