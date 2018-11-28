package com.badtechnologies.bad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


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

    public void OnLogin(View view)
    {
        String username = UsernameET.getText().toString();
        String password = PasswordET.getText().toString();
        String type = "login";
        BackgroundWorker BGWorker = new BackgroundWorker(this);
        BGWorker.execute(type, username, password);
    }


}