package pkg07_herencia1;

/**
 * Define a un estudiante
 * Estudiante hereda de Persona
 * @author Gerardo Portillo
 */
public class Estudiante extends Persona {
   //atributos
    public String cuenta;
    public String carrera;
    //constructor
    public Estudiante(String nombre, String cuenta, String carrera){
        //importante: construir la Super clase desde
        //el constructor de la super clase
        super(nombre, 0, 'N');
        //atributos de la clase hijo
        this.cuenta = cuenta;
        this.carrera = carrera;
    }
    //metodos
    public void estudiar(){
        System.out.println("Estoy estudiando "+this.carrera
                +" mi edad es "+this.edad);
    }
}
