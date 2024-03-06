package pkg11_abstraccion1;

/**
 * Clase abstracta que representa a un Ser Vivo
 * @author Gerardo Portillo
 */
public abstract class SerVivo {
    //atributos
    public String especie;
    //constructor
    public SerVivo(String especie){
        this.especie = especie;
    }
    //metodos abstractos
    public abstract void hablar();
    public abstract void dormir();
    public abstract void alimentarse();
    public abstract void desplazarse();
    //metodos concretos (no abstractos)
    public void vivir(){
        //en este caso vivir necesitará de 3 de los metodos
        //abstractos de la clase
        this.desplazarse();
        this.alimentarse();
        this.dormir();
    }
}
