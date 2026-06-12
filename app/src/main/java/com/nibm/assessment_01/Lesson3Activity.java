package com.nibm.assessment_01;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson3);

        getSupportActionBar().hide();

        FragmentA fragmentA = new FragmentA();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(
                        R.id.fragmentId,
                        fragmentA
                )
                .commit();

    }
}