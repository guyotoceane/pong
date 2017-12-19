package upmc.game;

public class Game {

    public static Carte derniere_talon;

    public void init() {

        Paquet paquet = new Paquet();
        paquet.init();

        System.out.println(Paquet.jeu_joueur1);
    }

}
