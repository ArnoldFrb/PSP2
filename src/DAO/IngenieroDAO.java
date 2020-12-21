package DAO;
import java.util.List;
import logica.Ingeniero;

//Interfaz que se implementa en la clase IngenierosData,
//  con los metodos necesarios para el manejo de datos.
public interface IngenieroDAO {
    //Metodo que recibe un objeto de tipo ingeniero y lo almacenar (guarda) en el archivo
    String writeFile(Ingeniero ingeniero) throws Exception;
    //Metodo que consulta en el archivo y retorna un objeto de tipo ingeniero
    Ingeniero queryFile(int queryData) throws Exception;
    List<Ingeniero> readFile() throws Exception;
}
