package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Team A Score.
    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void add1Point(View view) {
        teamA += 1;
        displayScore(teamA);
    }

    public void add2Points(View view) {
        teamA += 2;
        displayScore(teamA);
    }

    public void add3Points(View view) {
        teamA += 3;
        displayScore(teamA);
    }

    private void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void add1PointB(View view) {
        teamB += 1;
        displayScoreB(teamB);
    }

    public void add2PointsB(View view) {
        teamB += 2;
        displayScoreB(teamB);
    }

    public void add3PointsB(View view) {
        teamB += 3;
        displayScoreB(teamB);
    }

    // Reset scores.
    public void reset(View view) {
        teamA = 0;
        teamB = 0;
        displayScore(teamA);
        displayScoreB(teamB);
    }
}