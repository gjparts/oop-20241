package pkg13_todo;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Factura extends Documento {
    //atributos
    public Cliente cliente;
    private String tipo;
    public float isv;
    public float total;
    //constructor
    public Factura(int numero, Calendar fecha, Item item, Cliente cliente, String tipo){
        //construir la super clase
        super(numero, fecha, "Factura",item);
        this.cliente = cliente;
        this.setTipo(tipo);
        this.total = 0.00f;
        this.isv = 0.00f;
    }
    //metodos
    public void setTipo(String tipo){
        if( tipo.equals("CREDITO") || tipo.equals("CONTADO") )
            this.tipo = tipo; //se acepta
        else
            throw new IllegalArgumentException("tipo de la factura debe ser CREDITO o CONTADO");
    }
    //implementar metodo abstracto
    @Override
    public void imprimir(){
        System.out.println("************************ FACTURA ************************");
        System.out.print("Cliente: ");
        if( this.cliente != null )
            System.out.println( this.cliente.nombre );
        else
            System.out.println("CONSUMIDOR FINAL");
        System.out.println("Tipo de factura: "+this.tipo);
        System.out.println("Numero: "+this.numero);
        if( this.fecha != null ){
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha: "+f.format(this.fecha.getTime()));
        }
        this.imprimirItems(false);
        this.isv = (this.subtotal-this.subtotalExentoISV)*0.15f;
        this.total = this.subtotal+this.isv;
        System.out.println("ISV: "+this.isv);
        System.out.println("Total: "+this.total);
    }
}
