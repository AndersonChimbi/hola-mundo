package Modelo;

/**
 *
 * @author jandy
 */
public class Usuario {
   
    String cedula ;
    String nombre;
    String apellido;
    String Genero;
    int SalarioBasico;
    String Fecha;
    String Ingreso;
    String Imagen;

    public Usuario(String cedula, String nombre, String apellido, String Genero, int SalarioBasico, String Fecha, String Ingreso, String Imagen) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Genero = Genero;
        this.SalarioBasico = SalarioBasico;
        this.Fecha = Fecha;
        this.Ingreso = Ingreso;
        this.Imagen = Imagen;
    }

    public String getIngreso() {
        return Ingreso;
    }

    public void setIngreso(String Ingreso) {
        this.Ingreso = Ingreso;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    

    

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getSalarioBasico() {
        return SalarioBasico;
    }

    public void setSalarioBasico(int SalarioBasico) {
        this.SalarioBasico = SalarioBasico;
    }
    
   
}
