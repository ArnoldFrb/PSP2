/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import logica.Ingeniero;

/**
 *
 * @author arnol
 */
public class IngenierosData {
    
    public static void WriteFile(Ingeniero ing) throws Exception
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
                buffered.write(ing.datosParaArchivo());
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write(ing.datosParaArchivo());
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
    
    public List<Ingeniero> readFile() throws Exception
    {
        List<Ingeniero> list = new ArrayList();
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
                    Ingeniero ing = new Ingeniero();
                    
                    ing.setIdentificacionIngeniero(listDatos[0]);
                    ing.setNombreIngeniero(listDatos[1]);
                    ing.setApellidoIngeniero(listDatos[2]);
                    ing.setEdadIngeniero(Integer.parseInt(listDatos[3]));
                    ing.setEspecailidadIngeniero(listDatos[4]);
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
    
    public Ingeniero queryFile(int queryData) throws Exception
    {
        Ingeniero ing = new Ingeniero();
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
                        ing.setIdentificacionIngeniero(listDatos[0]);
                        ing.setNombreIngeniero(listDatos[1]);
                        ing.setApellidoIngeniero(listDatos[2]);
                        ing.setEdadIngeniero(Integer.parseInt(listDatos[3]));
                        ing.setEspecailidadIngeniero(listDatos[4]);
                        ing.setAñosExperiencia(Integer.parseInt(listDatos[4]));
                        
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
        return flag ? ing : null;
    }
}
