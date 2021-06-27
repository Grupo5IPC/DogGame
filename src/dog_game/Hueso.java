package dog_game;

import java.awt.Image;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alexis
 */
public class Hueso extends Thread {

    public JLabel hueso;
    public JLabel perroLabel;
    public boolean Ejecutandose = true;
    public Ventana Vtn;
    public int PosW = 0;
    public int PosH = 0;

    public Hueso(Ventana Vtn) {
        this.Vtn = Vtn;
        hueso = new JLabel("Hueso");
        perroLabel = new JLabel("Perro");
    }

    public void Generar() {
        //HUESO
        int randomizeW = ThreadLocalRandom.current().nextInt(300, 1000);
        int randomizeH = ThreadLocalRandom.current().nextInt(200, 600);
        hueso.setBounds(randomizeW, randomizeH, 50, 20);
        hueso.setVisible(true);
        ImageIcon bone = new ImageIcon(getClass().getResource("sprites\\Bone_Sprite.png"));
        ImageIcon Imagen_Hueso = new ImageIcon(bone.getImage().getScaledInstance(hueso.getWidth(), hueso.getHeight(), Image.SCALE_SMOOTH));
        hueso.setIcon(Imagen_Hueso);
        PosW = randomizeW;
        PosH = randomizeH;
        this.Vtn.Background.add(hueso);

        //PERRO
        perroLabel.setBounds(900, 500, 120, 100);
        perroLabel.setVisible(true);
        ImageIcon perroicon = new ImageIcon(getClass().getResource("sprites\\Dog_Sprite_01.png"));
        ImageIcon Imagen_Perro = new ImageIcon(perroicon.getImage().getScaledInstance(perroLabel.getWidth(), perroLabel.getHeight(), Image.SCALE_SMOOTH));
        perroLabel.setIcon(Imagen_Perro);
        this.Vtn.Background.add(perroLabel);
        this.Vtn.Background.repaint();
    }

    public void Perseguir() {
        System.out.println("PosH = " + PosH);
        System.out.println("PosW = " + PosW);
        perroLabel.setLocation(((perroLabel.getX() - 10)), ((perroLabel.getY() - 10)));
    }

    @Override
    public void run() {
        try {
            //Generar();
            Vtn.Background.repaint();

            while (Ejecutandose == true) {
                Thread.sleep(1000);
                Perseguir();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
