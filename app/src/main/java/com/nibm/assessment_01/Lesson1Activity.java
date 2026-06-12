package com.nibm.assessment_01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson1Activity extends AppCompatActivity {
    Button button;
    TextView textview;
    EditText edittext;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson1);

        getSupportActionBar().hide();

        textview = findViewById(R.id.textView);

        edittext = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        imageview = findViewById(R.id.imageView);

        button.setOnClickListener(
                v -> {
                    String input = edittext.getText().toString();
                    Toast.makeText(Lesson1Activity.this, "You entered: " + input, Toast.LENGTH_SHORT).show();
                }
        );
    }
}