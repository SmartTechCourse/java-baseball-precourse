package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Game {

    private Referee referee;

    private View view;

    private boolean isRunning;

    public Game(Referee referee, View view) {
        this.referee = referee;
        this.view = view;
    }

    public void run() {
        isRunning = true;

        while (isRunning) {
            JudgementResult judgementResult = referee.judge();
            view.print(judgementResult);
            checkKeepRunning(judgementResult);
        }
    }

    private void checkKeepRunning(JudgementResult judgementResult) {

    }

}
