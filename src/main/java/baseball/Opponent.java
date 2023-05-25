package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Opponent {

    private List<Integer> number;

    public List<Integer> getNumber() {
        if (number == null) {
            number = new ArrayList<>();
            generateNumber();
        }
        return number;
    }

    private void generateNumber() {
        HashSet<Integer> digits = new HashSet<>();
        while (digits.size() < 3) {
            int randomDigit = Randoms.pickNumberInRange(1, 9);
            digits.add(randomDigit);
        }
        number.addAll(digits);
    }

    public void resetNumber() {
        number.clear();
        generateNumber();
    }
}
