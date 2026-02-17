package modelo;

import java.io.BufferedReader;
import java.io.FileReader;

public class LectorConfig {

    public static int leerVidas() {
        try (BufferedReader br = new BufferedReader(new FileReader("data/config.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("vidas=")) {
                    String valor = linea.substring("vidas=".length());
                    return Integer.parseInt(valor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 3; // valor por defecto si algo falla
    }
}
