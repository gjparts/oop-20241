package pkg04_facturacion;

/**
 * Define a un cliente
 * @author Gerardo Portillo
 */
public class Cliente {
    //atributos
    public String nombre;
    public int rtn;
    public int telefono;
    public String correo;
    //constructor
    public Cliente(String nombre, int rtn, int telefono, String correo) {
        this.nombre = nombre;
        this.rtn = rtn;
        this.telefono = telefono;
        this.correo = correo;
    } 
}
