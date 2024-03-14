package pkg13_todo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Compra extends Documento {
    //atributos
    public Proveedor proveedor;
    //constructor
    public Compra(int numero, Calendar fecha, Item item, Proveedor proveedor){
        //construir la super clase
        super(numero, fecha, "Compra",item);
        
        //proveedor es obligatorio
        if( proveedor != null )
            this.proveedor = proveedor;
        else
            throw new IllegalArgumentException("Proveedor es obligatorio en Compra");
    }
    //implementar metodo abstracto
    @Override
    public void imprimir(){
        System.out.println("************************ COMPRA ************************");
        System.out.print("Proveedor: ");
        if( this.proveedor != null )
            System.out.println( this.proveedor.nombre );
        else
            System.out.println("NO TIENE");
        
        System.out.println("Numero: "+this.numero);
        if( this.fecha != null ){
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha: "+f.format(this.fecha.getTime()));
        }
        this.imprimirItems(true);
    }
}
