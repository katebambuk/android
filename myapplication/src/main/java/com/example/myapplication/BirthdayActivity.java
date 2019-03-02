package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class BirthdayActivity extends Activity {

    TextView textViewUsernameValue;
    TextView textViewMessageValue;
    String username = "Default username";
    String message = "Default message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        textViewUsernameValue = findViewById(R.id.textViewValueUsername);
        textViewMessageValue = findViewById(R.id.textViewValueMessage);

        username = getIntent().getStringExtra("username");
        message = getIntent().getStringExtra("message");

        textViewUsernameValue.setText(username);
        textViewMessageValue.setText(message);
    }

}
