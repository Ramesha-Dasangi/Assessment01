package com.nibm.assessment_01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson2Activity extends AppCompatActivity {
    EditText name,email,mobile;
    Button submit,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson2);

        getSupportActionBar().hide();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        mobile = findViewById(R.id.mobile);
        submit = findViewById(R.id.submitButton);
        clear = findViewById(R.id.clearButton);

        submit.setOnClickListener(
                v -> {
                    Intent intent = new Intent(Lesson2Activity.this,DisplayActivity.class);
                    intent.putExtra("name",name.getText().toString());
                    intent.putExtra("email",email.getText().toString());
                    intent.putExtra("mobile",mobile.getText().toString());
                    startActivity(intent);
                }
        );

        clear.setOnClickListener(
                v -> {
                    name.setText("");
                    email.setText("");
                    mobile.setText("");
                }
        );


    }
}