package pkg06_multiplicidad;

/**
 * Define a una ubicacion geofrafica
 * @author Gerardo Portillo
 */
public class Direccion {
    //atributos
    private Barrio colonia;
    public String calle;
    public String avenida;
    public String bloque;
    public String casa;
    //constructor
    public Direccion(Barrio colonia) {
        this.setColonia(colonia);
        //llenar los demas atributos con datos default
        this.calle = "N/A";
        this.avenida = "N/A";
        this.bloque = "N/A";
        this.casa = "N/A";
    }
    //metodos
    public Barrio getColonia() {
        return this.colonia;
    }
    public void setColonia(Barrio colonia) {
        if( colonia == null )
            throw new IllegalArgumentException("colonia no debe ser null");
        else
            this.colonia = colonia; //se acepta
    }
}
