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
    //multiplicidad: coleccion de elementos repetitivos
    private Producto[] productos;
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente, Producto[] productos) {
        //al menos el primer producto debe venir lleno
        //como es un arreglo primero validamos que no sea null y segundo que
        //al menos traiga un item y tercero que el primer item no sea null
        if( productos == null )
            throw new IllegalArgumentException("Arreglo de productos no puede ser null");
        else{
            if( productos.length == 0 )
                throw new IllegalArgumentException("productos debe tener al menos un item");
            else{
                if( productos[0] == null )
                    throw new IllegalArgumentException("primer item de productos no debe ser null");
                else
                    this.productos = productos; //se acepta
            }
        }
        
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;        
    }
    //metodos
    public Producto[] getProductos() {
        return this.productos;
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
        //recorrer la coleccion de productos
        for( int i = 0; i < this.productos.length; i++ ){
            //imprimir solo aquellos item que no sean nulos
            if( this.productos[i] != null ){
                //desde el constructor nos aseguramos que producto1 viene lleno
                System.out.println(this.productos[i].nombre+"\t"+this.productos[i].precioVenta);
                subtotal += this.productos[i].precioVenta;
            }
        }
        
        //sumario
        System.out.println("\nSubtotal: "+subtotal);
        System.out.println("ISV 15%: "+subtotal*0.15f);
        System.out.println("Total: "+subtotal*1.15f);
    }
}
