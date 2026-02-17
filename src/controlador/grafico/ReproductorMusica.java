package controlador.grafico;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class ReproductorMusica {

    private Clip clip;

    public void reproducirMusica(String ruta) {
        try {
            File archivo = new File(ruta); // ← ruta directa del archivo
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(archivo);

            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void detener() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}
