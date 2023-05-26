package baseball;

public class Application {
    public static void main(String[] args) {
        Referee referee = new Referee();
        Game game = new Game(referee);
        game.run();
    }
}
