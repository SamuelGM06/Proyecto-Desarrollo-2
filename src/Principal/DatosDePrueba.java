package Principal;


import modelo.Usuario;
import modelo.dao.IDAO_Usuario;

public class DatosDePrueba {
	public static void cargarUsuariosDePrueba(IDAO_Usuario dao) {
        dao.insertar(new Usuario("Pepe", "1234"));
        dao.insertar(new Usuario("Samue", "sadhga"));
        dao.insertar(new Usuario("Dylon", "abcd"));
    }

}
