package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Player {
    private List<Integer> number;

    public List<Integer> getNumber() {
        String input = Console.readLine();
        Validator.validate(input);
        number = convertStringToIntegerList(input);
        return number;
    }

    private List<Integer> convertStringToIntegerList(String input) {
        return Arrays
            .stream(input.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}