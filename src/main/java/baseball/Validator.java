package baseball;

import java.util.List;

public class Validator {

    public static boolean isInRange(List<Integer> inputDigits) {
        if (inputDigits.size() != 3 || inputDigits.contains(0)) {
            return false;
        }

        return true;
    }

    public static Boolean canConvertStringToInteger(String str) {
        return str != null && str.matches("[0-9]+");
    }

}
