package baseball;

import java.util.List;

public class Referee {

    private boolean isAllMatched = false;

    public void match(List<Integer> targetNumberDigits, List<Integer> inputNumberDigits) {
        int numberOfBall = countBall(targetNumberDigits, inputNumberDigits);
        int numberOfStrike = countStrike(targetNumberDigits, inputNumberDigits);

        printMatchingResult(numberOfBall, numberOfStrike);
        setMatchResult(numberOfStrike);
    }

    public boolean getMatchResult() {
        return isAllMatched;
    }

    public void initializeMatchResult() {
        isAllMatched = false;
    }

    private void setMatchResult(int numberOfStrike) {
        if (numberOfStrike == 3) {
            isAllMatched = true;
        }
    }

    private int countBall(List<Integer> targetNumberDigits, List<Integer> inputNumberDigits) {
        int numberOfBall = 0;

        // TODO: 인덴트 2이하로 줄이기.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    if (targetNumberDigits.get(i).equals(inputNumberDigits.get(j))) {
                        numberOfBall += 1;
                    }
                }
            }
        }

        return numberOfBall;
    }

    private int countStrike(List<Integer> targetNumberDigits, List<Integer> inputNumberDigits) {
        int numberOfStrike = 0;

        // TODO: 인덴트 2이하로 줄이기.
        for (int i = 0; i < 3; i++) {
            if (targetNumberDigits.get(i).equals(inputNumberDigits.get(i))) {
                numberOfStrike += 1;
            }
        }

        return numberOfStrike;
    }

    private void printMatchingResult(int numberOfBall, int numberOfStrike) {
        if (numberOfBall > 0) {
            System.out.print(numberOfBall +"볼 ");
        }
        if (numberOfStrike > 0) {
            System.out.print(numberOfStrike +"스트라이크");
        }
        if (numberOfBall == 0 && numberOfStrike == 0) {
            System.out.print("낫싱");
        }
        System.out.println();
    }

}
