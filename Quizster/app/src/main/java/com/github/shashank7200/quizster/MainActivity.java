package com.github.shashank7200.quizster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int index = 0;

    String questionArray [] = {
            "QUESTION 1: How to pass the data between activities in Android?",
            "QUESTION 2: How to move services to foreground in android?"
    };

    String correctAnswerArray [] ={
            "Intent",
            "No,We can't do this query"
    };

    String answeraArray [] = {
            "Intent",
            "Services always work in Foreground only"
    };
    String answerbArray [] = {
            "Content Provider",
            "No,We can't do this query"
    };
    String answercArray [] = {};
    String answerdArray [] = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * @param view
     * Method to pass the score value to SubmitActivity Class when submit button is clicked
     */
    public void submitScore(View view){
        Intent intent = new Intent(MainActivity.this,SubmitActivity.class);
        intent.putExtra("Score", score);
        startActivity(intent);
    }

    public void resetQuestion(View view){
        index = 0;
        score = 0;
        showQuestion();
    }

    public void nextQuestion(View view){
        checkAnswer();
        index ++;
        showQuestion();
    }

    private void checkAnswer() {

        RadioGroup radiogroup =  (RadioGroup) findViewById(R.id.groupid);
        int selectedId = radiogroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);

        if( radioButton.getText().toString() == correctAnswerArray[index]){
            score += 3;
        }
    }

    private void showQuestion() {

        if(index < questionArray.length){
            TextView questionView = (TextView) findViewById(R.id.question);
            RadioButton answeraView = (RadioButton) findViewById(R.id.answera);
            RadioButton answerbView = (RadioButton) findViewById(R.id.answerb);
            RadioButton answercView = (RadioButton) findViewById(R.id.answerc);
            RadioButton answerdView = (RadioButton) findViewById(R.id.answerd);

            questionView.setText(questionArray[index]);
            answeraView.setText(answeraArray[index]);
            answerbView.setText(answerbArray[index]);
//            answercView.setText(answercArray[index]);
//            answerdView.setText(answerdArray[index]);
        }
        else{
            Toast.makeText(getApplicationContext()," You are at the end of quiz. Please Submit to get your Score!",Toast.LENGTH_LONG).show();
        }
    }

}
