package com.github.shashank7200.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    /**
     * Global variables to hold the score.
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method to add Six runs  for Team A
     * @param view
     */
    public void addSixToTeamA(View view) {
        scoreTeamA += 6;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * Method to add Four runs  for Team A
     * @param view
     */

    public void addFourToTeamA(View view) {
        scoreTeamA += 4;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * Method to add Three runs  for Team A
     * @param view
     */
    public void addThreeToTeamA(View view) {
        scoreTeamA += 3;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * Method to add Two runs  for Team A
     * @param view
     */

    public void addTwoToTeamA(View view) {
        scoreTeamA += 2;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * Method to add One run  for Team A
     * @param view
     */
    public void addOneToTeamA(View view) {
        scoreTeamA += 1;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * Method to update total runs  for Team A
     */
    public void displayTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method to add Six runs  for Team B
     * @param view
     */
    public void addSixToTeamB(View view) {
        scoreTeamB += 6;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * Method to add Four runs  for Team B
     * @param view
     */
    public void addFourToTeamB(View view) {
        scoreTeamB += 4;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * Method to add Three runs  for Team B
     * @param view
     */
    public void addThreeToTeamB(View view) {
        scoreTeamB += 3;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * Method to add Two runs  for Team B
     * @param view
     */
    public void addTwoToTeamB(View view) {
        scoreTeamB += 2;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * Method to add One run  for Team B
     * @param view
     */
    public void addOneToTeamB(View view) {
        scoreTeamB += 1;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * Method to update total runs  for Team B
     */
    public void displayTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method to show Match assessment result.
     * @param view
     */
    public void matchResult(View view) {

        Spinner selectedTeamA = (Spinner) findViewById(R.id.spinner_team_a);
        Spinner selectedTeamB = (Spinner) findViewById(R.id.spinner_team_b);

        String selectedTeamAString = String.valueOf(selectedTeamA.getSelectedItem());
        String selectedTeamBString = String.valueOf(selectedTeamB.getSelectedItem());

        if (scoreTeamA == scoreTeamB) {
            Toast.makeText(getApplicationContext(), "Match hasn't been Started Yet!", Toast.LENGTH_LONG).show();
        } else if (scoreTeamA > scoreTeamB) {
            int difference = scoreTeamA - scoreTeamB;
            Toast.makeText(getApplicationContext(), selectedTeamAString + " won the match by " + difference + " runs.", Toast.LENGTH_LONG).show();
        } else if (scoreTeamB > scoreTeamA) {
            int difference = scoreTeamB - scoreTeamA;
            Toast.makeText(getApplicationContext(), selectedTeamBString + " won the match by " + difference + " runs.", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Method to reset overall match score.
     * @param view
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
    }

}
