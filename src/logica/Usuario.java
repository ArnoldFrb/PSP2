package logica;
public class Usuario {
    public int identificacion;
    public String nombre;
    public String apellido;
    public String usuario;
    public String contraseña;
    public boolean tipoUsurio;

    public Usuario() {
    }

    public Usuario(int identificacion, String nombre, String apellido, String usuario, String contraseña, boolean tipoUsurio) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipoUsurio = tipoUsurio;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean isTipoUsurio() {
        return tipoUsurio;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipoUsurio(boolean tipoUsurio) {
        this.tipoUsurio = tipoUsurio;
    }

    @Override
    public String toString() {
        return "Usuario:" + 
                "\nIdentificacion: " + identificacion + 
                "\nNombre: " + nombre + 
                "\nApellido: " + apellido + 
                "\nUsuario: " + usuario + 
                "\nContrasenia: " + contraseña + 
                "\nTipoUsurio: " + tipoUsurio;
    }

    public String datosParaArchivo() {
        return this.identificacion+";"+this.nombre+";"+this.apellido+";"+this.usuario+";"+this.contraseña+";"+this.tipoUsurio+"\n";
    }
}
