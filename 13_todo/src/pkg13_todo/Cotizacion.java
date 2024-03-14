package pkg13_todo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cotizacion extends Documento {
    //atributos
    public Cliente cliente;
    public Calendar fechaLimite;
    public float isv;
    public float total;
    //constructor
    public Cotizacion(int numero, Calendar fecha, Item item, Cliente cliente, Calendar fechaLimite){
        //construir la super clase
        super(numero, fecha, "Cotizacion",item);
        
        //cliente es obligatorio
        if( cliente != null )
            this.cliente = cliente;
        else
            throw new IllegalArgumentException("Cliente es obligatorio en Cotizacion");
            
        this.fechaLimite = fechaLimite;
        this.total = 0.00f;
        this.isv = 0.00f;
    }
    //implementar metodo abstracto
    @Override
    public void imprimir(){
        System.out.println("************************ COTIZACION ************************");
        System.out.print("Cliente: ");
        if( this.cliente != null )
            System.out.println( this.cliente.nombre );
        else
            System.out.println("CONSUMIDOR FINAL");
        
        System.out.println("Numero: "+this.numero);
        if( this.fecha != null ){
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha: "+f.format(this.fecha.getTime()));
        }
        if( this.fecha != null ){
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha Limite: "+f.format(this.fechaLimite.getTime()));
        }
        this.imprimirItems(false);
        this.isv = (this.subtotal-this.subtotalExentoISV)*0.15f;
        this.total = this.subtotal+this.isv;
        System.out.println("ISV: "+this.isv);
        System.out.println("Total: "+this.total);
    }
}
