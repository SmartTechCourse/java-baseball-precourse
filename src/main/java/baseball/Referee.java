package baseball;

import java.util.List;
import java.util.stream.IntStream;

public class Referee {

    public JudgementResult judge(Player player, Opponent computer) {
        List<Integer> playerNumber = player.getNumber();
        List<Integer> opponentNumber = computer.getNumber();

        return compare(playerNumber, opponentNumber);
    }

    private JudgementResult compare(List<Integer> playerNumber, List<Integer> opponentNumber) {
        int numberOfStrike = countStrike(playerNumber, opponentNumber);
        int numberOfBall = countBall(playerNumber, opponentNumber);

        return new JudgementResult(numberOfStrike, numberOfBall);
    }

    private int countStrike(List<Integer> playerNumber, List<Integer> opponentNumber) {
        return (int) IntStream
            .rangeClosed(0, 2)
            .filter(i -> playerNumber.get(i) == opponentNumber.get(i))
            .count();
    }

    private int countBall(List<Integer> playerNumber, List<Integer> opponentNumber) {
        return (int) IntStream
            .rangeClosed(0, 2)
            .filter(playerNumberIndex -> {
                int opponentNumberIndex = opponentNumber.indexOf(playerNumber.get(playerNumberIndex));
                return opponentNumberIndex != playerNumberIndex && opponentNumberIndex != -1;})
            .count();
    }

    public void requestToChangeNumber(Opponent computer) {
        computer.resetNumber();
    }
}
