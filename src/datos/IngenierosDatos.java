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
import logica.IngenierosLogica;

/**
 *
 * @author arnol
 */
public class IngenierosDatos {
    
    public static void WriteFile(IngenierosLogica ing) throws Exception
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
                buffered.write("HOLA MUNDO");
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write("HOLA MUNDO");
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
    
    public List<IngenierosLogica> readFile() throws Exception
    {
        List<IngenierosLogica> list = new ArrayList();
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
                    IngenierosLogica ing = new IngenierosLogica();
                    ing.setIdentificacion(Integer.parseInt(listDatos[0]));
                    ing.setNombre(listDatos[1]);
                    ing.setApellido(listDatos[2]);
                    ing.setEdad(Integer.parseInt(listDatos[3]));
                    ing.setEspecialidad(listDatos[4]);
                    ing.setAñosExperiencia(Integer.parseInt(listDatos[4]));
                    list.add(ing);
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
