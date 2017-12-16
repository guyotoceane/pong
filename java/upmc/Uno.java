package upmc;

import upmc.game.Game;
import upmc.ui.images.GameUi;

public class Uno {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();

        GameUi game_ui = new GameUi();
        game_ui.init();
    }
}
