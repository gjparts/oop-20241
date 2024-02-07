package pkg04_facturacion;

/**
 * Define a un producto
 * @author Gerardo Portillo
 */
public class Producto {
    //atributos
    public String nombre;
    private CategoriaProducto categoria;
    public float precioVenta;
    //constructor
    public Producto(String nombre,
            CategoriaProducto categoria,
            float precioVenta) {
        //categoria es obligatoria
        if( categoria == null )
            throw new IllegalArgumentException("categoria no puede ser null");
        else
            this.categoria = categoria; //se acepta
        
        this.nombre = nombre;
        this.precioVenta = precioVenta;
    }
    //metodos
    /**
     * Devuelve la categoria del producto
     * @return un objeto de clase CategoriaProducto
     */
    public CategoriaProducto getCategoria() {
        return this.categoria;
    } 
}
