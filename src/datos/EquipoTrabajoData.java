
package datos;
import DAO.EquipoTrabajoDAO;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import logica.Ingeniero;
import logica.EquipoTrabajo;
import logica.Tarea;
import logica.TareaBasico;

public class EquipoTrabajoData implements EquipoTrabajoDAO {

    public EquipoTrabajoData() {};

    public String writeFile(EquipoTrabajo equipoTrabajo) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {
            File file = new File("psp2_db\\EquiposDeTrabajo.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists())
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                
                res = "Se ha insertado el nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                
                res = "Se ha insertado el registro";
                flag = true;
            }
            write.close();
            buffered.close();

            return "Se ha guardado correctamente";
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? res : "Error al insertar registros";
    }
    
    public EquipoTrabajo queryFile(int queryData) throws Exception {
        
        EquipoTrabajo equipoTrabajo = new EquipoTrabajo();
        boolean flag = false;
        
        try {
            File file = new File("psp2_db\\EquiposDeTrabajo.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");
                    if(Integer.parseInt(listaDatos[0]) == queryData){
                        equipoTrabajo.setIdEquipoTrabajo(Integer.parseInt(listaDatos[0]));
                        
                        flag = true;
                    }
            }
                read.close();
                buffered.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        return flag ? equipoTrabajo : null;
    }
    public List<Tarea> queryTareasBasicasEquipo(int queryData) throws Exception {
        
        List<Tarea> list = new ArrayList();
        boolean flag = false;
        
        try {

            File file = new File("psp2_db\\TareasBasicasEquiposDeTrabajo.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {

                    String[] listDatos = datos.split(";");

                    if(Integer.parseInt(listDatos[0]) == queryData) {
                        Tarea tarea = new Tarea();
                    
                        tarea.setDescripcionTarea(listDatos[0]);
                        tarea.setDuracionTarea(Integer.parseInt(listDatos[1]));
                        tarea.setFaseProyecto(listDatos[2]);
                        tarea.setIngeniero(listDatos[3]);
                        tarea.setFechaInicio(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[4]));
                        tarea.setRolRequerido(listDatos[5]);
                        tarea.setEstadoTarea(listDatos[6]);
                        list.add(tarea);
                        
                        flag = true;
                    }
            }
                read.close();
                buffered.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        return flag ? list : null;
    }
    
    public List<Ingeniero> queryIngenierosEquipo(int queryData) throws Exception {

        List<Ingeniero> list = new ArrayList();
        boolean flag = false;
        
        try {

            File file = new File("psp2_db\\IngenierosEquiposDeTrabajo.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    
                    String[] listDatos = datos.split(";");
                    
                    if(Integer.parseInt(listDatos[0]) == queryData){
                        Ingeniero ing = new Ingeniero();
                        
                        ing.setIdentificacionIngeniero(listDatos[0]);
                        ing.setNombreIngeniero(listDatos[1]);
                        ing.setApellidoIngeniero(listDatos[2]);
                        ing.setEdadIngeniero(Integer.parseInt(listDatos[3]));
                        ing.setEspecailidadIngeniero(listDatos[4]);
                        ing.setAñosExperiencia(Integer.parseInt(listDatos[4]));
                        list.add(ing);
                        
                        flag = true;
                    }
                }
                
                read.close();
                buffered.close();
            }

        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        return flag ? list : null;
    }
}
