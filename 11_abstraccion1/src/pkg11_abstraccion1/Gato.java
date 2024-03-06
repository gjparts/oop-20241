package pkg11_abstraccion1;

public class Gato extends SerVivo {
    //atributos
    public String apodo;
    //constructor
    public Gato(String apodo){
        super("Felino");
        this.apodo = apodo;
    }
    //implementar los metodos abstractos
    @Override
    public void desplazarse(){
        System.out.println("Camina sin hacer ruido.");
    }
    @Override
    public void hablar(){
        System.out.println("Miau");
    }
    @Override
    public void dormir(){
        System.out.println("Descansa sobre cualquier cosa");
    }
    @Override
    public void alimentarse(){
        System.out.println("Come alimentos para gato");
    }
}
