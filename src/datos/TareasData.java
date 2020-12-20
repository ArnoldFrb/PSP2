/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import logica.Tarea;

/**
 *
 * @author arnol
 */
public class TareasData {
    public static void WriteFile(Tarea tarea) throws Exception
    {
        try
        {
            File file = new File("psp2_db\\Ingenieros.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists())
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                buffered.write(tarea.datosParaArchivo());
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write(tarea.datosParaArchivo());
            }
            write.close();
            buffered.close();
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
    }
    
    public List<Tarea> readFile() throws Exception
    {
        List<Tarea> list = new ArrayList();
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
                    Tarea tarea = new Tarea();
                    tarea.setDescripcionTarea(listDatos[0]);
                    tarea.setDuracionTarea(Integer.parseInt(listDatos[1]));
                    tarea.setFaseProyecto(listDatos[2]);
                    tarea.setIngeniero(listDatos[3]);
                    tarea.setFechaInicio(new SimpleDateFormat("dd/MM/yyyy").parse(listDatos[4]));
                    tarea.setRolRequerido(listDatos[5]);
                    tarea.setEstadoTarea(listDatos[6]);
                    list.add(tarea);
                }
                read.close();
                buffered.close();
                return list;
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
        return null;
    }
}
