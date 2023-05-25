package baseball;

public class Application {
    public static void main(String[] args) {

        Player player = new Player();
        Opponent computer = new Opponent();
        Referee referee = new Referee(player, computer);
        View view = new View();

        Game game = new Game(referee, view);
        game.run();
    }
}
