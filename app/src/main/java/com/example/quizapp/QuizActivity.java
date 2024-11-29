package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(view -> {
            // Example: Calculate Score
            int score = 0;
            RadioButton q1Answer = findViewById(R.id.radio1_q1);
            RadioButton q2Answer = findViewById(R.id.radio1_q2);

            if (q1Answer.isChecked()) score++;
            if (q2Answer.isChecked()) score++;

            // Pass score to ResultActivity
            Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
            intent.putExtra("score", score);
            startActivity(intent);
        });
    }
}

