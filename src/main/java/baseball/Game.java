package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Game {

    private Referee referee;

    private View view;

    private boolean isRunning;

    private final String RESTART_SIGNAL = "1";

    private final String CLOSE_SIGNAL = "2";

    public Game(Referee referee, View view) {
        this.referee = referee;
        this.view = view;
    }

    public void run() {
        isRunning = true;

        while (isRunning) {
            view.printNumberInputMessage();
            JudgementResult judgementResult = referee.judge();
            view.print(judgementResult);
            checkKeepRunning(judgementResult);
        }
    }

    private void checkKeepRunning(JudgementResult judgementResult) {
        if (judgementResult.isMaxStrike()) {
            checkRestartOrClose();
        }
    }

    private void checkRestartOrClose() {
        String inputString = Console.readLine();

        if (inputString.equals(RESTART_SIGNAL)) {
            restart();
        } else if (inputString.equals(CLOSE_SIGNAL)) {
            close();
        } else {
            throw new IllegalArgumentException(Message.RESTART_OR_CLOSE_SIGNAL_INVALID_ERROR.getBody());
        }
    }

    private void restart() {
        referee.requestToChangeOpponentNumber();
    }

    private void close() {
        isRunning = false;
    }
}
