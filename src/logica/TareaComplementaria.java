/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author juana
 */
public class TareaComplementaria extends Tarea{

    public TareaComplementaria(String descripcionTarea, int duracionTarea, FaseProyecto faseProyecto, Ingeniero ingeniero, Date fechaInicio, String RolRequerido) {
        super(descripcionTarea, duracionTarea, faseProyecto, ingeniero, fechaInicio, RolRequerido);
    }
    
    
    
}
