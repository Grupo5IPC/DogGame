package dog_game;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alexis
 */
public class Perro extends Thread {

    public JLabel perroLabel;
    public Ventana Vtn;
    public static int ValorX;
    public static int ValorY;

    public Perro(Ventana Vtn) {
        this.Vtn = Vtn;
        Generar();
    }

    public void Generar() {
        perroLabel = new JLabel("Perro");
        perroLabel.setBounds(900, 500, 120, 100);
        perroLabel.setVisible(true);
        ImageIcon perroicon = new ImageIcon(getClass().getResource("sprites\\Dog_Sprite_01.png"));
        ImageIcon Imagen_Perro = new ImageIcon(perroicon.getImage().getScaledInstance(perroLabel.getWidth(), perroLabel.getHeight(), Image.SCALE_SMOOTH));
        perroLabel.setIcon(Imagen_Perro);
        this.Vtn.Background.add(perroLabel);
        this.Vtn.Background.repaint();
    }

    public void Posiciones(int PosW, int PosH) {
        //System.out.println("W = " + PosW + ", H = " + PosH);
        ValorX = PosW;
        ValorY = PosH;
    }

    public void MovimientoSabroso(int Valor1, int Valor2) throws InterruptedException {
        //System.out.println(Valor1 + ", " + Valor2);

        //Valores Iniciales
        if (Valor1 == 0 && Valor2 == 0) {
            Valor1 = 900;
            Valor2 = 500;
        }
        //Mov X
        if (perroLabel.getX() != Valor1 && perroLabel.getX() >= Valor1) {
            perroLabel.setLocation(perroLabel.getX() - 1, perroLabel.getY());
        }

        if (perroLabel.getX() != Valor1 && perroLabel.getX() <= Valor1) {
            perroLabel.setLocation(perroLabel.getX() + 1, perroLabel.getY());
        }
        //Mov Y
        if (perroLabel.getY() != Valor2 && perroLabel.getY() >= Valor2) {
            perroLabel.setLocation(perroLabel.getX(), perroLabel.getY() - 1);
        }

        if (perroLabel.getY() != Valor2 && perroLabel.getY() <= Valor2) {
            perroLabel.setLocation(perroLabel.getX(), perroLabel.getY() + 1);
        }
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(10);
                MovimientoSabroso(ValorX, ValorY);
                Vtn.Background.repaint();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
