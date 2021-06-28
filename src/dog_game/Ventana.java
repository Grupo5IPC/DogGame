package dog_game;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author alexis
 */
public class Ventana extends JFrame implements MouseListener {

    static ImageIcon Icono = new ImageIcon(Ventana.class.getResource("sprites\\DogRunner_icon.png"));
    public JLabel Background;
    public JLabel Casa;
    public Perro dog;
    public JLabel Boton;
    public JLabel Bush;
    public JLabel Grass;
    public Hueso hueso1;
    public JLabel perrinho;

    public Ventana() {
        Componentes();
        hueso1 = new Hueso(this);
        dog = new Perro(this);
        dog.run();
    }

    public void Componentes() {
        //Frame
        this.setTitle("Dog Runner");
        this.setSize(1080, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.setVisible(true);
        this.setIconImage(Icono.getImage());

        //Jardin
        Background = new JLabel("Background");
        Background.setBounds(0, 0, 1080, 720);
        ImageIcon back = new ImageIcon(getClass().getResource("sprites\\Grass_Sprite.png"));
        ImageIcon Imagen_Back = new ImageIcon(back.getImage().getScaledInstance(Background.getWidth(), Background.getHeight(), Image.SCALE_SMOOTH));
        Background.setIcon(Imagen_Back);
        Background.setVisible(true);
        this.add(Background);

        //Casa
        Casa = new JLabel("Casa");
        Casa.setBounds(-420, -180, 1080, 720);
        ImageIcon casa = new ImageIcon(getClass().getResource("sprites\\House_Sprite.png"));
        ImageIcon Imagen_Casa = new ImageIcon(casa.getImage().getScaledInstance(Casa.getWidth(), Casa.getHeight(), Image.SCALE_SMOOTH));
        Casa.setIcon(Imagen_Casa);
        Casa.setVisible(true);
        this.Background.add(Casa);

        //Boton
        Boton = new JLabel("Boton Lanzar");
        Boton.setBounds(880, 640, 150, 50);
        Boton.setVisible(true);
        ImageIcon boton = new ImageIcon(getClass().getResource("sprites\\ButtonShadow_Sprite.png"));
        ImageIcon Imagen_Boton = new ImageIcon(boton.getImage().getScaledInstance(Boton.getWidth(), Boton.getHeight(), Image.SCALE_SMOOTH));
        Boton.setIcon(Imagen_Boton);
        Boton.addMouseListener(this);
        this.Background.add(Boton);
        
        //Arbol
        Bush = new JLabel("Bush");
        Bush.setBounds(0, 0, 1080, 720);
        Bush.setVisible(true);
        ImageIcon arbol = new ImageIcon(getClass().getResource("sprites\\Bush_Sprite.png"));
        ImageIcon Imagen_Arbol = new ImageIcon(arbol.getImage().getScaledInstance(Bush.getWidth(), Bush.getHeight(), Image.SCALE_SMOOTH));
        Bush.setIcon(Imagen_Arbol);
        this.Background.add(Bush);
        
        //Pasto Frontal
        Grass = new JLabel("Grass");
        Grass.setBounds(0, 275, 1080, 720);
        Grass.setVisible(true);
        ImageIcon grass = new ImageIcon(getClass().getResource("sprites\\FrontGrass_Sprite.png"));
        ImageIcon Imagen_Grass = new ImageIcon(grass.getImage().getScaledInstance(Grass.getWidth(), Grass.getHeight(), Image.SCALE_SMOOTH));
        Grass.setIcon(Imagen_Grass);
        this.Background.add(Grass);

        this.Background.repaint();
        this.setFocusable(true);

    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == Boton) {
            hueso1.run();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
}
