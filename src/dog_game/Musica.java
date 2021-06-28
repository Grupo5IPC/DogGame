package dog_game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author alexis
 */
public class Musica extends Thread {

    public static Player p1;

    public Musica() throws FileNotFoundException, JavaLayerException {
        Musica.p1 = new Player(new FileInputStream("src\\dog_game\\sprites\\retro_music.mp3"));
    }

    @Override
    public void run() {
        try {
            p1.play();
        } catch (JavaLayerException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
