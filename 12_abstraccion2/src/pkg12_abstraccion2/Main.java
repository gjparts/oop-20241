package pkg12_abstraccion2;
public class Main {
    public static void main(String[] args) {
        //esto no se puede:
        //Figura f1 = new Figura("Octagono");
        Rectangulo r1 = new Rectangulo(8, 5);
        System.out.println("Area de r1: "+r1.calcularArea());
        System.out.println("Perimetro de r1: "+r1.calcularPerimetro());
        
        Circulo c1 = new Circulo(5);
        System.out.println("Area de c1: "+c1.calcularArea());
        System.out.println("Perimetro de c1: "+c1.calcularPerimetro());
        
        TrianguloEquilatero t1 = new TrianguloEquilatero(4, 5);
        System.out.println("Area de t1: "+t1.calcularArea());
        System.out.println("Perimetro de t1: "+t1.calcularPerimetro());
        
        double suma;
        suma = r1.calcularArea()+c1.calcularArea()+t1.calcularArea();
        System.out.println("La suma de todas las areas es "+suma);
    }    
}
