package baseball;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    NonPlayer npc = new NonPlayer();

    public void game() {
        boolean correctAnswer = false;
        npc.createAnswer();

        while (!correctAnswer) {
            System.out.print("숫자를 입력해 주세요 : ");
            Integer[] inputs = receivePlayerInput();
            Result result = npc.verify(inputs);
            System.out.println(result);
            if (result.correct()) correctAnswer = true;
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    private Integer[] receivePlayerInput() {
        String line = scanner.nextLine();
        return splitToGameInputs(line);
    }

    private Integer[] splitToGameInputs(String input) {
        String[] splitInput = input.split(",");
        if (splitInput.length != 3) throw new IllegalArgumentException();
        Integer[] inputInt = new Integer[3];
        for (int i = 0; i < 3; i++) {
            inputInt[i] = Integer.parseInt(splitInput[i]); // TODO: 2023/05/17 number format exception
            if (inputInt[i] > 9 || inputInt[i] < 0) throw new IllegalArgumentException();
        }

        return inputInt;
    }

    public boolean wantToReGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        String line = scanner.nextLine();
        if (line.equals("1")) return true;
        if (line.equals("2")) return false;

        throw new IllegalArgumentException();
    }
}
