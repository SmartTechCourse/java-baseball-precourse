package baseball;

public class NonPlayer {
    Integer[] answer;

    public void createAnswer() {
        answer = new Integer[3];
        for (int i = 0; i < 3; i++) {
            answer[i] = (int) (Math.random() * 10);
            if (answer[i] == 0) i--;
        }
    }

    public Result verify(Integer[] input) {
        int strikes = 0;
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (strike(input, i)) strikes++;
            else if (ball(input, i)) ball++;
        }

        return new Result(ball, strikes);
    }

    private boolean ball(Integer[] input, int i) {
        for (int n = i + 1; n < 3; n++) {
            if (input[i].equals(answer[n])) return true;
        }
        return false;
    }

    private boolean strike(Integer[] input, int index) {
        return input[index].equals(answer[index]);
    }

}
