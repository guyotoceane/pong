package upmc.game;

public abstract class Carte {

    public String type;
    public String valeur;

    public Carte(String type, String valeur){
        this.type = type;
        this.valeur = valeur;
    }

}
