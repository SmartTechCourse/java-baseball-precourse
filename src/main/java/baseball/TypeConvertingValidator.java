package baseball;

public class TypeConvertingValidator implements Validator {

    public static Boolean canConvertStringToInteger(String str) {
        return str != null && str.matches("[0-9]+");
    }

}
