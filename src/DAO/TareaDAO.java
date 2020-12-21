package DAO;
import java.util.List;
import logica.Tarea;

//Interfaz que se implementa en la clase TareaData,
//  con los metodos necesarios para el manejo de datos.
public interface TareaDAO {
    //Metodo que recibe un objeto de tipo tarea y lo almacenar (guarda) en el archivo
    String writeFile (Tarea tarea) throws Exception;
    //Metodo que consulta en el archivo y retorna un objeto de tipo tarea
    Tarea queryFile(int id) throws Exception;
    List<Tarea> readFile() throws Exception;
}
