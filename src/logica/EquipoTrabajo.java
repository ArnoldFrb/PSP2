package logica;
import java.util.ArrayList;
public class EquipoTrabajo{
    private int idEquipoTrabajo;
    private ArrayList<Tarea> tareas;
    private ArrayList<Ingeniero> ingenieros;
    private ArrayList<Tarea> listaTareasNoEjecutadas;
    private ArrayList<Tarea> listaTareasPendientes;
    private ArrayList<Tarea> listaTareasEjecutadas;

    public EquipoTrabajo() {
        tareas = new ArrayList<Tarea>();
        ingenieros = new ArrayList<Ingeniero>();
        listaTareasPendientes = new ArrayList<Tarea>();
        listaTareasEjecutadas = new ArrayList<Tarea>();
        listaTareasNoEjecutadas = new ArrayList<Tarea>();
    }

    public EquipoTrabajo(int identificador, int idEquipoTrabajo, ArrayList<Tarea> tareas, ArrayList<Ingeniero> ingenieros) {
        this.idEquipoTrabajo = idEquipoTrabajo;
        this.tareas = tareas;
        this.ingenieros = ingenieros;
    }

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

    public int getIdEquipoTrabajo() {
        return idEquipoTrabajo;
    }

    public void setIdEquipoTrabajo(int idEquipoTrabajo) {
        this.idEquipoTrabajo = idEquipoTrabajo;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public ArrayList<Ingeniero> getIngenieros() {
        return ingenieros;
    }

    public void setIngenieros(ArrayList<Ingeniero> ingenieros) {
        this.ingenieros = ingenieros;
    }

    public ArrayList<Tarea> getListaTareasNoEjecutadas() {
        return listaTareasNoEjecutadas;
    }

    public void setListaTareasNoEjecutadas(ArrayList<Tarea> listaTareasNoEjecutadas) {
        this.listaTareasNoEjecutadas = listaTareasNoEjecutadas;
    }

    public ArrayList<Tarea> getListaTareasPendientes() {
        return listaTareasPendientes;
    }

    public void setListaTareasPendientes(ArrayList<Tarea> listaTareasPendientes) {
        this.listaTareasPendientes = listaTareasPendientes;
    }

    public ArrayList<Tarea> getListaTareasEjecutadas() {
        return listaTareasEjecutadas;
    }

    public void setListaTareasEjecutadas(ArrayList<Tarea> listaTareasEjecutadas) {
        this.listaTareasEjecutadas = listaTareasEjecutadas;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idEquipoTrabajo=" + idEquipoTrabajo + "}";
    }
}
