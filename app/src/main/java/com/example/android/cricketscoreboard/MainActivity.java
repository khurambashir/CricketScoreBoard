package com.example.android.cricketscoreboard;

import android.sax.EndTextElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int overs = 0;
    int balls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPakistan( 500);
        displayOversPakistan(10);
        displayBallsPakistan(5);
    }


    //Add One Socre when +1 button is clicked

    public void addOne (View view){
        score += 1;
        if (balls >= 5)
            balls=0;
        else balls +=1;
        if (balls==0)
            overs +=1;
        displayForPakistan(score);
        displayOversPakistan(overs);
        displayBallsPakistan(balls);
    }



    //Add Two Socres when +2 button is clicked

    public void addDouble(View View){
            score += 2;
            balls += 1;
            displayForPakistan(score);
            displayOversPakistan(overs);
            displayBallsPakistan(balls);
    }




    //Display declared Method for scores of Pakistan

    public void displayForPakistan (int score){
        TextView scoreView = (TextView) findViewById(R.id.score_pakistan);
        scoreView.setText(String.valueOf(score));

    }

    //Delaring method for Overs display for Pakistan
    public void displayOversPakistan (int overs){
        TextView oversView = (TextView) findViewById(R.id.overs_pakistan);
        oversView.setText(String.valueOf(overs));
    }
    //Delaring method for Balls display for Pakistan
    public void displayBallsPakistan (int balls){
        TextView ballsView = (TextView) findViewById(R.id.balls_pakistan);
        ballsView.setText(String.valueOf(balls));
    }
}

