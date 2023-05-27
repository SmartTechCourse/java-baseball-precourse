package baseball;

public class JudgementResult {
    private final int numberOfStrike;

    private final int numberOfBall;

    private final int MAX_STRIKE = 3;


    public JudgementResult(int numberOfStrike, int numberOfBall) {
        this.numberOfStrike = numberOfStrike;
        this.numberOfBall = numberOfBall;
    }

    public int getNumberOfStrike() {
        return numberOfStrike;
    }

    public int getNumberOfBall() {
        return numberOfBall;
    }

    public boolean isMaxStrike() {
        return numberOfStrike == MAX_STRIKE;
    }
}
