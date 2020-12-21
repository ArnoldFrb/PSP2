
package datos;
import java.io.*;
import java.util.ArrayList;
import logica.Ingeniero;
import logica.EquipoTrabajo;
import DAO.*;
import java.util.List;

public class EquipoTrabajoData implements EquipoTrabajoDAO {

    public EquipoTrabajoData() {};

    public String writeFile(EquipoTrabajo equipoTrabajo) throws Exception 
    {
        
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
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                
                res = "Se añadio un registro";
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
        
        return flag ? res : null; 
    }
    
    public EquipoTrabajo queryFile(int queryData) throws Exception {
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
                    if(Integer.parseInt(listaDatos[0]) == queryData){
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

    @Override
    public List<Ingeniero> queryIngenierosEquipo(int queryData) throws Exception {

        List<Ingeniero> listaIngeniero = new ArrayList();

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
                    if(Integer.parseInt(listaDatos[0]) == queryData){
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
