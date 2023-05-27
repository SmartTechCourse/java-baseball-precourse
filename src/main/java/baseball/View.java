package baseball;

import static baseball.Message.*;

public class View {
    public static void print(Message message) {
        System.out.print(message.getBody());
    }

    public static void println(Message message) {
        System.out.println(message.getBody());
    }

    public static void print(JudgementResult result) {
        String JudgementResultMessage = makeJudgementResultMessage(result);
        System.out.println(JudgementResultMessage);
    }

    private static String makeJudgementResultMessage(JudgementResult judgementResult) {
        StringBuilder stringBuilder = new StringBuilder();

        if (judgementResult.getNumberOfBall() > 0) {
            stringBuilder.append(judgementResult.getNumberOfBall() + "볼 ");
        }
        if (judgementResult.getNumberOfStrike() > 0) {
            stringBuilder.append(judgementResult.getNumberOfStrike() + "스트라이크 ");
        }

        if (judgementResult.getNumberOfBall() == 0 && judgementResult.getNumberOfStrike() == 0) {
            stringBuilder.append("낫싱");
        }

        if (judgementResult.isMaxStrike()) {
            stringBuilder.append(MAX_STRIKE_AND_CLOSE_GUIDE.getBody());
        }

        return stringBuilder.toString();
    }
}
