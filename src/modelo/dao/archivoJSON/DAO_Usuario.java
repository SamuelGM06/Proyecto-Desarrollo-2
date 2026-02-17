package modelo.dao.archivoJSON;

import java.io.IOException;

import modelo.Usuario;
import modelo.dao.IDAO_Usuario;
import modelo.dataset.ListaUsuarios;


public class DAO_Usuario implements IDAO_Usuario{
	private ListaUsuarios dataset;
	private EscritorJSON escritor;
	private LectorJSON lector;
	public static final String FILE_NAME = "data/usuarios.json";
	
	public DAO_Usuario(ListaUsuarios dataset) {
		this.dataset = dataset;
		escritor = new EscritorJSON(dataset, FILE_NAME);
		lector = new LectorJSON(dataset, FILE_NAME);
		
		cargarUsuarios();
	}

	@Override
	public void cargarUsuarios() {
		try {
			lector.readAll();
		} catch (IOException ex) {
			System.err.println("Error al leer JSON. Cargando datos de prueba.");
		}
	}

	@Override
	public void guardarDataset() {
		try {
			escritor.writeAll();
		} catch (IOException ex) {
			System.err.println("Error al guardar JSON: " + ex.getMessage());
		}
		
	}

	@Override
	public boolean insertar(Usuario usuario) {
		dataset.insertar(usuario);
		guardarDataset();// Guarda los datos del dataset al archivo JSON
		return true;
	}

	@Override
	public boolean actualizar(Usuario usuario) {
		boolean actualizado = dataset.actualizarUsuario(usuario);

	    if (actualizado) {
	        guardarDataset();
	    }

	    return actualizado;
	}

	@Override
	public boolean eliminar(Usuario usuario) {
		boolean eliminado = dataset.eliminarUsuario(usuario);

	    if (eliminado) {
	        guardarDataset();
	    }

	    return eliminado;
	}

	@Override
	public Usuario[] mostrar(int nivel, String nombre, double puntaje) {
		
		
		return dataset.buscar(nivel, nombre, puntaje);
	}

	@Override
	public Usuario buscar(String nombre, String password) {
		
		return dataset.buscar(nombre, password);
	}

	@Override
	public void recargar() {
		try {
	        dataset.clear();      // <-- importante
	        lector.readAll();       // vuelve a leer del JSON
	    } catch (IOException e) {
	        System.err.println("Error al recargar usuarios");
	    }
	}

	@Override
	public Usuario[] mostrar() {
		return dataset.mostrarMenu();
	}

}
