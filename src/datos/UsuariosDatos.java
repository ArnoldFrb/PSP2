/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import logica.Usuario;

/**
 *
 * @author arnol
 */
public class UsuariosDatos {
    public static void WriteFile(Usuario user) throws Exception
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
                buffered.write(user.datosParaArchivo());
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
    
    public List<Usuario> readFile() throws Exception
    {
        List<Usuario> list = new ArrayList();
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
                    Usuario user = new Usuario();
                    user.setIdentificacion(Integer.parseInt(listDatos[0]));
                    user.setNombre(listDatos[1]);
                    user.setApellido(listDatos[2]);
                    user.setContraseña(listDatos[3]);
                    user.setContraseña(listDatos[4]);
                    user.setTipoUsurio(Boolean.parseBoolean(listDatos[5]));
                    list.add(user);
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
