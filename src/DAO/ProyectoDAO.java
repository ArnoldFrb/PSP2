package DAO;
import logica.Tarea;
import logica.Proyecto;

public interface ProyectoDAO {
    String writeFile (Proyecto proyecto) throws Exception;
    Tarea queryFile(int id) throws Exception;
    //String Modificar(Tarea tarea) throws Exception;
    //String Eliminar(String id) throws Exception;
}