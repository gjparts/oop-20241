package pkg13_todo;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gerardo", "123", 777, "un lado");
        Producto p1 = new Producto("A01", "Agua bolsa", "Bolsa", true);
        Producto p2 = new Producto("A02", "Coca Cola 3L", "Botella", true);
        Producto p3 = new Producto("M01", "Panadol", "Sobre", false);
        
        Factura f1 = new Factura(1, Calendar.getInstance(), new Item(p1, 5, 4, 1.5f), c1, "CONTADO");
        f1.items.add( new Item(p3,10,8,0) );
        f1.imprimir();
        
        Calendar fechaX = Calendar.getInstance();
        fechaX.add(Calendar.MONTH, 1);
        Cotizacion co1 = new Cotizacion(123, Calendar.getInstance(), new Item(p2, 100, 50, 0),
                c1, fechaX);
        co1.imprimir();
        
        Pedido pe1 = new Pedido(789, Calendar.getInstance(), new Item(p2,15,50,0), c1, fechaX,
        new Cliente("Irene","",0,""));
        pe1.items.add( new Item(p1,50,3,0) );
        pe1.imprimir();
        
        Compra com1 = new Compra(891, Calendar.getInstance(), 
                new Item(p3,200,0,45), new Proveedor("Cerveceria Hondureña","",0,""));
        com1.imprimir();
    }
    
}
