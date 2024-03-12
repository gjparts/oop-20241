package pkg12_abstraccion2;
public class Rectangulo extends Figura {
    //atributos
    private double largo;
    private double ancho;
    //constructor
    public Rectangulo(double largo, double ancho) {
        //construir la super clase
        super("Rectangulo");
        this.largo = largo;
        this.ancho = ancho;
    }
    //metodos
    //implementar los metodos abstractos
    @Override
    public double calcularArea() {
        return this.largo*this.ancho;
    }
    @Override
    public double calcularPerimetro() {
        return 2*this.largo+2*this.ancho;
    }
    //getters y setters
    public double getLargo() {
        return this.largo;
    }
    public double getAncho() {
        return this.ancho;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
