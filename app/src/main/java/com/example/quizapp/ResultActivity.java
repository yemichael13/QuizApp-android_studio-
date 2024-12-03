package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvScore = findViewById(R.id.tvScore);
        int score = getIntent().getIntExtra("score", 0);
        tvScore.setText("Your Score: " + score + "/5");

        TextView comment = findViewById(R.id.greatJob);
        if(score < 2){
            comment.setText("Not Bad");
        } else if (score <= 4) {
            comment.setText("Greate Job");
        }
        else{
            comment.setText("Exelent");
        }

        Button btnViewAnswers = findViewById(R.id.btnViewAnswers);
        btnViewAnswers.setOnClickListener(view -> {
            Intent intent = new Intent(ResultActivity.this, AnswersActivity.class);
            startActivity(intent);
        });
    }
}

