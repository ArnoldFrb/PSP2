package logica;
import java.util.ArrayList;
public class EquipoTrabajo{
    private int idEquipoTrabajo;
    private ArrayList<Tarea> tareas;
    private ArrayList<Ingeniero> ingenieros;
    private ArrayList<Tarea> listaTareasPendientes;
    private ArrayList<Tarea> listaTareasEjecutadas;

    public EquipoTrabajo() {
        tareas = new ArrayList<Tarea>();
        ingenieros = new ArrayList<Ingeniero>();
        listaTareasPendientes = new ArrayList<Tarea>();
        listaTareasEjecutadas = new ArrayList<Tarea>();
    }

    public EquipoTrabajo(int identificador, int idEquipoTrabajo, ArrayList<Tarea> tareas, ArrayList<Ingeniero> ingenieros) {
        this.idEquipoTrabajo = idEquipoTrabajo;
        this.tareas = tareas;
        this.ingenieros = ingenieros;
    }

    public int getIdEquipoTrabajo() {
        return idEquipoTrabajo;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public ArrayList<Ingeniero> getIngenieros() {
        return ingenieros;
    }

    public ArrayList<Tarea> getListaTareasPendientes() {
        return listaTareasPendientes;
    }

    public ArrayList<Tarea> getListaTareasEjecutadas() {
        return listaTareasEjecutadas;
    }

    public void setIdEquipoTrabajo(int idEquipoTrabajo) {
        this.idEquipoTrabajo = idEquipoTrabajo;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public void setListaTareasPendientes(ArrayList<Tarea> tareas) {
        this.listaTareasPendientes = tareas;
    }

    public void setListaTareasEjecutadass(ArrayList<Tarea> tareas) {
        this.listaTareasEjecutadas = tareas;
    }

    public void setIngenieros(ArrayList<Ingeniero> ingenieros) {
        this.ingenieros = ingenieros;
    }

    public String datosParaArchivo(){
        return this.idEquipoTrabajo+"\n";
    }
}
