package upmc.ui.images;

import upmc.game.Carte;
import upmc.game.Paquet;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GameUi {
    private int height;
    private int width;
    public static Joueur joueur1 = new Joueur(Paquet.jeu_joueur1);
    public static JFrame window = new JFrame("Uno - solitaire");

    public void init() {


        set_size(window);

        window.setLayout(new BorderLayout());

        JPanel pane = new JPanel();
        JLabel image = new JLabel( new ImageIcon( "cartes/0-rouge.png"));
        pane.add(image);


        joueur1.view_game();

        Joueur ordi = new Joueur(Paquet.jeu_joueur2);
        ordi.jeu_cache();

        Pioche pioche = new Pioche();
        pioche.fabriquer_pioche();

        Talon talon = new Talon();

        CardLayout cl = new CardLayout();
        talon.talon.setLayout(cl);

        cl.next(talon.talon);

        JPanel centre = new JPanel();
        centre.setLayout(new GridLayout(0,2));
        centre.add(pioche.pioche);
        centre.add(talon.talon);

        Carte debut = Paquet.paquet_melange.get(0);

        talon.ajouter_carte(debut, false);
        Paquet.paquet_melange.remove(debut);

        window.add(joueur1.jeu_visuel, BorderLayout.SOUTH);
        window.add(centre, BorderLayout.CENTER);
//        window.add(ordi.jeu_visuel, BorderLayout.NORTH);


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible( true );

    }

    private void set_size(JFrame window){
        //Récupération de la taille de l'écran pour avoir une fenêtre en plein écran
        Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.height = (int)dimension.getHeight();
        this.width  = (int)dimension.getWidth();
        window.setSize(width, height);
    }

}
