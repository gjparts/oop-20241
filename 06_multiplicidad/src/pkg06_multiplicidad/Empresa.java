package pkg06_multiplicidad;

/**
 * Define a una empresa/negocio
 * @author Gerardo Portillo
 */
public class Empresa {
    //atributos
    public String nombre;
    private Direccion direccion;
    public int telefono;
    //constructor
    public Empresa(String nombre, Direccion direccion, int telefono) {
        if( direccion == null )
            throw new IllegalArgumentException("direccion no debe ser null");
        else
            this.direccion = direccion; //se acepta
        
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //metodos
    public Direccion getDireccion() {
        return direccion;
    }
}
