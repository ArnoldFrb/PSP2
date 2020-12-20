package DAO;
import logica.Ingeniero;

public interface IngenieroDAO {
    String Guardar (Ingeniero ingeniero) throws Exception;
    Ingeniero Consultar(String id) throws Exception;
    //String Modificar(Ingeniero ingeniero) throws Exception;
    //String Eliminar(String id) throws Exception;
}
