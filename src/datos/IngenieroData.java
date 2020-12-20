/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logica.Ingeniero;

/**
 *
 * @author arnol
 */
public class IngenieroData {
    
    public String Guardar(Ingeniero ingeniero) throws Exception {
        try {
            File file = new File("psp2_db\\Ingenieros.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists())
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                buffered.write(ingeniero.datosParaArchivo());
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write(ingeniero.datosParaArchivo());
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
    
    public Ingeniero Consultar(String id) throws Exception {
        try {
            Ingeniero ingeniero = new Ingeniero();

            File file = new File("psp2_db\\Ingenieros.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");
                    
                    ingeniero.setIdentificacionIngeniero(listaDatos[0]);
                    ingeniero.setNombreIngeniero(listaDatos[1]);
                    ingeniero.setApellidoIngeniero(listaDatos[2]);
                    ingeniero.setEdadIngeniero(Integer.parseInt(listaDatos[3]));
                    ingeniero.setAñosExperiencia(Integer.parseInt(listaDatos[4]));
                    ingeniero.setEspecailidadIngeniero(listaDatos[5]);
            }
                read.close();
                buffered.close();
                return ingeniero;
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
