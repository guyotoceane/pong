package upmc.game;

public class ColorCard extends Carte {
    public ColorCard(String type, String valeur) {
        super(type, valeur);
    }

    public String toString() {
        return this.valeur+ "-" + this.type;
    }
}
