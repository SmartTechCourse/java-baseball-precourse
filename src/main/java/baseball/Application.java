package baseball;

public class Application {
    public static void main(String[] args) {
        Referee referee = new Referee();
        View view = new View();
        Player player = new Player();
        Opponent computer = new Opponent();
        Game game = new Game(referee, view, player, computer);
        game.run();
    }
}
