/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class ListaGlobalIngenieros implements InterfaceAñadirIngenieros{

    private ArrayList<Ingeniero> listaIngeniero;

    public ListaGlobalIngenieros() {
        
        listaIngeniero =  new ArrayList<>();
    }
    
    public ArrayList<Ingeniero> getListaIngeniero() {
        return listaIngeniero;
    }

    public void setListaIngeniero(ArrayList<Ingeniero> listaIngeniero) {
        this.listaIngeniero = listaIngeniero;
    }
    
    public void crearIngeniero()
    {
        Scanner Lector = new Scanner(System.in);
        System.out.println("Registrar ingeniero");
        System.out.println("Digite la identificacion : ");
        String identificacion = Lector.nextLine();
        System.out.println("Digite el nombre : ");
        String nombre = Lector.nextLine();
        System.out.println("Digite el apellido : ");
        String apellido = Lector.nextLine();
        System.out.println("Digite la edad del ingeniero : ");
        int edad = Lector.nextInt();
        System.out.println("Digite los años de experiencia del ingeniero : ");
        int añosExperiencia = Lector.nextInt();
        Lector.nextLine();
        System.out.println("Digite la especilidad del ingeniero : ");
        EspecialidadIngeniero especilidad = leerEspecialidadIngeniero(Lector.nextLine());
        
        Ingeniero ingeniero = new Ingeniero(identificacion, nombre, apellido, edad, añosExperiencia, especilidad);
        
        añadirIngeniero(ingeniero);
    }
    
   
    
    public EspecialidadIngeniero leerEspecialidadIngeniero(String especialidad)
    {
          switch(especialidad.toLowerCase())
         {
            case "analista": return EspecialidadIngeniero.analista;
            case "arquitecto": return EspecialidadIngeniero.arquitecto;
            case "diseñador": return EspecialidadIngeniero.diseñador;
            case "documentador": return EspecialidadIngeniero.documentador;
            case "programador": return EspecialidadIngeniero.programador;
            case "tester": return EspecialidadIngeniero.tester;
            default:System.out.println("No se ha encontrado una fase con ese nombre");
         }
        return null;
    }
    @Override
    public void añadirIngeniero(Ingeniero ingeniero) {
        listaIngeniero.add(ingeniero);
    }
    
}
