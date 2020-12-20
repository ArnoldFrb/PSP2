
package datos;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import logica.Ingeniero;
import logica.EquipoTrabajo;

public class EquipoTrabajoData implements EquipotrabajoDAO {

    public EquipoTrabajoData() {};

    public String writeFile(EquipoTrabajo equipoTrabajo) throws Exception {
        try {
            File file = new File("psp2_db\\EquiposDeTrabajo.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists())
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
            }
            write.close();
            buffered.close();

            return "Se ha guardado correctamente";
        }
        catch(IOException e)
        {
            return e.toString();
        }
    }
    
    public EquipoTrabajo queryFile(int id) throws Exception {
        EquipoTrabajo equipoTrabajo = new EquipoTrabajo();
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
                    if(Integer.parseInt(listaDatos[0]) == id){
                        equipoTrabajo.setIdEquipoTrabajo(Integer.parseInt(listaDatos[0]));
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
        return equipoTrabajo;
    }
    public ArrayList<Tarea> queryTareasBasicasEquipo(int id) throws Exception {
        ArrayList<Tarea> tareasEquipoTrabajo = new ArrayList();
        try {

            File file = new File("psp2_db\\TareasBasicasEquiposDeTrabajo.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {

                    String[] listaDatos = datos.split(";");

                    if(Integer.parseInt(listaDatos[0]) == id) {
                        Tarea tarea = new TareaBasica();
                        tarea.setIdEquipoTrabajo(Integer.parseInt(listaDatos[0]));
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
        return tareasEquipoTrabajo;
    }
    public ArrayList<Ingeniero> queryIngenierosEquipo(int id) throws Exception {

        ArrayList<Inginero> ingeniero = new ArrayList<Inginero>();

        try {

            File file = new File("psp2_db\\IngenierosEquiposDeTrabajo.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");
                    if(Integer.parseInt(listaDatos[0]) == id){
                        Inginero ingeniero = new Inginero();
                        equipoTrabajo.setIdEquipoTrabajo(Integer.parseInt(listaDatos[0]));
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
        return equipoTrabajo;
    }
}
