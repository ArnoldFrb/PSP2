
package DAO;
import logica.EquipoTrabajo;
import logica.Ingeniero;
import java.util.List;

public interface EquipoTrabajoDAO {

    String writeFile (EquipoTrabajo equipoTrabajo) throws Exception;
    EquipoTrabajo queryFile(int id) throws Exception;
    List<Ingeniero> queryIngenierosEquipo(int id) throws Exception;

    //String Modificar(EquipoTrabajo equipoTrabajo) throws Exception;
    //String Eliminar(String id) throws Exception;
}
