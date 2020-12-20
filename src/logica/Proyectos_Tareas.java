/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author arnol
 */
public class Proyectos_Tareas {
    private int identificador;
    private int proyecto;
    private int tareas;

    public Proyectos_Tareas() {
    }

    public Proyectos_Tareas(int identificador, int proyecto, int tareas) {
        this.identificador = identificador;
        this.proyecto = proyecto;
        this.tareas = tareas;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getProyecto() {
        return proyecto;
    }

    public int getTareas() {
        return tareas;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public void setTareas(int tareas) {
        this.tareas = tareas;
    }
    
    
}
