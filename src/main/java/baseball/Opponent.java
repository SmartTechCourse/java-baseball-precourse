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

    }

    public void resetNumber() {

    }
}
