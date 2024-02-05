package pkg02_asociacion_de_clases;

/**
 * DEfine a una bateria para equipos electronicos
 * @author Gerardo Portillo
 */
public class Bateria {
    //atributos
    private Fabricante marca;
    public float miliAmperios;
    //constructor
    public Bateria(Fabricante marca, float miliAmperios) {
        this.setMarca(marca);
        this.miliAmperios = miliAmperios;
    }
    //metodos
    /**
     * Establece la marca de la bateria
     * @param marca un objeto de clase Fabricante
     */
    public void setMarca(Fabricante marca) {
        //como es asociacion por composicion, evitamos que marca
        //sea definida como null
        if( marca == null )
            throw new IllegalArgumentException("marca no puede ser null.");
        else
            this.marca = marca; //se acepta
    }
    /**
     * Retorna la marca de la bateria
     * @return un objeto de clase Fabricante
     */
    public Fabricante getMarca() {
        return this.marca;
    }
}
