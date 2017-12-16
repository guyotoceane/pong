package upmc.ui.images;

import upmc.game.Carte;
import upmc.game.Paquet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Talon {
    public static JPanel talon = new JPanel();
    CardLayout cl = new CardLayout();

    public Talon(){
        talon.setLayout(cl);
    }


    public void ajouter_carte(Carte carte){
        ImageIcon imageIcon = new ImageIcon("cartes/"+carte+".png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 140,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back

        JLabel image_carte = new JLabel(imageIcon);

        talon.add(image_carte);
        cl.next(talon);


    }


//    public void fabriquer_talon(){
//
//
//
//        for(Carte carte: Paquet.talon){
//            ImageIcon imageIcon = new ImageIcon("cartes/"+carte+".png"); // load the image to a imageIcon
//            Image image = imageIcon.getImage(); // transform it
//            Image newimg = image.getScaledInstance(100, 140,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
//            imageIcon = new ImageIcon(newimg);  // transform it back
//
//            JLabel image_carte = new JLabel(imageIcon);
//
//            talon.add(image_carte);

//            image_carte.addMouseListener(new MouseListener() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    cl.next(talon);
//                    Paquet.paquet_melange.remove(carte);
//                    Paquet.talon.add(carte);
//                    talon.repaint();
//                }
//
//                @Override
//                public void mousePressed(MouseEvent e) {
//
//                }
//
//                @Override
//                public void mouseReleased(MouseEvent e) {
//
//                }
//
//                @Override
//                public void mouseEntered(MouseEvent e) {
//
//                }
//
//                @Override
//                public void mouseExited(MouseEvent e) {
//
//                }
//            });

//        }

//    }
}
