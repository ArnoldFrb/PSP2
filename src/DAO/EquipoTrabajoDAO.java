/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import logica.EquipoTrabajo;
/**
 *
 * @author Cristo Te Ama...!!
 */
public interface EquipoTrabajoDAO {
    String Guardar (EquipoTrabajo equipoTrabajo) throws Exception;
    EquipoTrabajo Consultar(String id) throws Exception;
    //String Modificar(EquipoTrabajo equipoTrabajo) throws Exception;
    //String Eliminar(String id) throws Exception;
}
