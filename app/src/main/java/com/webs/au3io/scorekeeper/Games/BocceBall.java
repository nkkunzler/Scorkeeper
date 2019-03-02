package com.webs.au3io.scorekeeper.Games;

import android.os.Bundle;
import com.webs.au3io.scorekeeper.ScorableGame;
import com.webs.au3io.scorekeeper.Team;

/**
 * Created by Nicholas Kunzler on 12/17/2016.
 */

public class BocceBall extends ScorableGame {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState, "Bocce Ball");
    }

    public void checkScore(Team teamOne, Team teamTwo, boolean includeSkunkRules) {
        if (includeSkunkRules) {
            super.skunkScoring(teamOne, teamTwo);
        }

        if (teamOne.getScore() < 0) {
            teamOne.setScore(0);
        } else if (teamTwo.getScore() < 0) {
            teamTwo.setScore(0);
        } else if (teamOne.getScore() >= 12) {
            super.displayWinner(teamOne);
        } else if (teamTwo.getScore() >= 12) {
            super.displayWinner(teamTwo);
        }
    }
}
