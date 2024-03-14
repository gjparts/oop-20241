package pkg13_todo;

import java.util.Calendar;
import java.util.LinkedList;

public abstract class Documento {
    //atributos
    public int numero;
    public Calendar fecha;
    private String nombre;
    public float subtotal;
    public LinkedList<Item> items;
    public float subtotalExentoISV;
    //constructor
    public Documento(int numero, Calendar fecha, String nombre, Item item) {
        this.numero = numero;
        this.fecha = fecha;
        this.nombre = nombre;
        this.subtotal = 0.00f;
        this.subtotalExentoISV = 0.00f;
        //items debe tener al menos un item, en este caso es el que se envia por el constr.
        if( item == null )
            throw new IllegalArgumentException("debe enviar al menos un item");
        else{
            this.items = new LinkedList();
            this.items.add(item);
        }
    }
    //metodos
    public abstract void imprimir(); //metodo abstracto
    //metodos concretos:
    public String getNombre() {
        return nombre;
    }
    //metodo que imprime el detalle de items
    public void imprimirItems(boolean soloCosto){
        this.subtotal = 0.00f;
        this.subtotalExentoISV = 0.00f;
        System.out.println("Nombre\tUnidad\tCantidad\tValorUnidad\tTotal");
        if( this.items != null ){
            for( int i = 0; i < this.items.size(); i++ ){
                if( this.items.get(i) != null ){
                    System.out.print(this.items.get(i).producto.nombre);
                    System.out.print("\t"+this.items.get(i).producto.unidadMedida);
                    System.out.print("\t"+this.items.get(i).cantidad);
                    
                    float valorUnidad;
                    if( soloCosto == true )
                        valorUnidad = this.items.get(i).costoUnitario;
                    else
                        valorUnidad = this.items.get(i).precioUnitario;
                    
                    System.out.print("\t"+valorUnidad);
                    System.out.print("\t"+valorUnidad*this.items.get(i).cantidad);
                    this.subtotal += valorUnidad*this.items.get(i).cantidad;
                    
                    //apartar el monto exento de isv
                    if( this.items.get(i).producto.pagaISV == false )
                        this.subtotalExentoISV += valorUnidad*this.items.get(i).cantidad;
                    
                    System.out.println();
                }
            }
        }
        System.out.println("\nSubtotal: "+subtotal);
    }
}
