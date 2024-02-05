package pkg02_asociacion_de_clases;

/**
 * Define a un telefono inteligente
 * @author Gerardo Portillo
 */
public class Smartphone {
    //atributos
    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private Bateria bateria;
    public Chip chip1;
    public Chip chip2;
    //constructor
    public Smartphone(Fabricante marca, String modelo,
            int almacenamiento, int ram, Bateria bateria,
            Chip chip1, Chip chip2) {
        if( marca == null )
            throw new IllegalArgumentException("marca no puede ser null");
        else
            this.marca = marca; //se acepta
        
        if( bateria == null )
            throw new IllegalArgumentException("bateria no puede ser null");
        else
            this.bateria = bateria; //se acepta
        
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.chip1 = chip1;
        this.chip2 = chip2;
    }
    //metodos
    /**
     * Retorna la marca
     * @return un objeto de clase Fabricante
     */
    public Fabricante getMarca() {
        return this.marca;
    }
    /**
     * Retorna el modelo
     * @return un String
     */
    public String getModelo() {
        return this.modelo;
    }
    /**
     * Retorna la capacidad de almacenamiento en GB
     * @return un numero int
     */
    public int getAlmacenamiento() {
        return this.almacenamiento;
    }
    /**
     * Retorna la memoria RAM en GB
     * @return un numero int
     */
    public int getRam() {
        return this.ram;
    }
    /**
     * Retorna la bateria
     * @return un objeto de clase Bateria
     */
    public Bateria getBateria() {
        return this.bateria;
    }
    /**
     * imprime un perfil del SmartPhone
     */
    public void imprimir(){
        System.out.println("********** SMARTPHONE **********");
        System.out.println("Fabricante: "+this.marca.nombre);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Almacenamiento: "+this.almacenamiento);
        System.out.println("RAM: "+this.ram+" GB");
        System.out.println("Bateria:");
        System.out.println("\tMarca: "+this.bateria.getMarca().nombre);
        System.out.println("\tMiliamperios: "+this.bateria.miliAmperios);
        //imprimir los chips que vengan llenos
        if( this.chip1 != null ){
            System.out.println("Chip 1: ");
            System.out.println("\tOperador: "+this.chip1.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip1.numeroTelefonico);
        }
        if( this.chip2 != null ){
            System.out.println("Chip 2: ");
            System.out.println("\tOperador: "+this.chip2.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip2.numeroTelefonico);
        }
    }
}
