package dog_game;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alexis
 */
public class Perro extends Thread {

    /*public JLabel perroLabel;
    public Ventana Vtn;
    public int PosW = 0;
    public int PosH = 0;
    public boolean Ejecutandose = true;
    public Hueso Huesometodo;

    public Perro(Ventana Vtn) {
        this.Vtn = Vtn;
        perroLabel = new JLabel("Perro");
    }

    public void Generar() {

        perroLabel.setBounds(900, 500, 120, 100);
        perroLabel.setVisible(true);
        ImageIcon perroicon = new ImageIcon(getClass().getResource("sprites\\Dog_Sprite_01.png"));
        ImageIcon Imagen_Perro = new ImageIcon(perroicon.getImage().getScaledInstance(perroLabel.getWidth(), perroLabel.getHeight(), Image.SCALE_SMOOTH));
        perroLabel.setIcon(Imagen_Perro);
        this.Vtn.Background.add(perroLabel);
        this.Vtn.Background.repaint();
        //Perseguir();
    }

   /* public void Perseguir() {
        System.out.println("Entré");
        int[] arreglo1 = Huesometodo.Numeros();
        int Pos1 = arreglo1[0];
        int Pos2 = arreglo1[1];
        System.out.println("PosH = " + Pos1);
        System.out.println("PosW = " + Pos2);

    }*/

    /*@Override
    public void run() {
        try {
            while (Ejecutandose == true) {
                Thread.sleep(1000);
                Generar();
                Vtn.Background.repaint();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
}
