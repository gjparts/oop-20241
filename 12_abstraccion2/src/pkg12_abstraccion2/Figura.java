package pkg12_abstraccion2;
public abstract class Figura {
    //atributos
    private String nombre;
    //constructor
    public Figura(String nombre){
        this.nombre = nombre;
    }
    //mmetodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    //metodos concretos
    public String getNombre(){
        return this.nombre;
    }
}
