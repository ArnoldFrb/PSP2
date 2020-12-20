
package DAO;
import logica.EquipoTrabajo;
import logica.Ingeniero;
import java.util.ArrayList;

public interface EquipoTrabajoDAO {

    String writeFile (EquipoTrabajo equipoTrabajo) throws Exception;
    EquipoTrabajo queryFile(int id) throws Exception;
    ArrayList<Ingeniero> queryIngenierosEquipo(int id) throws Exception;

    //String Modificar(EquipoTrabajo equipoTrabajo) throws Exception;
    //String Eliminar(String id) throws Exception;
}
