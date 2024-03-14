package pkg13_todo;
public class Producto {
    //atributos
    public String codigo;
    public String nombre;
    public String unidadMedida;
    public boolean pagaISV;
    //constructor
    public Producto(String codigo, String nombre, String unidadMedida, boolean pagaISV) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.pagaISV = pagaISV;
    }
}