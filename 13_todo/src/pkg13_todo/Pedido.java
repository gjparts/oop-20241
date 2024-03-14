package pkg13_todo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pedido extends Documento {
    //atributos
    public Cliente cliente;
    public Calendar fechaEntrega;
    public Cliente destinatario;
    public float isv;
    public float total;
    //constructor
    public Pedido(int numero, Calendar fecha, Item item, Cliente cliente,
            Calendar fechaEntrega, Cliente destinatario){
        //construir la super clase
        super(numero, fecha, "Pedido",item);
        
        //cliente es obligatorio
        if( cliente != null )
            this.cliente = cliente;
        else
            throw new IllegalArgumentException("Cliente es obligatorio en Pedido");
        
        //destinatario es obligatorio
        if( destinatario != null )
            this.destinatario = destinatario;
        else
            throw new IllegalArgumentException("Destinatario es obligatorio en Pedido");
            
        this.fechaEntrega = fechaEntrega;
        this.total = 0.00f;
        this.isv = 0.00f;
    }
    //implementar metodo abstracto
    @Override
    public void imprimir(){
        System.out.println("************************ PEDIDO ************************");
        System.out.print("Cliente: ");
        if( this.cliente != null )
            System.out.println( this.cliente.nombre );
        else
            System.out.println("CONSUMIDOR FINAL");
        
        System.out.print("Destinatario: ");
        if( this.destinatario != null )
            System.out.println( this.destinatario.nombre );
        else
            System.out.println("NO TIENE");
        
        System.out.println("Numero: "+this.numero);
        if( this.fecha != null ){
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha: "+f.format(this.fecha.getTime()));
        }
        if( this.fecha != null ){
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha de Entrega: "+f.format(this.fechaEntrega.getTime()));
        }
        this.imprimirItems(false);
        this.isv = (this.subtotal-this.subtotalExentoISV)*0.15f;
        this.total = this.subtotal+this.isv;
        System.out.println("ISV: "+this.isv);
        System.out.println("Total: "+this.total);
    }
}
