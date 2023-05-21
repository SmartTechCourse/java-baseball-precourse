package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.LinkedList;
import java.util.List;

public class Player {

    public List<Integer> readValidNumber() throws IllegalArgumentException {
        String inputString = Console.readLine();
        if (!Validator.canConvertStringToInteger(inputString)) {
            throw new IllegalArgumentException("올바른 숫자 형식으로 입력해주세요.");
        }

        int inputNumber = Integer.parseInt(inputString);

        List<Integer> inputDigits = convertToList(inputNumber);

        if (!Validator.isInRange(inputDigits)) {
            throw new IllegalArgumentException("1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 입력해주세요.");
        }

        return inputDigits;
    }

    private List<Integer> convertToList(int inputNumber) {

        List<Integer> inputDigits = new LinkedList<>();
        while (inputNumber > 0) {
            inputDigits.add(inputNumber % 10);
            inputNumber /= 10;
        }

        return inputDigits;
    }
}
