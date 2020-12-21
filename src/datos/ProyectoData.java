package datos;

import DAO.ProyectoDAO;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logica.Proyecto;
import logica.Tarea;
import logica.EquipoTrabajo;

public class ProyectoData implements ProyectoDAO{
    
    private File file;

    public ProyectoData() {
        file = new File("psp2_db\\Proyectos.txt");
    }

    @Override
    public String writeFile(Proyecto proyecto) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {
            
            FileWriter write;

            if(file.exists()) {
                write = new FileWriter(file, true);
                write.write(proyecto.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                write.write(proyecto.datosParaArchivo());
                
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
    public String writeFileTarea(Proyecto proyecto) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {
            
            File fileOther = new File("psp2_db\\TareaProyecto.txt");
            FileWriter write;

            if(file.exists()) {

                write = new FileWriter(fileOther, true);
                write.write(proyecto.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(fileOther, true);

                for (Tarea tarea : proyecto.getListaTareas()) {

                    String var = proyecto.getNombreProyecto()+";"+tarea.datosParaArchivo()+"\n";
                    write.write(var);
                }
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
    public String writeFileEquipo(Proyecto proyecto) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {

            File fileOther = new File("psp2_db\\TareaProyecto.txt");
            FileWriter write;
            
            if(file.exists()) {

                write = new FileWriter(fileOther, true);
                write.write(proyecto.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(fileOther, true);
                
                for (EquipoTrabajo equipo : proyecto.getListaEquipoTrabajo()) {

                    String var = proyecto.getNombreProyecto()+";"+equipo.datosParaArchivo()+"\n";
                    write.write(var);
                }
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
    public List<Proyecto> readFile() throws Exception {
        List<Proyecto> list = new ArrayList();
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
    public Proyecto queryFile(int queryData) throws Exception
    {
        Proyecto proyecto = new Proyecto();
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
        return flag ? proyecto : null;
    }

}
