package baseball;

public class JudgementResult {

    private final int numberOfStrike;

    private final int numberOfBall;

    private final boolean isGameOver;

    public JudgementResult(int numberOfStrike, int numberOfBall, boolean isGameOver) {
        this.numberOfStrike = numberOfStrike;
        this.numberOfBall = numberOfBall;
        this.isGameOver = isGameOver;
    }

    public int getNumberOfStrike() {
        return numberOfStrike;
    }

    public int getNumberOfBall() {
        return numberOfBall;
    }

    public boolean isGameOver() {
        return isGameOver;
    }
}
