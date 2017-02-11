package com.github.shashank7200.higherorlower;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;


    public void checkGuess(View view){

        EditText guessedInput = (EditText) findViewById(R.id.guessedInput);
       String guessedNumberString = guessedInput.getText().toString();
        int guessedNumberInt = Integer.parseInt(guessedNumberString);

        if (guessedNumberInt > randomNumber){
            Toast.makeText(getApplicationContext(), "Your number is higher",Toast.LENGTH_LONG).show();
        }
        else if (guessedNumberInt < randomNumber){
            Toast.makeText(getApplicationContext(),"You number is low", Toast.LENGTH_LONG).show();
        }
        else if(guessedNumberInt == randomNumber){
            Toast.makeText(getApplicationContext(), "You Got it Right, Cheers!", Toast.LENGTH_LONG).show();
        }

        else
            Toast.makeText(getApplicationContext(),"Not a Number", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();

        randomNumber = random.nextInt(21);
    }


}
