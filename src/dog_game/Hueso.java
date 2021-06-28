package dog_game;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alexis
 */
public class Hueso extends Thread {

    public JLabel hueso;
    public Perro perrito;
    public Ventana Vtn;
    public int PosW;
    public int PosH;
    public static Musica musiquita;

    public Hueso(Ventana Vtn) {
        this.Vtn = Vtn;
        hueso = new JLabel("Hueso");
        perrito = new Perro(Vtn);
    }

    public void GenerarHueso() {
        //HUESO
        int randomizeW = ThreadLocalRandom.current().nextInt(300, 1000);
        int randomizeH = ThreadLocalRandom.current().nextInt(100, 550);
        hueso.setBounds(randomizeW, randomizeH, 60, 30);
        hueso.setVisible(true);
        ImageIcon bone = new ImageIcon(getClass().getResource("sprites\\Bone_Sprite.png"));
        ImageIcon Imagen_Hueso = new ImageIcon(bone.getImage().getScaledInstance(hueso.getWidth(), hueso.getHeight(), Image.SCALE_SMOOTH));
        hueso.setIcon(Imagen_Hueso);
        PosW = randomizeW;
        PosH = randomizeH;
        perrito.Posiciones(PosW, PosH);
        perrito.perroLabel.setVisible(false);
        this.Vtn.Background.add(hueso);
        this.Vtn.Background.repaint();

    }

    @Override
    public void run() {
        try {
            GenerarHueso();
            Vtn.Background.repaint();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
