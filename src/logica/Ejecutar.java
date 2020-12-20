/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */

    static Proyecto proyecto;
    static Scanner lectorProyecto = new Scanner(System.in);
    static ListaGlobalIngenieros listaGlobaIngeniero = new ListaGlobalIngenieros();
    static EquipoTrabajo equipoTrabajo;

    public static void main(String[] args) {

        menu();

    }

    public static Date leerFecha(String fecha) {
        return new Date(fecha);
    }

    public static void menu() {

        String n = "S";
        System.out.println("Bienvenido a Proyesoft");
        System.out.println("Opciones: \n 1. Crear proyecto \n 2.Crear equipo de trabajo \n 3.Crear ingenieros"
                + " \n4.Consultar ingenieros \n5.Crear tareas \n 6.Salir");

        do {

            int opcion = lectorProyecto.nextInt();
            switch (opcion) {
                case 1:
                    proyecto = crearProyecto();
                    System.out.println(proyecto.toString());
                case 2:
                    crearEquipoTrabajo();
                    break;
                case 3:
                    crearIngeniero();
                    break;
                case 4:
                    consultarIngenieros();
                    break;
                case 5:
                    crearTareas();
                    break;
                case 6:
                    n = "N";
                    break;
                default:
                    System.out.println("No ha introducido un numero disponible en las opciones");
            }
            System.out.println("Opciones: \n 1.Crear proyecto \n 2.Crear equipo de trabajo \n 3.Crear ingenieros "
                    + "\n4.Consultar ingenieros \n5.Crear tareas \n 6.Salir");
        } while (n == "S");

    }

    public static Proyecto crearProyecto() {

        System.out.println("Crear proyecto");
        System.out.println("Digite el nombre del proyecto: ");
        String nombreProyecto = lectorProyecto.nextLine();
        lectorProyecto.nextLine();
        System.out.println("Digite la duracion del proyecto: ");
        int duracionProyecto = lectorProyecto.nextInt();
        lectorProyecto.nextLine();
        System.out.println("Digite la fecha del proyecto: ");
        Date fechaInicio = leerFecha(lectorProyecto.next());

        System.out.println("El proyecto ha sido creado con exito");

        return new Proyecto(nombreProyecto, duracionProyecto, fechaInicio);

    }

    public static void crearIngeniero() {
        listaGlobaIngeniero.crearIngeniero();
    }

    public static void crearEquipoTrabajo() {
        equipoTrabajo = new EquipoTrabajo();
        System.out.println("Añada ingenieros al equipo de trabajo: ");
        System.out.println("Digite la identificacion del ingeniero que quiere agregar: ");
        lectorProyecto.nextLine();
        String idIngeniero = lectorProyecto.nextLine();
        for (Ingeniero ingeniero : listaGlobaIngeniero.getListaIngeniero()) {
            if (ingeniero.getIdentificacionIngeniero().equals(idIngeniero)) {
                equipoTrabajo.añadirIngeniero(ingeniero);
                System.out.println("Se encontro");
            }
        }

    }

    public static void consultarIngenieros() {
        for (Ingeniero ingeniero : listaGlobaIngeniero.getListaIngeniero()) {

            System.out.println(ingeniero.toString());
        }
    }

    public static void crearTareas() {
        try {
            proyecto.crearTarea(equipoTrabajo);
        } catch (Exception e) {

            System.out.println("No existe proyecto o equipo trabajo" + e.getMessage());
        }
    }

}
