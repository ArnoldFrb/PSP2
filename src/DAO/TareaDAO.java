package DAO;
import logica.Tarea;

public interface TareaDAO {
    String writeFile (Tarea tarea) throws Exception;
    Tarea queryFile(int id) throws Exception;
    //String Modificar(Tarea tarea) throws Exception;
    //String Eliminar(String id) throws Exception;
}
