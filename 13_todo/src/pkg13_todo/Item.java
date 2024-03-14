package pkg13_todo;
public class Item {
    //atributos
    public Producto producto;
    public float cantidad;
    public float precioUnitario;
    public float costoUnitario;
    //constructor
    public Item(Producto producto, float cantidad, float precioUnitario, float costoUnitario){
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.costoUnitario = costoUnitario;
    }
}
