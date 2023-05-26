package baseball;

import java.util.Arrays;

import static baseball.Message.*;

public class Validator {

    public static void validate(String input) {
        checkTypeConverting(input);
        checkDuplication(input);
        checkContainZero(input);
        checkLength(input);
    }

    private static void checkTypeConverting(String input) {
        if (input == null || !input.matches("[0-9]+")) {
            throw new IllegalArgumentException(USER_NUMBER_NOT_NUMBER_ERROR.getBody());
        }
    }

    private static void checkDuplication(String input) {
        long nonDuplicateWordCount = Arrays
            .stream(input.split(""))
            .distinct()
            .count();

        if (nonDuplicateWordCount != input.length()) {
            throw new IllegalArgumentException(USER_NUMBER_DUPLICATE_ERROR.getBody());
        }
    }

    private static void checkContainZero(String input) {
        if (input.contains("0")) {
            throw new IllegalArgumentException(USER_NUMBER_CONTAIN_ZERO_ERROR.getBody());
        }
    }

    private static void checkLength(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException(USER_NUMBER_LENGTH_ERROR.getBody());
        }
    }
}
