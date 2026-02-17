package modelo;

public class Usuario {

	private String nombreUsuario;
	private String password;
	private int nivelJuego;
	private double puntaje;
	private static int id;
	private int idOficial;
	
	
	
	public Usuario(String nombreUsuario, String password, int nivelJuego, double puntaje) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.nivelJuego = nivelJuego;
		this.puntaje = puntaje;
		idOficial = id;
		id++;
	}
	
	
	
	
}
