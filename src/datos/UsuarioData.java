package datos;
import DAO.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import logica.Usuario;

public class UsuarioData implements UsuarioDAO{

    @Override
    public String writeFile(Usuario usuario) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try {
            File file = new File("psp2_db\\Usuarios.txt");
            FileWriter write;
            BufferedWriter buffered;
            if(file.exists())
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                buffered.write(usuario.datosParaArchivo());
                
                res = "Se añadio un nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write(usuario.datosParaArchivo());
                
                res = "Se añadio un registro";
                flag = true;
            }
            write.close();
            buffered.close();

            return "Todo melo";
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

            File file = new File("psp2_db\\Usuario.txt");
            FileReader read;
            BufferedReader buffered;

            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
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
                buffered.close();
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

            File file = new File("psp2_db\\Usuario.txt");
            FileReader read;
            BufferedReader buffered;

            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
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
                buffered.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        return flag ? list : null;
    }
    
    public boolean login(String usuario, String contraseña) throws Exception {
        
        boolean flag =  false;

        try {

            File file = new File("psp2_db\\Usuario.txt");
            FileReader read;
            BufferedReader buffered;

            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");

                    if(listaDatos[3].equals(usuario) && listaDatos[3].equals(contraseña)){
                        flag =  true;
                    }
                }
                read.close();
                buffered.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        return flag;
    }

}
