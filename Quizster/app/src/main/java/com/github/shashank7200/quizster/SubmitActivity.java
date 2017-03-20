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

        int finalScore = i.getIntExtra("Score",0);
        String userName = i.getStringExtra("Name");
        TextView scoreDisplay = (TextView) findViewById(R.id.score_display);
        if (userName.isEmpty()){
            scoreDisplay.setText("Your Score: "+finalScore);
        }
        else {
            scoreDisplay.setText(userName + "\'s \nScore: " + finalScore);
        }
    }

    public void showExplanation(View view){
        Intent intent = new Intent(SubmitActivity.this, ExplanationActivity.class);
        startActivity(intent);
    }

}
