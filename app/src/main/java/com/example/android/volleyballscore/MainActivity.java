

/**
 * cele:
 * 1. wyświetla poprawny numer seta
 * 2. można podać nazwy drużyn, maks. 2 wiersze
 * 3. pokazuje punktację, najlepiej button ze zmieniającą się wartością
 * 4. button "undo"
 * 5. podaje zwycięzcę meczu
 * 6. podaje wynik poprzednich setów
 * 7. wie kiedy zakończyć seta
 */

package com.example.android.volleyballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int timeoutTeamA = 0;
    int timeoutTeamB = 0;
    int setNumber = 1;
    int setTeamA = 0;
    int setTeamB = 0;
    int teamApointsInSetOne = 0;
    int teamBpointsInSetOne = 0;
    int teamApointsInSetTwo = 0;
    int teamBpointsInSetTwo = 0;
    int teamApointsInSetThree = 0;
    int teamBpointsInSetThree = 0;
    int teamApointsInSetFour = 0;
    int teamBpointsInSetFour = 0;
    int teamApointsInSetFive = 0;
    int teamBpointsInSetFive = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overallSetNumber(setNumber);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA >= 25 && scoreTeamA - scoreTeamB >= 2 && setNumber == 1) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamA(v);
            teamApointsInSetOne = scoreTeamA;
            teamBpointsInSetOne = scoreTeamB;
            scoreTeamAinSetOne(teamApointsInSetOne);
            scoreTeamBinSetOne(teamBpointsInSetOne);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        if (scoreTeamA >= 25 && scoreTeamA - scoreTeamB >= 2 && setNumber == 2) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamA(v);
            teamApointsInSetTwo = scoreTeamA;
            teamBpointsInSetTwo = scoreTeamB;
            scoreTeamAinSetTwo(teamApointsInSetTwo);
            scoreTeamBinSetTwo(teamBpointsInSetTwo);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        if (scoreTeamA >= 25 && scoreTeamA - scoreTeamB >= 2 && setNumber == 3) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamA(v);
            teamApointsInSetThree = scoreTeamA;
            teamBpointsInSetThree = scoreTeamB;
            scoreTeamAinSetThree(teamApointsInSetThree);
            scoreTeamBinSetThree(teamBpointsInSetThree);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        if (scoreTeamA >= 25 && scoreTeamA - scoreTeamB >= 2 && setNumber == 4) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamA(v);
            teamApointsInSetFour = scoreTeamA;
            teamBpointsInSetFour = scoreTeamB;
            scoreTeamAinSetFour(teamApointsInSetFour);
            scoreTeamBinSetFour(teamBpointsInSetFour);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        if (scoreTeamA >= 15 && scoreTeamA - scoreTeamB >= 2 && setNumber == 5) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamA(v);
            teamApointsInSetFive = scoreTeamA;
            teamBpointsInSetFive = scoreTeamB;
            scoreTeamAinSetFive(teamApointsInSetFive);
            scoreTeamBinSetFive(teamBpointsInSetFive);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Decrease the score for Team A by 1 point.
     */
    public void removeOneFromTeamA(View v) {
        if (scoreTeamA == 0) {
            Toast.makeText(this, "You cannot have less than 0 points", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB >= 25 && scoreTeamB - scoreTeamA >= 2 && setNumber == 1) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamB(v);
            teamApointsInSetOne = scoreTeamA;
            teamBpointsInSetOne = scoreTeamB;
            scoreTeamAinSetOne(teamApointsInSetOne);
            scoreTeamBinSetOne(teamBpointsInSetOne);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        if (scoreTeamB >= 25 && scoreTeamB - scoreTeamA >= 2 && setNumber == 2) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamB(v);
            teamApointsInSetTwo = scoreTeamA;
            teamBpointsInSetTwo = scoreTeamB;
            scoreTeamAinSetTwo(teamApointsInSetTwo);
            scoreTeamBinSetTwo(teamBpointsInSetTwo);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        if (scoreTeamB >= 25 && scoreTeamB - scoreTeamA >= 2 && setNumber == 3) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamB(v);
            teamApointsInSetThree = scoreTeamA;
            teamBpointsInSetThree = scoreTeamB;
            scoreTeamAinSetThree(teamApointsInSetThree);
            scoreTeamBinSetThree(teamBpointsInSetThree);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        if (scoreTeamB >= 25 && scoreTeamB - scoreTeamA >= 2 && setNumber == 4) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamB(v);
            teamApointsInSetFour = scoreTeamA;
            teamBpointsInSetFour = scoreTeamB;
            scoreTeamAinSetFour(teamApointsInSetFour);
            scoreTeamBinSetFour(teamBpointsInSetFour);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        if (scoreTeamB >= 15 && scoreTeamB - scoreTeamA >= 2 && setNumber == 5) {
            setNumber = setNumber + 1;
            overallSetNumber(setNumber);
            increaseSetTeamB(v);
            teamApointsInSetFive = scoreTeamA;
            teamBpointsInSetFive = scoreTeamB;
            scoreTeamAinSetFive(teamApointsInSetFive);
            scoreTeamBinSetFive(teamBpointsInSetFive);
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Decrease the score for Team B by 1 point.
     */
    public void removeOneFromTeamB(View v) {
        if (scoreTeamB == 0) {
            Toast.makeText(this, "You cannot have less than 0 points", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the timeout for Team A by 1. Toast when over 3
     */
    public void timeoutForTeamA(View v) {
        if (timeoutTeamA == 3) {
            Toast.makeText(this, "Maximum 3 timeouts per team per set", Toast.LENGTH_SHORT).show();
            return;
        }
        timeoutTeamA = timeoutTeamA + 1;
        taketimeoutTeamA(timeoutTeamA);
    }

    /**
     * Increase the timeout for Team B by 1. Toast when over 3
     */
    public void timeoutForTeamB(View v) {
        if (timeoutTeamB == 3) {
            Toast.makeText(this, "Maximum 3 timeouts per team per set", Toast.LENGTH_SHORT).show();
            return;
        }
        timeoutTeamB = timeoutTeamB + 1;
        taketimeoutTeamB(timeoutTeamB);
    }

    /**
     * Displays the given score for Team A in current set.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B in current set.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays timeouts for Team A.
     */
    public void taketimeoutTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.timeoutA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays timeouts for Team B.
     */
    public void taketimeoutTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.timeoutB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays overall number of the set.
     */
    public void overallSetNumber(int setNr) {
        TextView scoreView = (TextView) findViewById(R.id.setNumber);
        scoreView.setText(String.valueOf(setNr));
    }

    /**
     * Increase number of sets won by Team A, displays number and checks if we have a winner.
     */
    public void increaseSetTeamA(View v) {
        setTeamA = setTeamA + 1;
        displaySetForTeamA(setTeamA);
        checkForWinner(v);
    }

    /**
     * Increase number of sets won by Team B, displays number and checks if we have a winner.
     */
    public void increaseSetTeamB(View v) {
        setTeamB = setTeamB + 1;
        displaySetForTeamB(setTeamB);
        checkForWinner(v);
    }

    /**
     * Display number of sets won by Team A
     */
    public void displaySetForTeamA(int set) {
        TextView setView = (TextView) findViewById(R.id.numberOfSetsTeamA);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of sets won by Team B
     */
    public void displaySetForTeamB(int set) {
        TextView setView = (TextView) findViewById(R.id.numberOfSetsTeamB);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team A in set one
     */
    public void scoreTeamAinSetOne(int set) {
        TextView setView = (TextView) findViewById(R.id.teamAsetOneScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team B in set one
     */
    public void scoreTeamBinSetOne(int set) {
        TextView setView = (TextView) findViewById(R.id.teamBsetOneScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team A in set two
     */
    public void scoreTeamAinSetTwo(int set) {
        TextView setView = (TextView) findViewById(R.id.teamAsetTwoScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team B in set two
     */
    public void scoreTeamBinSetTwo(int set) {
        TextView setView = (TextView) findViewById(R.id.teamBsetTwoScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team A in set three
     */
    public void scoreTeamAinSetThree(int set) {
        TextView setView = (TextView) findViewById(R.id.teamAsetThreeScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team B in set three
     */
    public void scoreTeamBinSetThree(int set) {
        TextView setView = (TextView) findViewById(R.id.teamBsetThreeScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team A in set four
     */
    public void scoreTeamAinSetFour(int set) {
        TextView setView = (TextView) findViewById(R.id.teamAsetFourScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team B in set four
     */
    public void scoreTeamBinSetFour(int set) {
        TextView setView = (TextView) findViewById(R.id.teamBsetFourScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team A in set five
     */
    public void scoreTeamAinSetFive(int set) {
        TextView setView = (TextView) findViewById(R.id.teamAsetFiveScore);
        setView.setText(String.valueOf(set));
    }

    /**
     * Display number of points won by Team B in set five
     */
    public void scoreTeamBinSetFive(int set) {
        TextView setView = (TextView) findViewById(R.id.teamBsetFiveScore);
        setView.setText(String.valueOf(set));
    }

    public void checkForWinner(View v) {
        if (setTeamA == 3) {
            Toast toast = new Toast(this);
            ImageView view = new ImageView(this);
            view.setImageResource(R.drawable.winner_team_a);
            toast.setView(view);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
            resetScores(v);
            return;
        }
        if (setTeamB == 3) {
            Toast toast = new Toast(this);
            ImageView view = new ImageView(this);
            view.setImageResource(R.drawable.winner_team_b);
            toast.setView(view);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
            resetScores(v);
            return;
        }
    }

    /**
     * Reset team scores.
     */
    public void resetScores(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        timeoutTeamA = 0;
        timeoutTeamB = 0;
        setNumber = 1;
        setTeamA = 0;
        setTeamB = 0;
        teamApointsInSetOne = 0;
        teamBpointsInSetOne = 0;
        teamApointsInSetTwo = 0;
        teamBpointsInSetTwo = 0;
        teamApointsInSetThree = 0;
        teamBpointsInSetThree = 0;
        teamApointsInSetFour = 0;
        teamBpointsInSetFour = 0;
        teamApointsInSetFive = 0;
        teamBpointsInSetFive = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        taketimeoutTeamA(timeoutTeamA);
        taketimeoutTeamB(timeoutTeamB);
        overallSetNumber(setNumber);
        displaySetForTeamA(setTeamA);
        displaySetForTeamB(setTeamB);
        scoreTeamAinSetOne(teamApointsInSetOne);
        scoreTeamBinSetOne(teamBpointsInSetOne);
        scoreTeamAinSetTwo(teamApointsInSetTwo);
        scoreTeamBinSetTwo(teamBpointsInSetTwo);
        scoreTeamAinSetThree(teamApointsInSetThree);
        scoreTeamBinSetThree(teamBpointsInSetThree);
        scoreTeamAinSetFour(teamApointsInSetFour);
        scoreTeamBinSetFour(teamBpointsInSetFour);
        scoreTeamAinSetFive(teamApointsInSetFive);
        scoreTeamBinSetFive(teamBpointsInSetFive);

    }
}