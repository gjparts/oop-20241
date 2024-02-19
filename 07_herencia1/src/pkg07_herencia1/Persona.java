package pkg07_herencia1;
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    //constructor
    //sin parametros
    public Persona(){
        this.nombre = "No tiene";
        this.edad = 0;
        this.genero = 'N';
    }
    //con 3 parametros
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    //metodos
    public void saludar(){
        System.out.println("Hola soy "+this.nombre);
    }
}
