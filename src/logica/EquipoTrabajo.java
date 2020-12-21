package logica;
import java.util.ArrayList;
public class EquipoTrabajo{
    private int idEquipoTrabajo;
    private ArrayList<Tarea> tareas;
    private ArrayList<Ingeniero> ingenieros;
    private ArrayList<Tarea> listaTareasNoEjecutadas;
    private ArrayList<Tarea> listaTareasPendientes;
    private ArrayList<Tarea> listaTareasEjecutadas;

    //Constructor vacio de la clase EquipoTrabajo
    public EquipoTrabajo() {
        tareas = new ArrayList<Tarea>();
        ingenieros = new ArrayList<Ingeniero>();
        listaTareasPendientes = new ArrayList<Tarea>();
        listaTareasEjecutadas = new ArrayList<Tarea>();
        listaTareasNoEjecutadas = new ArrayList<Tarea>();
    }

    //Constructor sobrecargado de la clase EquipoTrabajo
    public EquipoTrabajo(int identificador, int idEquipoTrabajo, ArrayList<Tarea> tareas, ArrayList<Ingeniero> ingenieros) {
        this.idEquipoTrabajo = idEquipoTrabajo;
        this.tareas = tareas;
        this.ingenieros = ingenieros;
    }

    //Metodo que recibe una lista de tareas y segun sea su estado
    //  lo almacena en una lista correspondiente
    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;

        for (Tarea tarea : tareas) {
            if(tarea.getEstadoTarea() == "ejecutada")
            {
                listaTareasEjecutadas.add(tarea);
            }
            if(tarea.getEstadoTarea() == "noejecutadas")
            {
                listaTareasNoEjecutadas.add(tarea);
            }
            if(tarea.getEstadoTarea() == "pendientes")
            {
                listaTareasPendientes.add(tarea);
            }
        }
    }

    //Metodo para obtener el id del equipo de trabajo
    public int getIdEquipoTrabajo() {
        return idEquipoTrabajo;
    }

    //Metodo para establecer el id del equipo de trabajo
    public void setIdEquipoTrabajo(int idEquipoTrabajo) {
        this.idEquipoTrabajo = idEquipoTrabajo;
    }

    //Metodo para obtener la lista de tareas
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    //Metodo para obtener la lista de ingenieros
    public ArrayList<Ingeniero> getIngenieros() {
        return ingenieros;
    }

    //Metodo para establecer la lista de ingenieros 
    public void setIngenieros(ArrayList<Ingeniero> ingenieros) {
        this.ingenieros = ingenieros;
    }

    //Metodo para obtener la lista de tareas no ejecutadas
    public ArrayList<Tarea> getListaTareasNoEjecutadas() {
        return listaTareasNoEjecutadas;
    }

    //Metodo para establecer la lista de tareas no ejecutadas
    public void setListaTareasNoEjecutadas(ArrayList<Tarea> listaTareasNoEjecutadas) {
        this.listaTareasNoEjecutadas = listaTareasNoEjecutadas;
    }

    //Metodo para obtener la lista de tareas pendientes
    public ArrayList<Tarea> getListaTareasPendientes() {
        return listaTareasPendientes;
    }

    //Metodo para establecer la lista de tareas pendientes
    public void setListaTareasPendientes(ArrayList<Tarea> listaTareasPendientes) {
        this.listaTareasPendientes = listaTareasPendientes;
    }

    //Metodo para obtener la lista de tareas ejecutadas
    public ArrayList<Tarea> getListaTareasEjecutadas() {
        return listaTareasEjecutadas;
    }

    //Metodo para establecer la lista de tareas ejecutadas
    public void setListaTareasEjecutadas(ArrayList<Tarea> listaTareasEjecutadas) {
        this.listaTareasEjecutadas = listaTareasEjecutadas;
    }

    //Metodo que retorna en un string las propiedades de la clase.
    @Override
    public String toString() {
        return "Proyecto{" + "idEquipoTrabajo=" + idEquipoTrabajo + "}";
    }
}
