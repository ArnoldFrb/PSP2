package DAO;
import logica.Usuario;

public interface UsuarioDAO {
    String writeFile (Usuario usuario) throws Exception;
    Usuario queryFile(int querydata) throws Exception;
    //String Modificar(Usuario usario) throws Exception;
    //String Eliminar(String id) throws Exception;
}
