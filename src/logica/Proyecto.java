/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Proyecto {
    
    private String nombreProyecto;
    private ArrayList<Tarea> listaTareas;
    private int duracionProyecto;
    private Date fechaInicio;
    private Date fechaEntrega;
    private Date fechaFinalEntrega;
    private String Estado;

    public Proyecto(String nombreProyecto, int duracionProyecto, Date fechaInicio) {
        this.nombreProyecto = nombreProyecto;
        this.duracionProyecto = duracionProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = calcularFechaEntrega();
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public int getDuracionProyecto() {
        return duracionProyecto;
    }

    public void setDuracionProyecto(int duracionProyecto) {
        this.duracionProyecto = duracionProyecto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaFinalEntrega() {
        return fechaFinalEntrega;
    }

    public void setFechaFinalEntrega(Date fechaFinalEntrega) {
        this.fechaFinalEntrega = fechaFinalEntrega;
    }


    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
     public Date calcularFechaEntrega(){	
      Calendar calendar = Calendar.getInstance();	
      calendar.setTime(this.fechaInicio); 	
      calendar.add(Calendar.DAY_OF_YEAR, this.duracionProyecto);  
      return calendar.getTime(); 	
    }
     
     public void crearTarea(EquipoTrabajo equipoTrabajo)
     {
         Scanner lector = new Scanner(System.in);
         System.out.println("Digite el tipo de tarea a crear");
         String tipoTarea = lector.nextLine();
         switch(tipoTarea)
         {
             case "basica": 
                   System.out.println("Digite la descripcion de la tarea");
                   String descripcion = lector.nextLine();
                   System.out.println("Digite la duracion de la tarea");
                   int duracion =  lector.nextInt();
                   System.out.println("Digite la fase de proyecto");
                   FaseProyecto faseProyecto = leerFaseProyecto(lector.nextLine());
                   System.out.println("Digite la identificacion del ingeniero");
                   String identificacion = lector.nextLine();
                   Ingeniero ingeniero = BuscarIngeniero(equipoTrabajo, identificacion);
                   System.out.println("Digite la fecha de inicio");
                   /*
                   Mes/dia/año
                   */
                   
                   Date fechaInicio = LeerFecha(lector.nextLine());
                   System.out.println("Digite la fecha de entrega");
                   /*
                   Mes/dia/año
                   */
                   
                   Date fechaEntrega = LeerFecha(lector.nextLine());
                   System.out.println("Digite el rol requerido del ingeniero");
                   String rolRequerido = lector.nextLine();
                   
                   Tarea tarea = new TareaBasico(fechaEntrega,descripcion, duracion, faseProyecto, ingeniero, fechaInicio, rolRequerido);
                   añadirTarea(tarea);
                 break;
             case "complementaria":
                 System.out.println("Digite la descripcion de la tarea");
                   String descripcionC = lector.nextLine();
                   System.out.println("Digite la duracion de la tarea");
                   int duracionC =  lector.nextInt();
                   System.out.println("Digite la fase de proyecto");
                   FaseProyecto faseProyectoC = leerFaseProyecto(lector.nextLine());
                   System.out.println("Digite la identificacion del ingeniero");
                   String identificacionC = lector.nextLine();
                   Ingeniero ingenieroC = BuscarIngeniero(equipoTrabajo, identificacionC);
                   System.out.println("Digite la fecha de inicio");
                   /*
                   Mes/dia/año
                   */
                   
                   Date fechaInicioC = LeerFecha(lector.nextLine());
                   System.out.println("Digite el rol requerido del ingeniero");
                   String rolRequeridoC = lector.nextLine();
                   
                   Tarea tareaC = new TareaComplementaria(descripcionC, duracionC, faseProyectoC, ingenieroC, fechaInicioC, rolRequeridoC);
                   
                   añadirTarea(tareaC);
                 break;
             default: System.out.println("No se encontro el tipo de tarea a crear");
         }
     }    
     public void añadirTarea(Tarea tarea)
     {
         listaTareas.add(tarea);
     }
     
     public FaseProyecto leerFaseProyecto(String faseProyecto)
     {
         
         switch(faseProyecto.toLowerCase())
         {
            case "analisis": return FaseProyecto.analisis;
            case "diseño": return FaseProyecto.diseño;
            case "implementacion": return FaseProyecto.implementacion;
            case "despliegue": return FaseProyecto.despliegue;
            case "mantenimiento": return FaseProyecto.mantenimiento;
            default:System.out.println("No se ha encontrado una fase con ese nombre");
         }
        return null;
     }
     
     public Ingeniero BuscarIngeniero(EquipoTrabajo equipoTrabajo,String identificacion)
     {
         for (Ingeniero ingeniero : equipoTrabajo.getListaIngenieros()) {
             if(ingeniero.getIdentificacionIngeniero().equalsIgnoreCase(identificacion))
             {
                 return ingeniero;
             }
         }
         return null;
     }
     
     public Date LeerFecha(String fecha)
     {
         return new Date(fecha);
     }

    @Override
    public String toString() {
        return "Proyecto{" + "nombreProyecto=" + nombreProyecto + ", listaTareas=" + listaTareas + ", duracionProyecto=" + duracionProyecto + ", fechaInicio=" + fechaInicio + ", fechaEntrega=" + fechaEntrega + '}';
    }
    
     
}


