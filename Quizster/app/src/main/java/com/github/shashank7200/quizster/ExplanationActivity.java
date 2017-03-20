package com.github.shashank7200.quizster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by AshwaMegh on 20-03-2017.
 */

public class ExplanationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);
    }

    public void goBackToMain(View view){
        Intent i = new Intent(ExplanationActivity.this, MainActivity.class);
        startActivity(i);
    }
}
