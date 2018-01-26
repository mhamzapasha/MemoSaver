package com.example.muhammad_hamza.memosaver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SigninScreen extends AppCompatActivity {

    public Button sign_back_btn = (Button)findViewById(R.id.back_signin);
    public Button sign_submit_btn = (Button)findViewById(R.id.submit_signin);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_screen);

        sign_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_login_intent = new Intent(SigninScreen.this, MainActivity.class);
                startActivity(home_login_intent);

            }
        });

    }



}
