package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Opponent {
    private List<Integer> number = new ArrayList<>();

    public List<Integer> getNumber() {
        if (number.isEmpty()) {
            generateNumber();
        }
        return number;
    }

    private void generateNumber() {
        HashSet<Integer> digitsWithoutZero = new HashSet<>();
        while (digitsWithoutZero.size() < 3) {
            digitsWithoutZero.add(getRandomDigitWithoutZero());
        }
        number.addAll(digitsWithoutZero);
    }

    private int getRandomDigitWithoutZero() {
        final int startInclusive = 1;
        final int endInclusive = 9;

        return Randoms.pickNumberInRange(startInclusive, endInclusive);
    }
}
