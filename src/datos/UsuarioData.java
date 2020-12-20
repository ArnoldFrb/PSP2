package datos;
import DAO.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import logica.Usuario;

public class UsuarioData implements UsuarioDAO{

    public UsuarioData() {
    }

    public String writeFile(Usuario usuario) throws Exception {
        
        String res = "";
        boolean flag = false;
        
        try 
        {
            File file = new File("psp2_db\\Usuarios.txt");
            FileWriter write;
            BufferedWriter buffered;
            
            if(file.exists())
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.newLine();
                buffered.write(usuario.datosParaArchivo());
                
                res = "Se ha insertado el nuevo registro";
                flag = true;
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write(usuario.datosParaArchivo());
                
                res = "Se ha insertado el registro";
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
        
        return flag ? res : "Error al insertar registros";
    }
    
    public Usuario queryFile(int querydata) throws Exception {
        
        Usuario usuario = new Usuario();

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
                        usuario.setTipoUsurio(listaDatos[5]);
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
        return usuario;
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
                    usuario.setTipoUsurio(listaDatos[5]);
                    list.add(usuario);
                }
                read.close();
                buffered.close();
                flag = true;
            }
        }
        catch(IOException e)
        {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
        return flag ? list : null;
    }

}
