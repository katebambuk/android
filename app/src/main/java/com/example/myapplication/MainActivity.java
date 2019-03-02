package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;
    private EditText editTextField;
    private ImageView sychImg;
    private ImageView catImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView = findViewById(R.id.nameTextView);
        editTextField = findViewById(R.id.editText);
        editTextField = findViewById(R.id.editText);
        sychImg = findViewById(R.id.imageSych);
        catImg = findViewById(R.id.imageCat);
    }


    public void onClick(View view) {
        if (editTextField.getText().length() == 0) {
            nameTextView.setText(getString(R.string.threat));
            catImg.setVisibility(View.VISIBLE);
            sychImg.setVisibility(View.INVISIBLE);
        } else {
            String textToView = getString(R.string.basic_appeal) + " " + editTextField.getText();
            nameTextView.setText(textToView);
            catImg.setVisibility(View.INVISIBLE);
            sychImg.setVisibility(View.VISIBLE);
        }
    }

}
