package pkg09_polimorfismo1;
public class Gato extends Animal {
    //atributos
    public String apodo;
    private boolean tienePelaje;
    //constructor
    public Gato(String apodo, boolean tienePelaje, boolean tieneCola, int patas){
        //construir la super clase
        super("Gato", "Mamifero", patas, tieneCola);
        //atributos de esta clase
        this.apodo = apodo;
        this.tienePelaje = tienePelaje;
    }
    //metodos
    public void ronronear(){
        System.out.println("prrrrrrrr");
    }
    //Polimorfismo: reemplazar metodo de la clase padre
    @Override
    public void hablar(){
        //Override completo: no reutilizamos el metodo heredado sino que
        //cambiamos totalmente su comportamiento.
        System.out.println("Miauuuu");
    }
    @Override
    public void imprimir(){
        //Override parcial: reutilizar el metodo heredado agregando
        //nuevas funcionalidades
        //ejecutar lo heredado:
        super.imprimir();
        //ejecutar lo nuevo:
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Tiene pelaje: "+( this.tienePelaje ? "Si" : "No" ));
    }
}
