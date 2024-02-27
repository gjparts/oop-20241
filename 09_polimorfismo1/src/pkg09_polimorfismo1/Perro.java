package pkg09_polimorfismo1;
public class Perro extends Animal {
    //atributos
    public String apodo;
    private String raza;
    //constructor
    public Perro(String apodo, String raza, boolean tieneCola, int patas){
        super("Perro", "Mamifero", patas, tieneCola);
        this.apodo = apodo;
        this.raza = raza;
    }
    //metodos
    public void jugar(){
        System.out.println("Mueve la cola y corre.");
    }
    @Override
    public void hablar(){
        //Override completo
        System.out.println("Wuau, Wof, Guau, Bark");
    }
    @Override
    public void imprimir(){
        //Override parcial
        super.imprimir();
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Raza: "+this.raza);
    }
}
