package DAO;
import logica.Tarea;

public interface TareaDAO {
    String Guardar (Tarea tarea) throws Exception;
    Tarea Consultar(String id) throws Exception;
    //String Modificar(Tarea tarea) throws Exception;
    //String Eliminar(String id) throws Exception;
}
