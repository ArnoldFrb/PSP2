package datos;
import DAO.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logica.Usuario;

public class UsuarioData implements UsuarioDAO{

    private File file;

    public UsuarioData() {
        file = new File("psp2_db\\Usuarios.txt");
    }
    
    
    
    @Override
    public String writeFile(Usuario usuario) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {
            FileWriter write;
           
            if(file.exists())
            {
                write = new FileWriter(file, true);
                write.write(usuario.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                write.write(usuario.datosParaArchivo());
                
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
    public Usuario queryFile(int querydata) throws Exception {
        Usuario usuario = new Usuario();
        
        boolean flag = false;

        try {
            FileReader read;

            if(file.exists()) {

                read = new FileReader(file);
                String datos;
                Scanner readScan = new Scanner(read);
                
                while((datos = readScan.nextLine()) != null) {
                    String[] listaDatos = datos.split(";");

                    if(Integer.parseInt(listaDatos[0]) == querydata){
                        usuario.setIdentificacion(Integer.parseInt(listaDatos[0]));
                        usuario.setNombre(listaDatos[1]);
                        usuario.setApellido(listaDatos[2]);
                        usuario.setUsuario(listaDatos[3]);
                        usuario.setContraseña(listaDatos[4]);
                        usuario.setTipoUsurio(Boolean.parseBoolean(listaDatos[5]));
                        
                        flag = true;
                    }
                }
                read.close();
                readScan.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? usuario : null;
    }
    
    public List<Usuario> readFile() throws Exception {
        
        List<Usuario> list = new ArrayList();
        boolean flag = false;
        try {
            
            FileReader read;

            if(file.exists()) {

                read = new FileReader(file);
                Scanner readScan = new Scanner(read);
                String datos;

                while((datos = readScan.nextLine()) != null) {
                    
                    String[] listaDatos = datos.split(";");
                    Usuario usuario = new Usuario();
                    
                    usuario.setIdentificacion(Integer.parseInt(listaDatos[0]));
                    usuario.setNombre(listaDatos[1]);
                    usuario.setApellido(listaDatos[2]);
                    usuario.setUsuario(listaDatos[3]);
                    usuario.setContraseña(listaDatos[4]);
                    usuario.setTipoUsurio(Boolean.parseBoolean(listaDatos[5]));
                    
                    list.add(usuario);
                    
                    flag = true;
                }
                read.close();
                readScan.close();
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
    public String login(String usuario, String contraseña) throws Exception {
        
        boolean flag =  false;
        String res = "";

        try {

            if(file.exists()) {
                
                Scanner readScan = new Scanner(file);
                String datos;

                while(readScan.hasNext()) {
                    datos = readScan.nextLine();
                    String[] listaDatos = datos.split(";");
                    
                    if(listaDatos[3].equals(usuario) && listaDatos[4].equals(contraseña)){
                        
                        if(listaDatos[5].equals("true"))
                        {
                            res = "Gerente";
                        }
                        else
                        {
                            res = "Equipo";
                        }
                        flag = true;
                    }
                }
                
                readScan.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        
        return flag ? res : null;
    }

}
