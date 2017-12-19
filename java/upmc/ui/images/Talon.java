package upmc.ui.images;

import upmc.game.Carte;
import upmc.game.Game;
import upmc.game.Paquet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Talon {
    public static JPanel talon = new JPanel();
    CardLayout cl = new CardLayout();

    public Talon() {
        talon.setLayout(cl);
    }


    public void ajouter_carte(Carte carte, Boolean next) {
        ImageIcon imageIcon = new ImageIcon("cartes/" + carte + ".png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 140, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back

        JLabel image_carte = new JLabel(imageIcon);

        talon.add(image_carte);

        Game.derniere_talon = carte;

        if(next){
            cl.next(talon);
        }




    }

}