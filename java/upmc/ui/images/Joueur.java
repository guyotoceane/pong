package upmc.ui.images;

import upmc.game.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Joueur {
    public ArrayList<Carte> jeu = new ArrayList();

    public JPanel jeu_visuel = new JPanel();

    public Joueur(ArrayList jeu){
        this.jeu = jeu;
    }

    public void ajouter_carte(Carte carte){
        ImageIcon imageIcon = new ImageIcon("cartes/"+carte+".png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 140,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back

        JLabel image_carte = new JLabel(imageIcon);

        jeu_visuel.add(image_carte);

        Paquet.jeu_joueur1.add(carte);

        System.out.println(Paquet.jeu_joueur1);

        jeu_visuel.repaint();

        actions(image_carte, carte);
    }

    public synchronized  void view_game(){
        jeu_visuel.setLayout(new GridLayout(1,20));

        for(Carte carte:this.jeu){

//            JLabel image_carte = new JLabel(new ImageIcon( "cartes/"+this.jeu.get(i)+".png"));


            ImageIcon imageIcon = new ImageIcon("cartes/"+carte+".png"); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newimg = image.getScaledInstance(100, 140,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            imageIcon = new ImageIcon(newimg);  // transform it back

            JLabel image_carte = new JLabel(imageIcon);

            jeu_visuel.add(image_carte);

            actions(image_carte, carte);






        }

    }


    public void actions(JLabel image_carte, Carte carte){
        image_carte.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {




                Verification verification = new Verification(carte);
                int verif = verification.verifier_type();

                if(verif==0){
                    jeu_visuel.remove(image_carte);
                    Paquet.talon.add(carte);
                    jeu.remove(carte);

                    jeu_visuel.repaint();
                }


                if(Paquet.jeu_joueur1.size() == 0){
                    System.out.println("gagné");
                    Container cp = GameUi.window.getContentPane();
                    cp.removeAll();
                    cp.add(new JLabel("Vous avez gagné"), BorderLayout.NORTH);
                    cp.repaint();
                }


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

    public void jeu_cache(){
        jeu_visuel.setLayout(new GridLayout(1,20));

        for(int i=0; i<this.jeu.size(); i++){
            ImageIcon imageIcon = new ImageIcon("cartes/dos.png"); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newimg = image.getScaledInstance(100, 140,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            imageIcon = new ImageIcon(newimg);  // transform it back

            JLabel image_carte = new JLabel(imageIcon);

            jeu_visuel.add(image_carte);



        }
    }
}
