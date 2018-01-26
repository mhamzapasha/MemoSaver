package com.example.muhammad_hamza.memosaver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupScreen extends AppCompatActivity {


    Button signup_back_btn = (Button)findViewById(R.id.back_submit);
    //Button submit_signup_btn = (Button)findViewById(R.id.signup_btn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

        signup_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_signup_intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(home_signup_intent);
            }
        });

    }
}
