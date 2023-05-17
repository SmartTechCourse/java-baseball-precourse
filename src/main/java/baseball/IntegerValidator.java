package baseball;

public class IntegerValidator implements Validator {

    public static boolean isInRange(
        final int startInclusive,
        final int endInclusive,
        int number
    ) {
        validateRange(startInclusive, endInclusive);

        if (startInclusive <= number && number <= endInclusive) {
            return true;
        }
        return false;
    }


    private static void validateRange(final int startInclusive, final int endInclusive) {
        if (startInclusive > endInclusive) {
            throw new IllegalArgumentException("startInclusive cannot be greater than endInclusive.");
        }
        if (endInclusive == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("endInclusive cannot be greater than Integer.MAX_VALUE.");
        }
        if (endInclusive - startInclusive >= Integer.MAX_VALUE) {
            throw new IllegalArgumentException("the input range is too large.");
        }
    }


}
