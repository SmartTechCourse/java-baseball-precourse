package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {

    private final int startInclusive;
    private final int endInclusive;

    public Computer(final int startInclusive, final int endInclusive) {
        this.startInclusive = startInclusive;
        this.endInclusive = endInclusive;
    }

    public int getRandomTargetNumber() {
        return Randoms.pickNumberInRange(startInclusive, endInclusive);
    }
}
