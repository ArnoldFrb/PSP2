
package DAO;
import logica.EquipoTrabajo;
import logica.Ingeniero;
import java.util.List;

//Interfaz que se implementa en la clase uEquipoTrabajoData,
//  con los metodos necesarios para el manejo de datos.
public interface EquipoTrabajoDAO {
    String writeFile (EquipoTrabajo equipoTrabajo) throws Exception;
    EquipoTrabajo queryFile(int id) throws Exception;
    List<Ingeniero> queryIngenierosEquipo(int id) throws Exception;
    //String Modificar(EquipoTrabajo equipoTrabajo) throws Exception;
    //String Eliminar(String id) throws Exception;
}
