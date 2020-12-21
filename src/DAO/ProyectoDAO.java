package DAO;
import logica.Proyecto;
import java.util.List;

public interface ProyectoDAO {
    String writeFile (Proyecto proyecto) throws Exception;
    Proyecto queryFile(int queryData) throws Exception;
    List<Proyecto> readFile() throws Exception;
    //String Modificar(Tarea tarea) throws Exception;
    //String Eliminar(String id) throws Exception;
}