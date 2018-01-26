package com.example.muhammad_hamza.memosaver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button home_signup_btn = (Button)findViewById(R.id.signup_btn);
    Button home_signin_btn = (Button)findViewById(R.id.signin_btn);

    MemoDATABASE mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mydb = new MemoDATABASE(this);

        home_signin_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_signin = new Intent( MainActivity.this , SigninScreen.class );
                startActivity(intent_signin);
            }
        });

        home_signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_signup = new Intent(MainActivity.this, SignupScreen.class);
                startActivity(intent_signup);
            }
        });



    }
}
