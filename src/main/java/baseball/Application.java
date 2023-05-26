package baseball;

import camp.nextstep.edu.missionutils.Console;

import static baseball.Message.SIGNAL_INVALID_ERROR;

public class Application {
    public static void main(String[] args) {
        final String START_SIGNAL = "1";
        final String CLOSE_SIGNAL = "2";

        Referee referee = new Referee();
        Game game = new Game(referee);

        String signal = START_SIGNAL;

        while (signal.equals(START_SIGNAL)) {
            game.start();
            signal = Console.readLine();
        }

        if (!signal.equals(CLOSE_SIGNAL)) {
            throw new IllegalArgumentException(SIGNAL_INVALID_ERROR.getBody());
        }
    }
}
