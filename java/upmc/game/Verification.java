package upmc.game;

import upmc.ui.images.Talon;

public class Verification {

    private String type;
    private String valeur;
    private Carte carte;

    private Talon talon = new Talon();


    public Verification(Carte carte){
        this.type = carte.type;
        this.valeur = carte.valeur;
        this.carte = carte;

    }


    public int verifier_type(){

        int retour = 0;
        String type_talon = Game.derniere_talon.type;

        if(!this.type.equals("joker")){
            if(type_talon.equals(this.type)){
                if(type_talon.equals("joker")){

                } else {
                    ajouter_talon();
                }
            } else{
                retour = verifier_valeur();
            }
        } else {
            ajouter_talon();
        }



        return retour;

    }

    private int verifier_valeur(){
        int retour = 0;

        String valeur_talon = Game.derniere_talon.valeur;

        if(valeur_talon.equals(this.valeur)){
            ajouter_talon();
        } else {
            retour = 1;
        }

        return retour;


    }

    private void ajouter_talon(){
        talon.ajouter_carte(this.carte, true);
    }



}
