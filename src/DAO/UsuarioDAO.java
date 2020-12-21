package DAO;
import logica.Usuario;

//Interfaz que se implementa en la clase usuarioData,
//  con los metodos necesarios para el manejo de datos.
public interface UsuarioDAO {
    //Metodo que recibe un objeto de tipo usuario y lo almacenar (guarda) en el archivo
    String writeFile(Usuario usuario) throws Exception;
    //Metodo que consulta en el archivo y retorna un objeto de tipo usuario
    Usuario queryFile(int querydata) throws Exception;
    String login(String usuario, String contraseña) throws Exception;
}
