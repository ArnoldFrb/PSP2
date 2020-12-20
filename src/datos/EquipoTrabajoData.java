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
import logica.EquipoTrabajo;
/**
 *
 * @author Cristo Te Ama...!!
 */
public class EquipoTrabajoData {
    public String Guardar(EquipoTrabajo equipoTrabajo) throws Exception {
        try {
            File file = new File("psp2_db\\EquiposDeTrabajo.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists())
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                //buffered.write(equipoTrabajo.datosParaArchivo());
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                //buffered.write(equipoTrabajo.datosParaArchivo());
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
    
    public EquipoTrabajo Consultar(int id) throws Exception {
        try {
            EquipoTrabajo equipoTrabajo = new EquipoTrabajo();

            File file = new File("psp2_db\\EquiposDeTrabajo.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");
                    
                    equipoTrabajo.setIdEquipoTrabajo(Integer.parseInt(listaDatos[0]));
            }
                read.close();
                buffered.close();
                return equipoTrabajo;
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
    public ArrayList<Tareas> ConsultarTareasEquipo(int id) throws Exception {
        try {
            EquipoTrabajo equipoTrabajo = new EquipoTrabajo();

            File file = new File("psp2_db\\TareasEquiposDeTrabajo.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");
                    
                    equipoTrabajo.setIdEquipoTrabajo(Integer.parseInt(listaDatos[0]));
            }
                read.close();
                buffered.close();
                return equipoTrabajo;
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
    public ArrayList<Ingeniero> ConsultarIngenierosEquipo(int id) throws Exception {
        try {
            EquipoTrabajo equipoTrabajo = new EquipoTrabajo();

            File file = new File("psp2_db\\IngenierosEquiposDeTrabajo.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");
                    
                    equipoTrabajo.setIdEquipoTrabajo(Integer.parseInt(listaDatos[0]));
            }
                read.close();
                buffered.close();
                return equipoTrabajo;
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
