package modelo;

public class Usuario {
	
	private String nombreUsuario;
	private String password;
	private double puntaje;
	private static int id;
	private int idOficial;
	
	public static final String PASSWORD = "Password";
	public static final String NOMBRE = "Nombre";
	public static final String PUNTAJE = "Puntaje";
	public static final String ID = "Id";
	
	
	
	public Usuario(String nombreUsuario, String password, double puntaje) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.puntaje = puntaje;
		idOficial = id;
		id++;
	}



	public Usuario(String nombreUsuario, String password) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		puntaje = 0;
		idOficial = id;
		id++;
	}



	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public int getIdOficial() {
		return idOficial;
	}

	@Override
	public String toString() {
	    return String.format("%-12s | Puntaje: %-5.2f",
	            nombreUsuario,
	            puntaje);
	}
	
	
}
