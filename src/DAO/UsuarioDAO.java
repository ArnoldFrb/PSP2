package DAO;
import logica.Usuario;

public interface UsuarioDAO {
    String Guardar (Usuario usuario) throws Exception;
    Usuario Consultar(int id) throws Exception;
    //String Modificar(Usuario usario) throws Exception;
    //String Eliminar(String id) throws Exception;
}
