package upmc.ui.images;

import upmc.game.Carte;
import upmc.game.Paquet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Pioche {
    public JPanel pioche = new JPanel();

    public void fabriquer_pioche(){
        CardLayout cl = new CardLayout();
        pioche.setLayout(cl);

        for(Carte carte: Paquet.paquet_melange){
//            ImageIcon imageIcon = new ImageIcon("cartes/dos.png"); // load the image to a imageIcon
            ImageIcon imageIcon = new ImageIcon("cartes/dos.png"); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newimg = image.getScaledInstance(100, 140,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            imageIcon = new ImageIcon(newimg);  // transform it back

            JLabel image_carte = new JLabel(imageIcon);

            pioche.add(image_carte);

            image_carte.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    cl.next(pioche);
                    Paquet.paquet_melange.remove(carte);
                    Paquet.talon.add(carte);
                    pioche.remove(image_carte);
                    pioche.repaint();
                    GameUi.joueur1.ajouter_carte(carte);
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

        }

    }
}
