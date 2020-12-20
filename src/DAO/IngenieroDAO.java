package DAO;
import logica.Ingeniero;

public interface IngenieroDAO {
    String writeFile(Ingeniero ingeniero) throws Exception;
    Ingeniero queryFile(int queryData) throws Exception;
    //String Modificar(Ingeniero ingeniero) throws Exception;
    //String Eliminar(String id) throws Exception;
}
