package modelo.dataset;


import modelo.Usuario;

public class ListaUsuarios {

	private Usuario[] listaUsers;
	private int size;  // Cantidad de usuarios agregadas
	public static final int TAMANO_INICIAL = 10; // Capacidad inicial
	
	
	/**
     * Constructor por defecto: crea la lista con tamaño inicial estándar.
     */
	public ListaUsuarios() {
		listaUsers = new Usuario[TAMANO_INICIAL];
		size = 0;
		
	}
	
	 /**
     * Constructor con tamaño personalizado.
     */
	
	public ListaUsuarios(int tamano) {
		 listaUsers = new Usuario[Math.max(tamano, 1)]; // evita tamaño 0 o negativo
	        size = 0;
	}
	
	 public void insertar(Usuario usuario) {
		 if (usuario != null) {
	     if (size >= listaUsers.length) {
	    	 crecer();
	     }
	         listaUsers[size++] = usuario;
	     } else {
	         System.err.println("No se puede agregar un usuario nulo.");
	        }
	 }
	 
	 public Usuario[] mostrarMenu() {

		    Usuario[] temp = new Usuario[listaUsers.length];
		    for (int i = 0; i < listaUsers.length; i++) {
		        temp[i] = listaUsers[i];
		    }

		    for (int i = 0; i < temp.length - 1; i++) {
		        for (int j = 0; j < temp.length - 1 - i; j++) {


		            if (temp[j] == null || 
		               (temp[j+1] != null && temp[j].getPuntaje() < temp[j+1].getPuntaje())) {

		                Usuario aux = temp[j];
		                temp[j] = temp[j+1];
		                temp[j+1] = aux;
		            }
		        }
		    }

		    return temp;
		}

	 public Usuario mostrar(int index) {
		 if (index >= 0 && index < size) {
			 return listaUsers[index];
	     } else {
	    	 System.err.println("Índice fuera de rango: " + index);
	         return null;
	    }
	 }
	 
	 
	 
	 public Usuario[] buscar(int nivel, String nombre, double puntaje) {
		 Usuario[] temp = new Usuario[listaUsers.length];
		 int encontrado = 0;

		 for (int i = 0; i < listaUsers.length; i++) {
			 Usuario u = listaUsers[i];

		     if (u != null) {
		        	
		        if (nombre.equals(u.getNombreUsuario()) || puntaje == u.getPuntaje()) {		  	
		            temp[encontrado] = u;
		            encontrado++;
		        }
		    }
		}

		Usuario[] resultado = new Usuario[encontrado];
		for (int i = 0; i < encontrado; i++) {
		    resultado[i] = temp[i];
		}

		return resultado;
		}
	 
	 
	 public Usuario buscar(String nombre, String password) {

		    for (int i = 0; i < listaUsers.length; i++) {
		        Usuario u = listaUsers[i];

		        if (u != null) {
		            if (nombre.equals(u.getNombreUsuario()) &&
		                password.equals(u.getPassword())) {

		                return u;  // ¡Lo encontré! Me salgo del método.
		            }
		        }
		    }

		    return null; // No se encontró
		}


	 
	 
	 
	 private void crecer() {
		 int nuevoTamano = listaUsers.length * 2;
	     Usuario[] nuevaLista = new Usuario[nuevoTamano];
	     for (int i = 0; i < listaUsers.length; i++) {
	    	 nuevaLista[i] = listaUsers[i];
	     }
	     listaUsers = nuevaLista;
	     System.out.println("Dataset ampliado a " + nuevoTamano + " elementos.");
	    }
	 
	 
	 public String imprimir() {
		 String valores = "";
	     for (int i = 0; i < size; i++) {
	    	 valores = valores + "Id: "+listaUsers[i].getIdOficial()+", Nombre de Usuario: "+listaUsers[i].getNombreUsuario()+", Password: "+listaUsers[i].getPassword() 
	    			 +", Puntaje: "+ listaUsers[i].getPuntaje()+ "\n";
	     }
	     return valores;
	    }
	 
	 
	 public boolean actualizarUsuario(Usuario usuarioActualizado) {
		    for (int i = 0; i < listaUsers.length; i++) {
		        if (listaUsers[i] != null && listaUsers[i].getIdOficial() == usuarioActualizado.getIdOficial()) {

		        	listaUsers[i] = usuarioActualizado;
		            return true;
		        }
		    }
		    return false;
		}
	 
	 
	 public boolean eliminarUsuario(Usuario usuarioActualizado) {
		 for (int i = 0; i < listaUsers.length; i++) {
		        if (listaUsers[i] != null && listaUsers[i].getIdOficial() == usuarioActualizado.getIdOficial()) {

		        	listaUsers[i] = null;
		            return true;
		        }
		    }		 
		 return false;
	 }
	 
	 //getter y setts
	 
	 public int getSize() {
	        return size;
	    }
	 
	 public void clear() {
		 for (int i = 0; i < listaUsers.length; i++) {
		        listaUsers[i] = null;
		    }
		    size = 0;
		 }
}
