package baseball;

public class Application {
    public static void main(String[] args) {
        boolean wantToGame = true;
        Game game = new Game();
        while (wantToGame) {
            game.game();
            wantToGame = game.wantToReGame();
        }
    }
}
