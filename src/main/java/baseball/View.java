package baseball;

public class View {

    public void printNumberInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
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
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
