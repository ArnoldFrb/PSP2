package datos;

import DAO.TareaDAO;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logica.Tarea;

public class TareasData implements TareaDAO {
    
    private File file;

    public TareasData() {
        file = new File("psp2_db\\Tareas.txt");
    }

    @Override
    public String writeFile(Tarea tarea) throws Exception
    {
        String res = "";
        boolean flag = false;
        
        try
        {
            FileWriter write;
            
            if(file.exists())
            {
                write = new FileWriter(file, true);
                write.write(tarea.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                write.write(tarea.datosParaArchivo());
                
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
    public List<Tarea> readFile() throws Exception
    {
        List<Tarea> list = new ArrayList();
        boolean flag = false;
        try
        {
            if(file.exists())
            {
                Scanner readScan = new Scanner(file);
                String datos;
                
                while(readScan.hasNext()) {
                    datos = readScan.nextLine();

                    String[] listDatos = datos.split(";");
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
                
                readScan.close();
            }
            else
            {
                System.out.println("No hay datos");
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }

        return flag ? list : null;
    }
    
    @Override
    public Tarea queryFile(int queryData) throws Exception
    {
        Tarea tarea = new Tarea();
        boolean flag = false;
        
        try
        {
            if(file.exists())
            {
                
                Scanner readScan = new Scanner(file);
                String datos;

                while(readScan.hasNext()) 
                {
                    datos = readScan.nextLine();
                    String[] listDatos = datos.split(";");

                    if(Integer.parseInt(listDatos[0]) == queryData)
                    {
                        tarea.setDescripcionTarea(listDatos[0]);
                        tarea.setDuracionTarea(Integer.parseInt(listDatos[1]));
                        tarea.setFaseProyecto(listDatos[2]);
                        tarea.setIngeniero(listDatos[3]);
                        tarea.setFechaInicio(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[4]));
                        tarea.setRolRequerido(listDatos[5]);
                        tarea.setEstadoTarea(listDatos[6]);
                        
                        flag = true;
                    }
                }
                
                readScan.close();
            }
            else
            {
                System.out.println("No hay datos");
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? tarea : null;
    }
}
