/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author juana
 */
public class Tarea {
    
    private int identificadorTarea;
    private String descripcionTarea;
    private int duracionTarea;
    private String faseProyecto;
    private String ingeniero;
    private Date fechaInicio;
    private String estadoTarea;
    private String RolRequerido;
    private String Justificacion;

    public Tarea() {
    }

    public Tarea(String descripcionTarea, int duracionTarea, String faseProyecto, String ingeniero, Date fechaInicio, String RolRequerido) {
        
        this.identificadorTarea++;
        this.descripcionTarea = descripcionTarea;
        this.duracionTarea = duracionTarea;
        this.faseProyecto = faseProyecto;
        this.ingeniero = ingeniero;
        this.fechaInicio = fechaInicio;
        this.RolRequerido = RolRequerido;
        this.estadoTarea = "pendiente";
        
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

    public String getFaseProyecto() {
        return faseProyecto;
    }

    public void setFaseProyecto(String faseProyecto) {
        this.faseProyecto = faseProyecto;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(String estadoTarea) {
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
        return "Tarea:" + 
        "\nId de Tarea: " + identificadorTarea + 
        "\nDescripcion de Tarea: " + descripcionTarea + 
        "\nDuracion de Tarea: " + duracionTarea + 
        "\nFase de Proyecto: " + faseProyecto + 
        "\nIngeniero: " + ingeniero + 
        "\nFecha de Inicio: " + fechaInicio + 
        "\nEstado de Tarea: " + estadoTarea + 
        "\nRol Requerido: " + RolRequerido + 
        "\nJustificacion: " + Justificacion + '}';
    }

    public String datosParaArchivo(){
        return this.identificadorTarea+";"+this.descripcionTarea+";"+this.duracionTarea+";"+this.faseProyecto+";"+this.ingeniero+";"+this.fechaInicio+";"+this.estadoTarea+";"+this.RolRequerido+";"+this.Justificacion+"\n";
    }
}
