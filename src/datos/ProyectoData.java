package datos;

import DAO.ProyectoDAO;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import logica.Proyecto;
public class ProyectoData implements ProyectoDAO{
    public String writeFile(Proyecto proyecto) throws Exception {
        try {
            File file = new File("psp2_db\\Proyecto.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists()) {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                buffered.write(proyecto.datosParaArchivo());
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write(proyecto.datosParaArchivo());
            }
            write.close();
            buffered.close();
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        return "Todo melo";
    }
    
    public List<Proyecto> readFile() throws Exception
    {
        List<Proyecto> list = new ArrayList();
        boolean flag = false;
        try
        {
            File file = new File("psp2_db\\Ingenieros.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists())
            {
                read = new FileReader(file);
                buffered = new BufferedReader(read);
                
                String datos;
                while((datos = buffered.readLine()) != null)
                {
                    String[] listDatos = datos.split(";");
                    Proyecto proyecto = new Proyecto();
                    
                    proyecto.setDescripcionTarea(listDatos[0]);
                    proyecto.setDuracionTarea(Integer.parseInt(listDatos[1]));
                    proyecto.setFaseProyecto(listDatos[2]);
                    proyecto.setIngeniero(listDatos[3]);
                    proyecto.setFechaInicio(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[4]));
                    proyecto.setRolRequerido(listDatos[5]);
                    proyecto.setEstadoTarea(listDatos[6]);
                    list.add(proyecto);
                }
                read.close();
                buffered.close();
                flag = true;
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
    
    public Proyecto queryFile(int queryData) throws Exception
    {
        Proyecto proyecto = new Proyecto();
        boolean flag = false;
        
        try
        {
            File file = new File("psp2_db\\Ingenieros.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists())
            {
                read = new FileReader(file);
                buffered = new BufferedReader(read);
                
                String datos;
                while((datos = buffered.readLine()) != null)
                {
                    String[] listDatos = datos.split(";");
                    if(queryData == Integer.parseInt(listDatos[0]))
                    {
                        proyecto.setDescripcionTarea(listDatos[0]);
                        proyecto.setDuracionTarea(Integer.parseInt(listDatos[1]));
                        proyecto.setFaseProyecto(listDatos[2]);
                        proyecto.setIngeniero(listDatos[3]);
                        proyecto.setFechaInicio(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[4]));
                        proyecto.setRolRequerido(listDatos[5]);
                        proyecto.setEstadoTarea(listDatos[6]);
                        
                        flag = true;
                    }
                }
                read.close();
                buffered.close();
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
        return flag ? proyecto : null;
    }

}
