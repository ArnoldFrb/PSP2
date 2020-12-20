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
public abstract class Tarea {
    
    private int identificadorTarea;
    private String descripcionTarea;
    private int duracionTarea;
    private FaseProyecto faseProyecto;
    private Ingeniero ingeniero;
    private Date fechaInicio;
    private EstadoTarea estadoTarea;
    private String RolRequerido;
    private String Justificacion;

    public Tarea(String descripcionTarea, int duracionTarea, FaseProyecto faseProyecto, Ingeniero ingeniero, Date fechaInicio, String RolRequerido) {
        
        this.identificadorTarea++;
        this.descripcionTarea = descripcionTarea;
        this.duracionTarea = duracionTarea;
        this.faseProyecto = faseProyecto;
        this.ingeniero = ingeniero;
        this.fechaInicio = fechaInicio;
        this.RolRequerido = RolRequerido;
        this.estadoTarea = EstadoTarea.pendiente;
        
    }

    public String getJustificacion() {
        return Justificacion;
    }

    public void setJustificacion(String Justificacion) {
        this.Justificacion = Justificacion;
    }

    public int getIdentificadorTarea() {
        return identificadorTarea;
    }

    public void setIdentificadorTarea(int identificadorTarea) {
        this.identificadorTarea = identificadorTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public int getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(int duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public FaseProyecto getFaseProyecto() {
        return faseProyecto;
    }

    public void setFaseProyecto(FaseProyecto faseProyecto) {
        this.faseProyecto = faseProyecto;
    }

    public Ingeniero getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(Ingeniero ingeniero) {
        this.ingeniero = ingeniero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public EstadoTarea getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(EstadoTarea estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public String getRolRequerido() {
        return RolRequerido;
    }

    public void setRolRequerido(String RolRequerido) {
        this.RolRequerido = RolRequerido;
    }

    @Override
    public String toString() {
        return "Tarea{" + "identificadorTarea=" + identificadorTarea + ", descripcionTarea=" + descripcionTarea + ", duracionTarea=" + duracionTarea + ", faseProyecto=" + faseProyecto + ", ingeniero=" + ingeniero + ", fechaInicio=" + fechaInicio + ", estadoTarea=" + estadoTarea + ", RolRequerido=" + RolRequerido + '}';
    }

    
}
