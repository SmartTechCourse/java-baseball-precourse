package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Player {

    private List<Integer> number;

    public List<Integer> getNumber() {
        String input = Console.readLine();
        Validator.validate(input);
        number = convertStringToIntegerList(input);
        return number;
    }

}
