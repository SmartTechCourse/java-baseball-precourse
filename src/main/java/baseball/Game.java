package baseball;

import camp.nextstep.edu.missionutils.Console;

import static baseball.Message.*;

public class Game {

    private Referee referee;

    private boolean isRunning;

    private final String RESTART_SIGNAL = "1";

    private final String CLOSE_SIGNAL = "2";

    public Game(Referee referee) {
        this.referee = referee;
    }

    public void run() {
        isRunning = true;

        Player player = new Player();
        Opponent computer = new Opponent();

        while (isRunning) {
            View.printNumberInputMessage();
            JudgementResult judgementResult = referee.judge(player, computer);
            View.print(judgementResult);
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
            throw new IllegalArgumentException(RESTART_OR_CLOSE_SIGNAL_INVALID_ERROR.getBody());
        }
    }

    private void restart() {
        referee.requestToChangeNumber(computer);
    }

    private void close() {
        isRunning = false;
    }
}
