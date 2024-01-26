/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00_clases;

/**
 *
 * @author Gerardo Portillo
 */
public class Producto {
    //atributos
    public String codigo;
    public String nombre;
    public String fabricante;
    public int existencias;
    public boolean importado;
    //constructores
    //constr. de 5 param
    public Producto(String codigo, String nombre, 
            String fabricante, int existencias,
            boolean importado){
       this.codigo = codigo; 
       this.nombre = nombre;
       this.fabricante = fabricante;
       this.existencias = existencias;
       this.importado = importado;
    }
    //constr. de 4 param
    public Producto(String codigo, String nombre, 
            String fabricante, int existencias){
        //mandar a llamar al constr. de 5 param.
        //y a importado le mandamos como valor inicial: false
        this(codigo, nombre, fabricante, existencias, false);
    }
}
