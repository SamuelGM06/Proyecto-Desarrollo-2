package modelo.dao;


import modelo.Usuario;

public interface IDAO_Usuario {
	
	 public abstract void cargarUsuarios();
	 
	 public abstract void guardarDataset();
	 
	 public abstract boolean insertar(Usuario usuario);
	 
	 public abstract boolean actualizar(Usuario usuario);
	 
	 public abstract boolean eliminar(Usuario usuario);
	 
	 public abstract Usuario[] mostrar(int nivel, String nombre, double puntaje);
	 public abstract Usuario[] mostrar();
	 
	 public abstract Usuario buscar(String nombre, String password);
	 
	 public abstract void recargar();

}
