package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.LinkedList;
import java.util.List;

public class Computer {

    private List<Integer> targetNumberDigits;

    public List<Integer> getRandomTargetNumberDigits() {
        if (targetNumberDigits == null) {
            createRandomTargetNumberDigits();
        }
        return targetNumberDigits;
    }

    private void createRandomTargetNumberDigits() {
        final int startInclusive = 1;
        final int endInclusive = 9;

        targetNumberDigits = new LinkedList<>();
        while (targetNumberDigits.size() < 3) {
            int randomInteger = Randoms.pickNumberInRange(startInclusive, endInclusive);
            if (!targetNumberDigits.contains(randomInteger)) {
                targetNumberDigits.add(randomInteger);
            }
        }

    }
}
