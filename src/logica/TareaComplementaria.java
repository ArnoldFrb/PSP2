package logica;
import java.util.Date;
public class TareaComplementaria extends Tarea{

    public TareaComplementaria() {
    }

    public TareaComplementaria(String descripcionTarea, int duracionTarea, String faseProyecto, String ingeniero, Date fechaInicio, String RolRequerido) {
        super(descripcionTarea, duracionTarea, faseProyecto, ingeniero, fechaInicio, RolRequerido);
    }
    
    @Override
    public String toString() {
        return "Tarea Basico:" + super.toString();
    }

    public String datosParaArchivo(){
        return super.getIdentificadorTarea()+";"+super.getDescripcionTarea()+";"+super.getDuracionTarea()+";"+super.getFaseProyecto()+";"+super.getIngeniero()+";"+super.getFechaInicio()+";"+super.getEstadoTarea()+";"+super.getRolRequerido()+";"+super.getJustificacion()+"\n";
    }
}
