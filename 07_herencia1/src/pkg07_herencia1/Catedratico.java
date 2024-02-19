package pkg07_herencia1;

/**
 * Define a un catedratico o docente
 * @author Gerardo Portillo
 */
public class Catedratico extends Empleado {
    //atributos
    public String profesion;
    //constructor
    public Catedratico(String nombre, int edad, char genero,
            String profesion, float salario){
        //construir la super clase
        super(salario, "Docente/Catedratico");
        //llenar los atirbutos de la super clase
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        //llenar los atributos de esta clase
        this.profesion = profesion;
    }
    //metodos
    public void educar(){
        System.out.println("Estoy dando clases sobre mi oficio: "+this.profesion);
    }
}
