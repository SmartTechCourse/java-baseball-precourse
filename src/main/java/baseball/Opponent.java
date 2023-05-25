package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
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
        for (int i = 0; i < 3; i++) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            number.add(randomNumber);
        }
    }

    public void resetNumber() {
        number.clear();
        generateNumber();
    }
}
