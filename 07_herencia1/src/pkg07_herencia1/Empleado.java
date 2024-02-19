package pkg07_herencia1;

/**
 * Define a un empleado
 * Empleado hereda de Persona
 * @author Gerardo Portillo
 */
public class Empleado extends Persona {
    //atributos
    public float salario;
    public String cargo;
    //constructor
    public Empleado(float salario, String cargo){
        //construir la super clase
        super(); //usare el constructor sin parametros de la clase padre
        //inicializar los atributos de la clase hijo
        this.salario = salario;
        this.cargo = cargo;
    }
    //metodos
    public void trabajar(){
        System.out.println("Mi primera chamba como "+this.cargo);
    }
}
