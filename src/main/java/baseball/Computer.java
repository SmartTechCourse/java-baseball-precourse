package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.LinkedList;
import java.util.List;

public class Computer {

    private final int startInclusive = 1;
    private final int endInclusive = 9;

    private List<Integer> targetNumberDigits;

    public List<Integer> getRandomTargetNumberDigits() {
        if (targetNumberDigits == null) {
            createRandomTargetNumberDigits();
        }
        return targetNumberDigits;
    }

    private void createRandomTargetNumberDigits() {
        targetNumberDigits = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            int randomInteger = Randoms.pickNumberInRange(startInclusive, endInclusive);
            targetNumberDigits.add(randomInteger);
        }
    }
}
