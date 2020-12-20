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
public class TareaBasico extends Tarea {
    
    
    private Date fechaEntrega;

    public TareaBasico() {
    }

    public TareaBasico(Date fechaEntrega, String descripcionTarea, int duracionTarea, String faseProyecto, String ingeniero, Date fechaInicio, String RolRequerido) {
        super(descripcionTarea, duracionTarea, faseProyecto, ingeniero, fechaInicio, RolRequerido);
        this.fechaEntrega = fechaEntrega;
    }
    
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

   
    

    

    
  
  
    
    
    
}
