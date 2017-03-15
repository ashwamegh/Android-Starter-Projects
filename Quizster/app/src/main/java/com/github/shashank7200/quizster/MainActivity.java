package com.github.shashank7200.quizster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int score = 23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitScore(View view){
        Intent intent = new Intent(getApplicationContext(),SubmitActivity.class);
        startActivity(intent);
    }
}
