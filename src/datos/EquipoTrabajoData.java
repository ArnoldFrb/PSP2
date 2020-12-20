
package datos;
import java.io.*;
import java.util.ArrayList;
import logica.Ingeniero;
import logica.EquipoTrabajo;
import DAO.*;

public class EquipoTrabajoData implements EquipoTrabajoDAO {

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

    public ArrayList<Ingeniero> queryIngenierosEquipo(int id) throws Exception {

        ArrayList<Ingeniero> listaIngeniero = new ArrayList<Ingeniero>();

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
                        Ingeniero ingeniero = new Ingeniero();

                        listaIngeniero.add(ingeniero);
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
        return listaIngeniero;
    }
}
