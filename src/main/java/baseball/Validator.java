package baseball;

import java.util.Arrays;

public class Validator {

    public static void validate(String input) {
        checkTypeConverting(input);
        checkDuplication(input);
        checkContainZero(input);
    }

    private static void checkTypeConverting(String input) {
        if (input == null || !input.matches("[0-9]+")) {
            throw new IllegalArgumentException("입력값에 숫자가 아닌 다른 값이 포함돼있습니다. 숫자만 입력해주세요.");
        }
    }

    private static void checkDuplication(String input) {
        long nonDuplicateWordCount = Arrays
            .stream(input.split(""))
            .distinct()
            .count();

        if (nonDuplicateWordCount != input.length()) {
            throw new IllegalArgumentException("입력값에 중복이 포함돼있습니다. 중복되지 않는 숫자를 입력해주세요.");
        }
    }

    private static void checkContainZero(String input) {
        if (input.contains("0")) {
            throw new IllegalArgumentException("입력 값에 0은 포함될 수 없습니다. 1부터 9까지 숫자만 입력해주세요.");
        }
    }
}
