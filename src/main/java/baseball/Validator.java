package baseball;

import java.util.Arrays;

public class Validator {

    public static void validate(String input) {
        checkTypeConverting(input);
        checkDuplication(input);
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
}
