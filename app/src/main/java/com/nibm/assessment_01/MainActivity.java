package com.nibm.assessment_01;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button lesson1,lesson2,lesson3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        lesson1 = findViewById(R.id.Lesson1Button);

        lesson2 = findViewById(R.id.Lesson2Button);

        lesson3 = findViewById(R.id.Lesson3Button);

        lesson1.setOnClickListener(
                view ->{
                    Log.d("click event","clicked");
                    Intent intent =  new Intent(MainActivity.this,Lesson1Activity.class);

                    startActivity(intent);
                }
        );

        lesson2.setOnClickListener(
                view ->{
                    Intent intent = new Intent(MainActivity.this,Lesson2Activity.class);

                    startActivity(intent);
                }
        );

        lesson3.setOnClickListener(
                view ->{
                    Intent intent = new Intent(MainActivity.this,Lesson3Activity.class);

                    startActivity(intent);
                }
        );

    }
}