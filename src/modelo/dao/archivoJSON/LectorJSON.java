package modelo.dao.archivoJSON;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author Samuel Gonzalez Montero
 * @date 07 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.json.JSONArray;
import org.json.JSONObject;

import modelo.Usuario;
import modelo.dataset.ListaUsuarios;



public class LectorJSON {

    private ListaUsuarios dataset;
    private final String fileName;

    public LectorJSON(ListaUsuarios dataset, String fileName) {
        this.dataset = dataset;
        this.fileName = fileName;
    }

    public void readAll() throws IOException {
        dataset.clear();

        File file = new File(fileName);

        // Si el archivo no existe, lanzamos IOException para que el DAO cargue datos de prueba
        if (!file.exists()) {
            throw new IOException("Archivo no encontrado: " + file.getAbsolutePath());
        }

        try {
        	FileInputStream input = new FileInputStream(file);
            String contenido = new String(input.readAllBytes(), StandardCharsets.UTF_8);
            
            System.out.println("Contenido JSON leído:");
            System.out.println(contenido);

            JSONObject jsonObj = new JSONObject(contenido);
            JSONArray jsonArray = jsonObj.getJSONArray("data");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject elemento = jsonArray.getJSONObject(i);
                Usuario usuario = new Usuario(
                	elemento.getString("Nombre"),
                    elemento.getString("Password"),
                    elemento.getDouble("Puntaje")
                    
                );
                dataset.insertar(usuario);
            }

            System.out.println("JSON cargado correctamente desde: " + file.getAbsolutePath());
            input.close();
        } catch (Exception e) {
            System.err.println("Error al leer JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /***********************************************
     * MÉTODO imprimir()
     * 
     * Método auxiliar para mostrar el contenido actual
     * del dataset en consola. Solo con fines didácticos y de pruebas.
     ***********************************************/

}



