package pkg07_herencia1;

/**
 * Define a un pasante
 * Practicante hereda de Empleado
 * @author Gerardo Portillo
 */
public class Practicante extends Empleado {
    //atributos
    public int meses;
    //constructor
    public Practicante(String nombre, int edad, int meses){
        //construir la super clase
        super(0, "Practicante");
        //llenar los atributos de la super clase
        this.nombre = nombre;
        this.edad = edad;
        this.genero = 'N';
        //llenar los atributos de esta clase
        this.meses = meses;
    }
}
