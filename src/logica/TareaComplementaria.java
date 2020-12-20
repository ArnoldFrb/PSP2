package logica;
import java.util.Date;
public class TareaComplementaria extends Tarea{

    public TareaComplementaria() {
    }

    public TareaComplementaria(String descripcionTarea, int duracionTarea, String faseProyecto, String ingeniero, Date fechaInicio, String RolRequerido) {
        super(descripcionTarea, duracionTarea, faseProyecto, ingeniero, fechaInicio, RolRequerido);
    }

}
