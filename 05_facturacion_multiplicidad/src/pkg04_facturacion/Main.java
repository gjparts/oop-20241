/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_facturacion;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Calendar;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objetos de prueba
        CategoriaProducto cp01 = new CategoriaProducto("Refrescos", "A4");
        CategoriaProducto cp02 = new CategoriaProducto("Frutas", "Z1");
        CategoriaProducto cp03 = new CategoriaProducto("Verduras", "X3");
        
        Cliente c01 = new Cliente("Estevancito Maravilla", 123, 0, "no tiene");
        Cliente c02 = new Cliente("Kurco Bain", 7777777, 0, "no tiene");
        Cliente c03 = new Cliente("Filomeno Colinas", 555555, 0, "no tiene");
        
        Producto p01 = new Producto("Coca 3LT", cp01, 55);
        Producto p02 = new Producto("Manzana", cp02, 8);
        Producto p03 = new Producto("Banano", cp02, 5);
        Producto p04 = new Producto("Papa LB", cp03, 14);
        
        //hacer el array de productos aparte
        Producto arr1[] = { p02 };
        Factura f01 = new Factura(1, null, null, arr1);
        f01.imprimir();
        
        //hacer el array de productos aparte
        Producto arr2[] = { p01, p04, p04, p03, p04, p01, p02, p02 };
        Factura f02 = new Factura(2, Calendar.getInstance(),
                new Cliente("Alguien", 111, 0, ""), arr2);
        f02.imprimir();
        
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2024, 1, 7,8,10,0);
        //podemos crear el array dentro del parametro del constructor
        Factura f03 = new Factura(3, fecha1, c01, new Producto[]{ p02, p01, p04 } );
        f03.imprimir();
        
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(2024, 1,6,11,45,55);
        //hacer el array de productos aparte
        Producto arr3[] = { p02, null, null, p01, null, p03 };
        Factura f04 = new Factura(4, fecha2, null, arr3);
        f04.imprimir();
    }
    
}
