
package datos;
import DAO.IngenieroDAO;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logica.Ingeniero;

public class IngenierosData implements IngenieroDAO{
    
    private File file;

    public IngenierosData() {
        file = new File("psp2_db\\Ingenieros.txt");
    }

    @Override
    public String writeFile(Ingeniero ing) throws Exception
    {
        String res = "";
        boolean flag = false;
        
        try
        {
            FileWriter write;
            
            if(file.exists())
            {
                write = new FileWriter(file, true);
                write.write(ing.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                write.write(ing.datosParaArchivo());
                
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
    public List<Ingeniero> readFile() throws Exception
    {
        List<Ingeniero> list = new ArrayList();
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
                    Ingeniero ing = new Ingeniero();
                    
                    ing.setIdentificacionIngeniero(listDatos[0]);
                    ing.setNombreIngeniero(listDatos[1]);
                    ing.setApellidoIngeniero(listDatos[2]);
                    ing.setEdadIngeniero(Integer.parseInt(listDatos[3]));
                    ing.setEspecailidadIngeniero(listDatos[4]);
                    ing.setAñosExperiencia(Integer.parseInt(listDatos[4]));
                    list.add(ing);
                    
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
    public Ingeniero queryFile(int queryData) throws Exception
    {
        Ingeniero ing = new Ingeniero();
        boolean flag = false;
        
        try
        {

            if(file.exists())
            {
                Scanner readScan = new Scanner(file);
                String datos;

                while(readScan.hasNext()) 
                {
                    datos = readScan.nextLine();
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
        
        return flag ? ing : null;
    }
}
