package baseball;

import static baseball.Message.*;

public class View {

    public static void print(Message message) {
        System.out.print(message.getBody());
    }

    public static void print(JudgementResult result) {
        if (result.isMaxStrike()) {
            printGameOverMessage();
            return;
        }

        String JudgementResultMessage = makeJudgementResultMessage(result);
        if (JudgementResultMessage.isEmpty()) {
            System.out.println("낫싱");
        } else {
            System.out.println(JudgementResultMessage);
        }
    }

    private static void printGameOverMessage() {
        System.out.println(CLOSE_GUIDE.getBody());
        System.out.println(RESTART_OR_CLOSE_GUIDE.getBody());
    }

    private static String makeJudgementResultMessage(JudgementResult judgementResult) {
        StringBuilder stringBuilder = new StringBuilder();

        if (judgementResult.getNumberOfBall() > 0) {
            stringBuilder.append(judgementResult.getNumberOfBall() + "볼 ");
        }
        if (judgementResult.getNumberOfStrike() > 0) {
            stringBuilder.append(judgementResult.getNumberOfStrike() + "스트라이크 ");
        }
        return stringBuilder.toString();
    }
}
