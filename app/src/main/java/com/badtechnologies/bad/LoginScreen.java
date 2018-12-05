package com.badtechnologies.bad;



import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class LoginScreen extends AppCompatActivity {


    


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


        final EditText et = (EditText) findViewById(R.id.UN);
        final EditText et1 = (EditText) findViewById(R.id.PW);


        findViewById(R.id.button_login).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
                {
                    String un = et.getText().toString();
                    String pw = et1.getText().toString();

                    login(un, pw);
                    homey(v);
                }

        });
    }

            public void toCU(View view)
            {
                Intent intent = new Intent(this, Create_User.class);
                startActivity(intent);
            }

            public void login(String u, String p)
            {
                AlertDialog ad;
                String message = "Successfuly Logged in!";
                ad = new AlertDialog.Builder(this).create();
                ad.setMessage(message);

                if ((u.equals("BradSutton123") && p.equals("123"))) {
                    ad.show();
                }
                else if ((u.equals("Will123") && p.equals("234")))
                {
                    ad.show();

                }
                else if ((u.equals("Kysa123") && p.equals("345")))
                {
                    ad.show();
                }
                else if ((u.equals("Maddy123") && p.equals("456")))
                {
                    ad.show();
                }
                else if ((u.equals("Wheat123") && p.equals("567")))
                {
                    ad.show();
                }
                else
                {
                    ad.setMessage("Failed Log In!");
                    ad.show();
                }


            }

            public void homey(View v)
            {
                Intent intent = new Intent(this, home.class);
                startActivity(intent);
            }

        }
