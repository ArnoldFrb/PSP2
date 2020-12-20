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
import logica.Ingeniero;
import logica.Tarea;

/**
 *
 * @author arnol
 */
public class TareasData {
    public String Guardar(Tarea tarea) throws Exception {
        try {
            File file = new File("psp2_db\\Tareas.txt");
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

            return "Todo melo";
        }
        catch(IOException e)
        {
            return e.toString();
        }
    }
    
    public Tarea Consultar(String id) throws Exception {
        try {
            Tarea tarea = new Tarea();

            File file = new File("psp2_db\\Tareas.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");
                    
                    tarea.setIdentificadorTarea(Integer.parseInt(listaDatos[0]));
                    tarea.setDescripcionTarea(listaDatos[1]);
                    tarea.setDuracionTarea(Integer.parseInt(listaDatos[2]));
                    tarea.setFaseProyecto(listaDatos[3]);
                    tarea.setIngeniero(listaDatos[4]);
                    tarea.setFechaInicio(new SimpleDateFormat("dd/MM/yyyy").parse(listaDatos[5]));
                    tarea.setEstadoTarea(listaDatos[6]);
                    tarea.setRolRequerido(listaDatos[7]);
                    tarea.setJustificacion(listaDatos[8]);
            }
                read.close();
                buffered.close();
                return tarea;
            }
            else
            {
                return null;
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
