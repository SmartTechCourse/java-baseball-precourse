package baseball;

public class Game {
    private Referee referee;

    private Player player;

    private Opponent computer;

    private boolean isRunning;


    public void proceed() {
        initializeProperty();

        while (isRunning) {
            run();
        }

        close();
    }

    private void initializeProperty() {
        referee = new Referee();
        player = new Player();
        computer = new Opponent();
        isRunning = true;
    }

    private void run() {
        View.print(Message.INPUT_NUMBER_GUIDE);
        JudgementResult judgementResult = referee.judge(player.getNumber(), computer.getNumber());
        View.print(judgementResult);
        determineKeepRunning(judgementResult);
    }

    private void determineKeepRunning(JudgementResult judgementResult) {
        if (judgementResult.isMaxStrike()) {
            isRunning = false;
        }
    }

    private void close() {
        View.println(Message.RESTART_OR_CLOSE_GUIDE);
    }
}
