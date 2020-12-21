package datos;

import DAO.ProyectoDAO;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import logica.Proyecto;
import logica.Tarea;
import logica.EquipoTrabajo;

public class ProyectoData implements ProyectoDAO{
    
    public String writeFile(Proyecto proyecto) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {
            File file = new File("psp2_db\\Proyecto.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists()) {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                buffered.write(proyecto.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write(proyecto.datosParaArchivo());
                
                res = "Se añadio un registro";
                flag = true;
            }
            write.close();
            buffered.close();
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? res : null;
    }

    public String writeFileTarea(Proyecto proyecto) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {
            File file = new File("psp2_db\\TareaProyecto.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists()) {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                buffered.write(proyecto.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                for (Tarea tarea : proyecto.getListaTareas()) {
                    String var = proyecto.getNombreProyecto()+";"+tarea.datosParaArchivo()+"\n";
                    buffered.write(var);
                }
                res = "Se añadio un registro";
                flag = true;
            }
            write.close();
            buffered.close();
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? res : null;
    }
    
    public String writeFileEquipo(Proyecto proyecto) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {
            File file = new File("psp2_db\\TareaProyecto.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists()) {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                buffered.write(proyecto.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                for (EquipoTrabajo equipo : proyecto.getListaEquipoTrabajo()) {
                    String var = proyecto.getNombreProyecto()+";"+equipo.datosParaArchivo()+"\n";
                    buffered.write(var);
                }
                res = "Se añadio un registro";
                flag = true;
            }
            write.close();
            buffered.close();
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? res : null;
    }

    public List<Proyecto> readFile() throws Exception {
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
                    
                    proyecto.setNombreProyecto(listDatos[0]);
                    proyecto.setDuracionProyecto(Integer.parseInt(listDatos[1]));
                    proyecto.setFechaInicio(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[2]));
                    proyecto.setFechaEntrega(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[3]));
                    proyecto.setFechaFin(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[4]));
                    proyecto.setEstado(listDatos[5]);
                    
                    list.add(proyecto);
                    
                    flag = true;
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
                        proyecto.setNombreProyecto(listDatos[0]);
                        proyecto.setDuracionProyecto(Integer.parseInt(listDatos[1]));
                        proyecto.setFechaInicio(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[2]));
                        proyecto.setFechaEntrega(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[3]));
                        proyecto.setFechaFin(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[4]));
                        proyecto.setEstado(listDatos[5]);
                    
                        
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
