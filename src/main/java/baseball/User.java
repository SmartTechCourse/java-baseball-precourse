package baseball;

import camp.nextstep.edu.missionutils.Console;

public class User {

    private final int startInclusive;
    private final int endInclusive;

    public User(final int startInclusive, final int endInclusive) {
        this.startInclusive = startInclusive;
        this.endInclusive = endInclusive;
    }

    public int readValidNumber() throws IllegalArgumentException {
        String inputString = Console.readLine();
        if (!TypeConvertingValidator.canConvertStringToInteger(inputString)) {
            throw new IllegalArgumentException("입력된 문자열을 정수로 변환할 수 없습니다.");
        }

        int inputInteger = Integer.parseInt(inputString);

        if (!IntegerValidator.isInRange(startInclusive, endInclusive, inputInteger)) {
            throw new IllegalArgumentException("입력된 정수 값이 범위를 벗어납니다. 100 ~ 999 사이 값을 입력해주세요.");
        }

        return inputInteger;
    }
}
