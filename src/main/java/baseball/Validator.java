package baseball;

public class Validator {

    public static void validate(String input) {
        checkTypeConverting(input);
    }

    private static void checkTypeConverting(String input) {
        if (input == null || !input.matches("[0-9]+")) {
            throw new IllegalArgumentException("입력값에 숫자가 아닌 다른 값이 포함돼있습니다. 숫자만 입력해주세요.");
        }
    }
}
