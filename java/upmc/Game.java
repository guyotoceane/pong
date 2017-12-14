package upmc;

import upmc.game.Carte;
import upmc.game.ColorCard;
import upmc.game.Paquet;

public class Game {
    public static void main(String[] args) {

        Paquet paquet = new Paquet();
        paquet.init();

        System.out.println(Paquet.paquet_melange);

    }
}
