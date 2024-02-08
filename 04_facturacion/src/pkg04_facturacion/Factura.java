package pkg04_facturacion;

/**
 * Define una factura de productos
 * @author Gerardo Portillo
 */
import java.util.Calendar;
import java.text.SimpleDateFormat; //clase para dar formato a fecha
public class Factura {
    //atributos
    public int numero;
    public Calendar fecha;
    public Cliente cliente;
    private Producto producto1;
    public Producto producto2;
    public Producto producto3;
    public Producto producto4;
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente,
            Producto producto1) {
        //validar que producto1 venga
        if( producto1 == null )
            throw new IllegalArgumentException("producto1 no puede ser null");
        else
            this.producto1 = producto1; //se acepta
        
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        //como buena practica, inicializar los productos del 2 al 4 como null
        this.producto2 = null;
        this.producto3 = null;
        this.producto4 = null;
    }
    //metodos
    public Producto getProducto1() {
        return this.producto1;
    }
    public Producto getProducto2() {
        return this.producto2;
    }
    public Producto getProducto3() {
        return this.producto3;
    }
    public Producto getProducto4() {
        return this.producto4;
    }
    public void imprimir(){
        System.out.println("****** Factura ******");
        System.out.println("Numero: "+this.numero);
        //si viene la fecha se imprime
        if( this.fecha != null ){
            /*System.out.println("Fecha: "+this.fecha.get(Calendar.YEAR)+"/"
                    +this.fecha.get(Calendar.MONTH)+"/"+this.fecha.get(Calendar.DAY_OF_MONTH));*/
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            System.out.println("Fecha: "+formato.format(this.fecha.getTime()));
        }
        //cliente
        System.out.print("Cliente: ");
        if( this.cliente == null )
            System.out.println("Consumidor Final");
        else{
            System.out.println(this.cliente.nombre);
            System.out.println("RTN: "+this.cliente.rtn);
        }
        //productos
        float subtotal = 0.00f;
        System.out.println("Producto\tPrecio");
        //desde el constructor nos aseguramos que producto1 viene lleno
        System.out.println(this.producto1.nombre+"\t"+this.producto1.precioVenta);
        subtotal += this.producto1.precioVenta;
        
        //productos del 2 al 4 si viene null no se consideran
        if( producto2 != null ){
            System.out.println(this.producto2.nombre+"\t"+this.producto2.precioVenta);
            subtotal += this.producto2.precioVenta;
        }
        if( producto3 != null ){
            System.out.println(this.producto3.nombre+"\t"+this.producto3.precioVenta);
            subtotal += this.producto3.precioVenta;
        }
        if( producto4 != null ){
            System.out.println(this.producto4.nombre+"\t"+this.producto4.precioVenta);
            subtotal += this.producto4.precioVenta;
        }
        //sumario
        System.out.println("\nSubtotal: "+subtotal);
        System.out.println("ISV 15%: "+subtotal*0.15f);
        System.out.println("Total: "+subtotal*1.15f);
    }
}
