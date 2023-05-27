package baseball;

import camp.nextstep.edu.missionutils.Console;

import static baseball.Message.SIGNAL_INVALID_ERROR;

public class Application {
    public static void main(String[] args) {
        final String RESTART_SIGNAL = "1";
        final String CLOSE_SIGNAL = "2";

        Game game = new Game();
        game.proceed();

        String signal = Console.readLine();
        while (signal.equals(RESTART_SIGNAL)) {
           game.proceed();
           signal = Console.readLine();
        }

        if (!signal.equals(CLOSE_SIGNAL)) {
            throw new IllegalArgumentException(SIGNAL_INVALID_ERROR.getBody());
        }
    }
}
