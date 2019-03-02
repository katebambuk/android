package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText editTextUsername;
    EditText editTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextMessage = findViewById(R.id.editTextMessage);
    }

    public void onClickAbout(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClickBirthday(View view) {
        Intent intent = new Intent(MainActivity.this, BirthdayActivity.class);
        intent.putExtra("username", editTextUsername.getText().toString());
        intent.putExtra("message", editTextMessage.getText().toString());
        startActivity(intent);
    }
}
