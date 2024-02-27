package pkg09_polimorfismo1;
public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal("Jirafa","Mamifero",4,true);
        a1.imprimir();
        a1.hablar();
        
        Gato g1 = new Gato("Misingo", true, true, 4);
        g1.imprimir();
        g1.hablar();
        g1.ronronear();
        
        Perro p1 = new Perro("Chilipuca", "Aguacate", true, 4);
        p1.imprimir();
        p1.hablar();
        p1.jugar();
    }
}
