package com.github.shashank7200.quizster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.github.shashank7200.quizster.R.id.answer2a;
import static com.github.shashank7200.quizster.R.id.answer4a;
import static com.github.shashank7200.quizster.R.id.answer4b;
import static com.github.shashank7200.quizster.R.id.answer4c;
import static com.github.shashank7200.quizster.R.id.answer4d;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param view
     * Method triggered when  the Submit button is clicked to display the final Score.
     */
    public void submitScore(View view){
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();

        EditText editText = (EditText) findViewById(R.id.name);
        String name = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this,SubmitActivity.class);
        intent.putExtra("Score", score);
        intent.putExtra("Name", name);
        score = 0;
        startActivity(intent);
    }
    /**
     * Method to increment the user score if the option is correct.
     */
    private void incrementScore (){
        score += 10;
    }

    /**
     * Methods to check whether Correct answer is picked or not.
     */

    private void question1(){
        RadioButton answer1c = (RadioButton)findViewById(R.id.answer1c);

        if (answer1c.isChecked()){
            incrementScore();
        }

    }

    private void question2(){
        RadioButton answer2a = (RadioButton)findViewById(R.id.answer2a);
        if (answer2a.isChecked()){
            incrementScore();
        }

    }

    private void question3(){
        RadioButton answer3d = (RadioButton)findViewById(R.id.answer3d);
        if (answer3d.isChecked()){
            incrementScore();
        }
    }

    private void question4(){
        CheckBox answer4a = (CheckBox)findViewById(R.id.answer4a);
        CheckBox answer4b = (CheckBox)findViewById(R.id.answer4b);
        CheckBox answer4d = (CheckBox)findViewById(R.id.answer4d);
        CheckBox answer4c = (CheckBox)findViewById(R.id.answer4c);
        if (answer4a.isChecked() && answer4c.isChecked() && !answer4b.isChecked() && !answer4d.isChecked() ){
            incrementScore();
        }

    }
    private void question5(){
        RadioButton answer5b = (RadioButton)findViewById(R.id.answer5b);
        if (answer5b.isChecked()){
            incrementScore();
        }

    }
    private void question6(){
        RadioButton answer6c = (RadioButton)findViewById(R.id.answer6c);
        if (answer6c.isChecked()){
            incrementScore();
        }

    }

    private void question7(){
        RadioButton answer7c = (RadioButton)findViewById(R.id.answer7c);
        if (answer7c.isChecked()){
            incrementScore();
        }

    }

    private void question8(){
        RadioButton answer8c = (RadioButton)findViewById(R.id.answer8c);
        if (answer8c.isChecked()){
            incrementScore();
        }

    }

    private void question9(){
        RadioButton answer9b = (RadioButton)findViewById(R.id.answer9b);
        if (answer9b.isChecked()){
            incrementScore();
        }

    }

    private void question10(){
        CheckBox answer10a = (CheckBox)findViewById(R.id.answer10a);
        CheckBox answer10b = (CheckBox)findViewById(R.id.answer10b);
        CheckBox answer10d = (CheckBox)findViewById(R.id.answer10d);
        CheckBox answer10c = (CheckBox)findViewById(R.id.answer10c);
        if (answer10a.isChecked() && answer10c.isChecked() && answer10b.isChecked() && answer10d.isChecked()){
            incrementScore();
        }

    }

}
