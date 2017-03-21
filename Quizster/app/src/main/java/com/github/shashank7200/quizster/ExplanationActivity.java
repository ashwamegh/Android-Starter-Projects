package com.github.shashank7200.quizster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by AshwaMegh on 20-03-2017.
 */

public class ExplanationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

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


        /**
         * Sets the Users answer in the TexViews before Correct answer in Explanation layout.
         */

        TextView userAnswer1 = (TextView) findViewById(R.id.useranswer1);
        userAnswer1.setText("Your Answer 1: "+answer1);

        TextView userAnswer2 = (TextView) findViewById(R.id.useranswer2);
        userAnswer2.setText("Your Answer 2: "+answer2);

        TextView userAnswer3 = (TextView) findViewById(R.id.useranswer3);
        userAnswer3.setText("Your Answer 3: "+answer3);

        TextView userAnswer4 = (TextView) findViewById(R.id.useranswer4);
        userAnswer4.setText("Your Answer 4: "+answer4);

        TextView userAnswer5 = (TextView) findViewById(R.id.useranswer5);
        userAnswer5.setText("Your Answer 5: "+answer5);

        TextView userAnswer6 = (TextView) findViewById(R.id.useranswer6);
        userAnswer6.setText("Your Answer 6: "+answer6);

        TextView userAnswer7 = (TextView) findViewById(R.id.useranswer7);
        userAnswer7.setText("Your Answer 7: "+answer7);

        TextView userAnswer8 = (TextView) findViewById(R.id.useranswer8);
        userAnswer8.setText("Your Answer 8: "+answer8);

        TextView userAnswer9 = (TextView) findViewById(R.id.useranswer9);
        userAnswer9.setText("Your Answer 9: "+answer9);

        TextView userAnswer10 = (TextView) findViewById(R.id.useranswer10);
        userAnswer10.setText("Your Answer 10: "+answer10);

        Log.d("Called Explanation","Explanation activity ended");
    }

    public void goBackToMain(View view){
        Intent i = new Intent(ExplanationActivity.this, MainActivity.class);

        startActivity(i);
    }
}
