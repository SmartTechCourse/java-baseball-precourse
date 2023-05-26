package baseball;

import static baseball.Message.*;

public class View {

    public void printNumberInputMessage() {
        System.out.print(INPUT_NUMBER_GUIDE.getBody());
    }

    public void print(JudgementResult result) {
        if (result.isMaxStrike()) {
            printGameOverMessage();
            return;
        }

        int numberOfBall = result.getNumberOfBall();
        int numberOfStrike = result.getNumberOfStrike();
        StringBuilder stringBuilder = new StringBuilder();

        if (numberOfBall > 0) {
            stringBuilder.append(numberOfBall+"볼 ");
        }
        if (result.getNumberOfStrike() > 0) {
            stringBuilder.append(numberOfStrike+"스트라이크 ");
        }
        String JudgementResultMessage = stringBuilder.toString();

        if (JudgementResultMessage.isEmpty()) {
            System.out.println("낫싱");
        } else {
            System.out.println(JudgementResultMessage);
        }
    }

    private void printGameOverMessage() {
        System.out.println(CLOSE_GUIDE.getBody());
        System.out.println(RESTART_OR_CLOSE_GUIDE.getBody());
    }
}
