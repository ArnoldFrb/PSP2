package logica;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Proyecto {

    private String nombreProyecto;
    private ArrayList<Tarea> listaTareas;
    private ArrayList<EquipoTrabajo> listaEquipoTrabajo;
    private int duracionProyecto;
    private Date fechaInicio;
    private Date fechaEntrega;
    private Date fechaFin;
    private String Estado;

    public Proyecto() {

    }

    public Proyecto(String nombreProyecto, int duracionProyecto, Date fechaInicio) {
        this.nombreProyecto = nombreProyecto;
        this.duracionProyecto = duracionProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = calcularFechaEntrega();
    }

    public Date calcularFechaEntrega() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.fechaInicio);
        calendar.add(Calendar.DAY_OF_YEAR, this.duracionProyecto);
        return calendar.getTime();
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

    public ArrayList<EquipoTrabajo> getListaEquipoTrabajo() {
        return listaEquipoTrabajo;
    }

    public void setListaEquipoTrabajo(ArrayList<EquipoTrabajo> listaEquipoTrabajo) {
        this.listaEquipoTrabajo = listaEquipoTrabajo;
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

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombreProyecto=" + nombreProyecto + ", listaTareas=" + listaTareas + ", duracionProyecto="
                + duracionProyecto + ", fechaInicio=" + fechaInicio + ", fechaEntrega=" + fechaEntrega + '}';
    }

}
