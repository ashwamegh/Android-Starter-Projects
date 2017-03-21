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
import static com.github.shashank7200.quizster.R.id.answer2b;
import static com.github.shashank7200.quizster.R.id.answer4a;
import static com.github.shashank7200.quizster.R.id.answer4b;
import static com.github.shashank7200.quizster.R.id.answer4c;
import static com.github.shashank7200.quizster.R.id.answer4d;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param view Method triggered when  the Submit button is clicked to display the final Score.
     */
    public void submitScore(View view) {
        /**
         * Function Calls to check the user answers.
         */
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

        /**
         * Intent & extras to pass to SubmitActivity Class.
         */
        Intent intent = new Intent(MainActivity.this, SubmitActivity.class);
        intent.putExtra("Score", score);
        intent.putExtra("Name", name);
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
        score = 0;
        startActivity(intent);
    }


    /**
     * Method to increment the user score if the option is correct.
     */
    private void incrementScore() {
        score += 10;
    }

    /**
     * Methods to check whether Correct answer is picked or not.
     */

    private void question1() {
        RadioButton answer1c = (RadioButton) findViewById(R.id.answer1c);
        RadioButton answer1a = (RadioButton) findViewById(R.id.answer1a);
        RadioButton answer1b = (RadioButton) findViewById(R.id.answer1b);
        RadioButton answer1d = (RadioButton) findViewById(R.id.answer1d);

        if (answer1c.isChecked()) {
            incrementScore();
            answer1 = "C";
        }
        if (answer1a.isChecked()) {
            answer1 = "A";
        }
        if (answer1b.isChecked()) {

            answer1 = "B";
        }
        if (answer1d.isChecked()) {
            answer1 = "D";
        }
        if (answer1 == null) {
            answer1 = "You haven't selected anything!";
        }

    }

    private void question2() {
        RadioButton answer2a = (RadioButton) findViewById(R.id.answer2a);
        RadioButton answer2b = (RadioButton) findViewById(R.id.answer2b);
        RadioButton answer2c = (RadioButton) findViewById(R.id.answer2c);
        RadioButton answer2d = (RadioButton) findViewById(R.id.answer2d);
        if (answer2a.isChecked()) {
            incrementScore();
            answer2 = "A";
        }
        if (answer2b.isChecked()) {
            answer2 = "B";
        }
        if (answer2c.isChecked()) {
            answer2 = "C";
        }
        if (answer2d.isChecked()) {
            answer2 = "D";
        }
        if (answer2 == null) {
            answer2 = "You haven't selected anything!";
        }

    }

    private void question3() {
        RadioButton answer3d = (RadioButton) findViewById(R.id.answer3d);
        RadioButton answer3a = (RadioButton) findViewById(R.id.answer3a);
        RadioButton answer3b = (RadioButton) findViewById(R.id.answer3b);
        RadioButton answer3c = (RadioButton) findViewById(R.id.answer3c);
        if (answer3d.isChecked()) {
            incrementScore();
            answer3 = "D";
        }
        if (answer3a.isChecked()) {
            answer3 = "A";
        }
        if (answer3b.isChecked()) {
            answer3 = "B";
        }
        if (answer3c.isChecked()) {
            answer3 = "C";
        }
        if (answer3 == null) {
            answer3 = "You haven't selected anything!";
        }
    }

    private void question4() {
        CheckBox answer4a = (CheckBox) findViewById(R.id.answer4a);
        CheckBox answer4b = (CheckBox) findViewById(R.id.answer4b);
        CheckBox answer4d = (CheckBox) findViewById(R.id.answer4d);
        CheckBox answer4c = (CheckBox) findViewById(R.id.answer4c);
        if (answer4a.isChecked() && answer4c.isChecked() && !answer4b.isChecked() && !answer4d.isChecked()) {
            incrementScore();
            answer4 = "A,C";
            return;
        }
        if (answer4a.isChecked()) {

            answer4 = "A";
        }
        if (answer4b.isChecked()) {
            if (answer4 == null) {
                answer4 = "B";
            } else {
                answer4 = answer4 + ", B";
            }
        }
        if (answer4c.isChecked()) {
            if (answer4 == null) {
                answer4 = "C";
            } else {
                answer4 = answer4 + ", C";
            }

        }
        if (answer4d.isChecked()) {
            if (answer4 == null) {
                answer4 = "D";
            } else {
                answer4 = answer4 + ", D";
            }
        }
        if (answer4 == null) {
            answer4 = "You haven't selected anything!";
        }

    }

    private void question5() {
        RadioButton answer5b = (RadioButton) findViewById(R.id.answer5b);
        RadioButton answer5a = (RadioButton) findViewById(R.id.answer5a);
        RadioButton answer5c = (RadioButton) findViewById(R.id.answer5c);
        RadioButton answer5d = (RadioButton) findViewById(R.id.answer5d);

        if (answer5b.isChecked()) {
            incrementScore();
            answer5 = "B";
        }
        if (answer5a.isChecked()) {
            answer5 = "A";
        }
        if (answer5c.isChecked()) {
            answer5 = "C";
        }
        if (answer5d.isChecked()) {
            answer5 = "D";
        }
        if (answer5 == null) {
            answer5 = "You haven't selected anything!";
        }

    }

    private void question6() {
        RadioButton answer6c = (RadioButton) findViewById(R.id.answer6c);
        RadioButton answer6a = (RadioButton) findViewById(R.id.answer6a);
        RadioButton answer6b = (RadioButton) findViewById(R.id.answer6b);
        RadioButton answer6d = (RadioButton) findViewById(R.id.answer6d);

        if (answer6c.isChecked()) {
            incrementScore();
            answer6 = "C";
        }
        if (answer6a.isChecked()) {
            answer6 = "A";
        }
        if (answer6b.isChecked()) {
            answer6 = "B";
        }
        if (answer6d.isChecked()) {
            answer6 = "D";
        }
        if (answer6 == null) {
            answer6 = "You haven't selected anything!";
        }
    }

    private void question7() {
        RadioButton answer7c = (RadioButton) findViewById(R.id.answer7c);
        RadioButton answer7a = (RadioButton) findViewById(R.id.answer7a);
        RadioButton answer7b = (RadioButton) findViewById(R.id.answer7b);
        RadioButton answer7d = (RadioButton) findViewById(R.id.answer7d);

        if (answer7c.isChecked()) {
            incrementScore();
            answer7 = "C";
        }
        if (answer7a.isChecked()) {
            answer7 = "A";
        }
        if (answer7b.isChecked()) {
            answer7 = "B";
        }
        if (answer7d.isChecked()) {
            answer7 = "D";
        }
        if (answer7 == null) {
            answer7 = "You haven't selected anything!";
        }

    }

    private void question8() {
        RadioButton answer8c = (RadioButton) findViewById(R.id.answer8c);
        RadioButton answer8a = (RadioButton) findViewById(R.id.answer8a);
        RadioButton answer8b = (RadioButton) findViewById(R.id.answer8b);
        RadioButton answer8d = (RadioButton) findViewById(R.id.answer8d);

        if (answer8c.isChecked()) {
            incrementScore();
            answer8 = "C";
        }
        if (answer8a.isChecked()) {
            answer8 = "A";
        }
        if (answer8b.isChecked()) {
            answer8 = "B";
        }
        if (answer8d.isChecked()) {
            answer8 = "D";
        }
        if (answer8 == null) {
            answer8 = "You haven't selected anything!";
        }

    }

    private void question9() {
        RadioButton answer9b = (RadioButton) findViewById(R.id.answer9b);
        RadioButton answer9a = (RadioButton) findViewById(R.id.answer9a);
        RadioButton answer9c = (RadioButton) findViewById(R.id.answer9c);
        RadioButton answer9d = (RadioButton) findViewById(R.id.answer9d);

        if (answer9b.isChecked()) {
            incrementScore();
            answer9 = "B";
        }
        if (answer9a.isChecked()) {
            answer9 = "A";
        }
        if (answer9c.isChecked()) {
            answer9 = "C";
        }
        if (answer9d.isChecked()) {
            answer9 = "D";
        }
        if (answer9 == null) {
            answer9 = "You haven't selected anything!";
        }

    }

    private void question10() {
        CheckBox answer10a = (CheckBox) findViewById(R.id.answer10a);
        CheckBox answer10b = (CheckBox) findViewById(R.id.answer10b);
        CheckBox answer10d = (CheckBox) findViewById(R.id.answer10d);
        CheckBox answer10c = (CheckBox) findViewById(R.id.answer10c);
        if (answer10a.isChecked() && answer10c.isChecked() && answer10b.isChecked() && answer10d.isChecked()) {
            incrementScore();
            answer10 = "A,B,C & D";
            return;
        }

        if (answer10a.isChecked()) {

            answer10 = "A";
        }
        if (answer10b.isChecked()) {
            if (answer10 == null) {
                answer10 = "B";
            } else {
                answer10 = answer10 + ", B";
            }
        }
        if (answer10c.isChecked()) {
            if (answer10 == null) {
                answer10 = "C";
            } else {
                answer10 = answer10 + ", C";
            }
        }
        if (answer10d.isChecked()) {
            if (answer10 == null) {
                answer10 = "D";
            } else {
                answer10 = answer10 + ", D";
            }
        }
        if (answer10 == null) {
            answer10 = "You haven't selected anything!";
        }

    }

}
