package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Opponent {

    private List<Integer> number;

    public List<Integer> getNumber() {
        if (number == null) {
            generateNumber();
        }
        return number;
    }

    private void generateNumber() {
        for (int i = 0; i < 3; i++) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            number.add(randomNumber);
        }
    }

    public void resetNumber() {

    }
}
