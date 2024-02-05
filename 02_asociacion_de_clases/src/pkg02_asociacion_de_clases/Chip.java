package pkg02_asociacion_de_clases;

/**
 * Define a una SIM Card para telefonia celular
 * @author Gerardo Portillo
 */
/*La relacion entre Chip y Operador es por
composicion (rombo lleno) por lo tanto el proveedor del Chip
no puede ser nulo, siempre debe estar lleno.
Se deja privado para evitar que lo dejen nulo desde otro ambito.*/
public class Chip {
    //atributos
    private Operador proveedor;
    public int numeroTelefonico;
    //constructor
    public Chip(Operador proveedor, int numeroTelefonico) {
        //el proveedor viene por composicion, por lo
        //tanto no puede enviarse null para llenarlo.
        if( proveedor == null )
            throw new IllegalArgumentException("proveedor debe definirse.");
        else
            this.proveedor = proveedor; //se acepta
        
        this.numeroTelefonico = numeroTelefonico;
    }
    //metodos
    /**
     * Retorna el proveedor de telefonia del chip
     * @return un objeto de clase Operador
     */
    public Operador getProveedor() {
        return this.proveedor;
    }
    
}
