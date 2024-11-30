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
            RadioButton q3Answer = findViewById(R.id.radio3_q3);
            RadioButton q4Answer = findViewById(R.id.radio4_q4);
            RadioButton q5Answer = findViewById(R.id.radio2_q5);


            if (q1Answer.isChecked()) score++;
            if (q2Answer.isChecked()) score++;
            if (q3Answer.isChecked()) score++;
            if (q4Answer.isChecked()) score++;
            if (q5Answer.isChecked()) score++;

            // Pass score to ResultActivity
            Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
            intent.putExtra("score", score);
            startActivity(intent);
        });
    }
}

