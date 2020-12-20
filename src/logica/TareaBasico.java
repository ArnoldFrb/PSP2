
package logica;

import java.util.Date;

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
    
    @Override
    public String toString() {
        return "Tarea Basica:" + 
                "\nId de Tarea: " + super.getIdentificadorTarea() + 
                "\nDescripcion de Tarea: " + super.getDescripcionTarea() + 
                "\nDuracion de Tarea: " + super.getDuracionTarea() + 
                "\nFase de Proyecto: " + super.getFaseProyecto() + 
                "\nIngeniero: " + super.getIngeniero() + 
                "\nFecha de Inicio: " + super.getFechaInicio() + 
                "\nEstado de Tarea: " + super.getEstadoTarea() + 
                "\nRol Requerido: " + super.getRolRequerido() + 
                "\nJustificacion: " + super.getJustificacion() + 
                "\nFecha de Entrega: " + this.fechaEntrega;
    }

    public String datosParaArchivo(){
        return super.getIdentificadorTarea()+";"+super.getDescripcionTarea()+";"+super.getDuracionTarea()+";"+super.getFaseProyecto()+";"+super.getIngeniero()+";"+super.getFechaInicio()+";"+super.getEstadoTarea()+";"+super.getRolRequerido()+";"+super.getJustificacion()+";"+this.fechaEntrega+"\n";
    }
}
