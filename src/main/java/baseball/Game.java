package baseball;

public class Game {
    private Referee referee;

    private boolean isRunning;

    public Game(Referee referee) {
        this.referee = referee;
    }

    public void start() {
        Player player = new Player();
        Opponent computer = new Opponent();

        isRunning = true;

        while (isRunning) {
            View.print(Message.INPUT_NUMBER_GUIDE);
            JudgementResult judgementResult = referee.judge(player, computer);
            View.print(judgementResult);
            checkKeepRunning(judgementResult);
        }
    }

    private void checkKeepRunning(JudgementResult judgementResult) {
        if (judgementResult.isMaxStrike()) {
            isRunning = false;
        }
    }
}
