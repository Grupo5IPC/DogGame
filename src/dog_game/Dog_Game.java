package dog_game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Dog_Game {

    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {

        Musica musica = new Musica();
        musica.start();
        
        Ventana v1 = new Ventana();
    }
}
