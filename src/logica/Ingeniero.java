/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juana
 */
public class Ingeniero {

    private String identificacionIngeniero;
    private String nombreIngeniero;
    private String apellidoIngeniero;
    private int edadIngeniero;
    private int añosExperiencia;
    private String especailidadIngeniero;

    public Ingeniero() {
    }

    public Ingeniero(String identificacionIngeniero, String nombreIngeniero, String apellidoIngeniero, int edadIngeniero, int añosExperiencia, String especailidadIngeniero) {
        this.identificacionIngeniero = identificacionIngeniero;
        this.nombreIngeniero = nombreIngeniero;
        this.apellidoIngeniero = apellidoIngeniero;
        this.edadIngeniero = edadIngeniero;
        this.añosExperiencia = añosExperiencia;
        this.especailidadIngeniero = especailidadIngeniero;
    }

    public String getIdentificacionIngeniero() {
        return identificacionIngeniero;
    }

    public void setIdentificacionIngeniero(String identificacionIngeniero) {
        this.identificacionIngeniero = identificacionIngeniero;
    }

    public String getNombreIngeniero() {
        return nombreIngeniero;
    }

    public void setNombreIngeniero(String nombreIngeniero) {
        this.nombreIngeniero = nombreIngeniero;
    }

    public String getApellidoIngeniero() {
        return apellidoIngeniero;
    }

    public void setApellidoIngeniero(String apellidoIngeniero) {
        this.apellidoIngeniero = apellidoIngeniero;
    }

    public int getEdadIngeniero() {
        return edadIngeniero;
    }

    public void setEdadIngeniero(int edadIngeniero) {
        this.edadIngeniero = edadIngeniero;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getEspecailidadIngeniero() {
        return especailidadIngeniero;
    }

    public void setEspecailidadIngeniero(String especailidadIngeniero) {
        this.especailidadIngeniero = especailidadIngeniero;
    }

    @Override
    public String toString() {
        return "Ingeniero:" + 
                "\nIdentificacion de Ingeniero: " + identificacionIngeniero + 
                "\nNombre de Ingeniero: " + nombreIngeniero + 
                "\nApellido de Ingeniero: " + apellidoIngeniero + 
                "\nEdad de Ingeniero: " + edadIngeniero + 
                "\na\u00f1os de Experiencia: " + añosExperiencia + 
                "\nEspecailidad de Ingeniero: " + especailidadIngeniero + '}';
    }

    public String datosParaArchivo(){
        return this.identificacionIngeniero+";"+this.nombreIngeniero+";"+this.apellidoIngeniero+";"+this.edadIngeniero+";"+this.añosExperiencia+";"+this.especailidadIngeniero+"\n";
    }
}
