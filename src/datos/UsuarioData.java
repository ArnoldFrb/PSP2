package datos;
import DAO.*;
import java.io.*;
import logica.Usuario;

public class UsuarioData implements UsuarioDAO{

    public String Guardar(Usuario usuario) throws Exception {
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
            }
            else
            {
                write = new FileWriter(file, true);
                buffered = new BufferedWriter(write);
                buffered.write(usuario.datosParaArchivo());
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
    
    public Usuario Consultar(String id) throws Exception {
        try {
            Usuario usuario = new Usuario();

            File file = new File("psp2_db\\Usuario.txt");
            FileReader read;
            BufferedReader buffered;
            if(file.exists()) {

                read = new FileReader(file);
                buffered = new BufferedReader(read);
                String datos;

                while((datos = buffered.readLine()) != null) {
                    String[] listaDatos = datos.split(";");
                    
                    usuario.setIdentificacion(Integer.parseInt(listaDatos[0]));
                    usuario.setNombre(listaDatos[1]);
                    usuario.setApellido(listaDatos[2]);
                    usuario.setUsuario(listaDatos[3]);
                    usuario.setContraseña(listaDatos[4]);
                    usuario.setTipoUsurio(listaDatos[5]);
            }
                read.close();
                buffered.close();
                return usuario;
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
