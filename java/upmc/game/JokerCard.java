package upmc.game;

public class JokerCard extends Carte {
    public JokerCard(String type, String valeur) {
        super(type, valeur);
    }

    public String toString() {
        return this.valeur + "-" + this.type;
    }

}
