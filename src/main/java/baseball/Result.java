package baseball;

class Result {
    private final int ball;
    private final int strike;

    Result(int ball, int strike) {
        if (ball + strike > 3) throw new IllegalArgumentException();
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean correct() {
        return strike == 3;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (ball != 0) {
            builder.append(ball).append("볼");
            if (strike != 0) builder.append(" ");
        }
        if (strike != 0) builder.append(strike).append("스트라이크");
        return builder.toString();
    }
}
