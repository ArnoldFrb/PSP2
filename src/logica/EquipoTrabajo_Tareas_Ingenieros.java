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
public class EquipoTrabajo_Tareas_Ingenieros {
    private int identificador;
    private int identfiacadorEquipoTrabajo;
    private int tareas;
    private int ingenieros;

    public EquipoTrabajo_Tareas_Ingenieros() {
    }

    public EquipoTrabajo_Tareas_Ingenieros(int identificador, int identfiacadorEquipoTrabajo, int tareas, int ingenieros) {
        this.identificador = identificador;
        this.identfiacadorEquipoTrabajo = identfiacadorEquipoTrabajo;
        this.tareas = tareas;
        this.ingenieros = ingenieros;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getIdentfiacadorEquipoTrabajo() {
        return identfiacadorEquipoTrabajo;
    }

    public int getTareas() {
        return tareas;
    }

    public int getIngenieros() {
        return ingenieros;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setIdentfiacadorEquipoTrabajo(int identfiacadorEquipoTrabajo) {
        this.identfiacadorEquipoTrabajo = identfiacadorEquipoTrabajo;
    }

    public void setTareas(int tareas) {
        this.tareas = tareas;
    }

    public void setIngenieros(int ingenieros) {
        this.ingenieros = ingenieros;
    }
}
