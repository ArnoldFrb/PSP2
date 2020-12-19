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
public class IngenierosLogica {
    public int identificacion;
    public String nombre;
    public String apellido;
    public int edad;
    public int añosExperiencia;
    public String especialidad;
    
    public IngenierosLogica()
    {
        
    }

    public IngenierosLogica(int identificacion, String nombre, String apellido, int edad, int añosExperiencia, String especialidad) 
    {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.añosExperiencia = añosExperiencia;
        this.especialidad = especialidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString() {
        return "Ingeniero:" + "\nIdentificacion: " + identificacion + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nAnios de Experiencia: " + añosExperiencia + "\nEspecialidad: " + especialidad;
    }
    
    
    public String datosParaArchivo(){
        return this.identificacion+";"+this.nombre+";"+this.apellido+";"+this.edad+";"+this.añosExperiencia+";"+this.especialidad+"\n";
    }
}
