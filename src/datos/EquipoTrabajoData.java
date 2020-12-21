
package datos;
import java.io.*;
import java.util.ArrayList;
import logica.Ingeniero;
import logica.EquipoTrabajo;
import DAO.*;
import java.util.List;
import java.util.Scanner;

public class EquipoTrabajoData implements EquipoTrabajoDAO {

    private File file;

    public EquipoTrabajoData() {
        file = new File("psp2_db\\Ingenieros.txt");
    }
    
    @Override
    public String writeFile(EquipoTrabajo equipoTrabajo) throws Exception 
    {
        
        String res = "";
        boolean flag = false;
        
        try {
            
            FileWriter write;

            if(file.exists())
            {
                write = new FileWriter(file, true);
                write.write(equipoTrabajo.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                write.write(equipoTrabajo.datosParaArchivo());
                
                res = "Se añadio un registro";
                flag = true;
            }

            write.close();
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? res : null; 
    }
    
    @Override
    public EquipoTrabajo queryFile(int queryData) throws Exception {

        EquipoTrabajo equipoTrabajo = new EquipoTrabajo();
        boolean flag = false;

        try {
            
            if(file.exists()) {

                Scanner readScan = new Scanner(file);
                String datos;

                while(readScan.hasNext()) {
                    
                    datos = readScan.nextLine();
                    String[] listaDatos = datos.split(";");

                    if(Integer.parseInt(listaDatos[0]) == queryData){

                        equipoTrabajo.setIdEquipoTrabajo(Integer.parseInt(listaDatos[0]));

                        flag = true;
                    }
                }
                
                readScan.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }

        return flag ? equipoTrabajo : null;
    }

    @Override
    public List<Ingeniero> queryIngenierosEquipo(int queryData) throws Exception {

        List<Ingeniero> listaIngeniero = new ArrayList();
        boolean flag = false;

        try {

            File file = new File("psp2_db\\IngenierosEquiposDeTrabajo.txt");
            FileReader read;
            
            if(file.exists()) {

                Scanner readScan = new Scanner(file);
                String datos;
                
                while(readScan.hasNext()) {
                    
                    datos = readScan.nextLine();
                    String[] listaDatos = datos.split(";");

                    if(Integer.parseInt(listaDatos[0]) == queryData){

                        Ingeniero ingeniero = new Ingeniero();
                        listaIngeniero.add(ingeniero);

                        flag = false;
                    }

                }

                readScan.close();
            }

        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? listaIngeniero : null;
    }
}
