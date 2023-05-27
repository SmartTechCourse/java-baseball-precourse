package baseball;

public class Game {
    private Referee referee;

    private Player player;

    private Opponent computer;

    private boolean isRunning;

    public void start() {
        initializeProperty();

        while (isRunning) {
            View.print(Message.INPUT_NUMBER_GUIDE);
            JudgementResult judgementResult = referee.judge(player.getNumber(), computer.getNumber());
            View.print(judgementResult);
            checkKeepRunning(judgementResult);
        }
    }

    private void initializeProperty() {
        referee = new Referee();
        player = new Player();
        computer = new Opponent();
        isRunning = true;
    }

    private void checkKeepRunning(JudgementResult judgementResult) {
        if (judgementResult.isMaxStrike()) {
            isRunning = false;
        }
    }
}
