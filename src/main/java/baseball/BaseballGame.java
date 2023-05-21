package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class BaseballGame {

    private boolean isRunning = false;


    private void start() {
        isRunning = true;
    }

    private void end() {
        isRunning = false;
    }

    public void doGame() {
        Computer computer = new Computer();
        Player player = new Player();
        Referee referee = new Referee();

        List<Integer> targetNumberDigits = computer.getRandomTargetNumberDigits();

        start();

        while (isRunning) {
            List<Integer> inputNumberDigits = player.readValidNumber();
            referee.match(targetNumberDigits, inputNumberDigits);
            boolean isAllMatched = referee.getMatchResult();

            // TODO: 인덴트 2이하로 줄이기.
            if (isAllMatched) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                String restartString = Console.readLine();

                if (restartString.equals("1")) {
                    targetNumberDigits = computer.getRandomTargetNumberDigits();
                    // TODO: 더 나은 방법 생각해보기.
                    referee.initializeMatchResult();
                } else if (restartString.equals("2")) {
                    end();
                }
                else {
                    throw new IllegalArgumentException("잘못된 숫자를 입력하셨습니다.");
                }

            }
        }

    }
}
