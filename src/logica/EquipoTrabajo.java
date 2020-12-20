package logica;
import java.util.ArrayList;
public class EquipoTrabajo{
    private int identificador;
    private int identfiacadorEquipoTrabajo;
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

    public EquipoTrabajo(int identificador, int identfiacadorEquipoTrabajo, ArrayList<Tarea> tareas, ArrayList<Ingeniero> ingenieros) {
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

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setIdentfiacadorEquipoTrabajo(int identfiacadorEquipoTrabajo) {
        this.identfiacadorEquipoTrabajo = identfiacadorEquipoTrabajo;
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
}
