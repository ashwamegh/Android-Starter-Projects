package com.github.shashank7200.quizster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by AshwaMegh on 15-03-2017.
 */

public class SubmitActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        Intent i = getIntent();

        int finalScore = i.getIntExtra("Score", 0);
        String userName = i.getStringExtra("Name");
        TextView scoreDisplay = (TextView) findViewById(R.id.score_display);


        if (userName.trim().isEmpty() || userName.trim() == null) {
            scoreDisplay.setText("Your Score: " + finalScore);
        } else {
            scoreDisplay.setText(userName + "\'s \nScore: " + finalScore);
        }
    }

    /**
     * @param view Method to receive intents & extras from MainActivity and passes it to ExplanationActivity.
     */
    public void showExplanation(View view) {
        Intent i = getIntent();
        String answer1 = i.getStringExtra("answer1");
        String answer2 = i.getStringExtra("answer2");
        String answer3 = i.getStringExtra("answer3");
        String answer4 = i.getStringExtra("answer4");
        String answer5 = i.getStringExtra("answer5");
        String answer6 = i.getStringExtra("answer6");
        String answer7 = i.getStringExtra("answer7");
        String answer8 = i.getStringExtra("answer8");
        String answer9 = i.getStringExtra("answer9");
        String answer10 = i.getStringExtra("answer10");

        Intent intent = new Intent(SubmitActivity.this, ExplanationActivity.class);
        intent.putExtra("answer1", answer1);
        intent.putExtra("answer2", answer2);
        intent.putExtra("answer3", answer3);
        intent.putExtra("answer4", answer4);
        intent.putExtra("answer5", answer5);
        intent.putExtra("answer6", answer6);
        intent.putExtra("answer7", answer7);
        intent.putExtra("answer8", answer8);
        intent.putExtra("answer9", answer9);
        intent.putExtra("answer10", answer10);

        startActivity(intent);
    }

}
