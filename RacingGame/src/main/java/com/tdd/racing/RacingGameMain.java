package com.tdd.racing;

import com.tdd.racing.service.impl.RacingGame;
import com.tdd.racing.view.input.RacingGameInput;
import com.tdd.racing.view.output.RacingGameOutput;

public class RacingGameMain {
    public static void main(String args[]) {
        startRacingGame();
    }

    public static void startRacingGame() {
        RacingGame game = new RacingGame(RacingGameInput.inputCarCount(), RacingGameInput.inputGameRound());
        game.start();
        RacingGameOutput.printRacingGameResult(game);
    }
}
