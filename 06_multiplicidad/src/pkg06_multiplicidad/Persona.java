package pkg06_multiplicidad;

/**
 * Define a una persona en este sistema
 * @author Gerardo Portillo
 */
import java.util.LinkedList; //lista vinculada
public class Persona {
    //atributos
    public String identidad;
    public String nombre;
    public int telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public Mascota[] mascotas;
    public LinkedList<Diploma> diplomas; //lista vinculada que solo
                                         //acepta objetos de clase Diploma
    //constructor
    public Persona(String identidad, String nombre, int telefono) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.telefono = telefono;
        //inicializar con datos default los demas atributos
        this.direccion = null;
        this.empresaLabora = null;
        this.mascotas = null;
        //inicializar la lista vinculada de diplomas
        this.diplomas = new LinkedList();
    }
    //imprimir
    public void imprimir(){
        System.out.println("**** PERFIL ****");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Identidad: "+this.identidad);
        System.out.println("Telefono: "+this.telefono);
        if( this.direccion != null ){
            System.out.println("Dirección:");
            System.out.println("\tColonia: "+this.direccion.getColonia().nombre);
            System.out.println("\tCalle: "+this.direccion.calle);
            System.out.println("\tAve.: "+this.direccion.avenida);
            System.out.println("\tBloque: "+this.direccion.bloque);
            System.out.println("\tCasa: "+this.direccion.casa);
        }
        if( this.empresaLabora != null ){
            System.out.println("Empresa donde labora:");
            System.out.println("\tNombre: "+this.empresaLabora.nombre);
            System.out.println("\tColonia: "+this.empresaLabora.getDireccion().getColonia().nombre);
            System.out.println("\tCalle: "+this.empresaLabora.getDireccion().calle);
            System.out.println("\tAve.: "+this.empresaLabora.getDireccion().avenida);
            System.out.println("\tBloque: "+this.empresaLabora.getDireccion().bloque);
            System.out.println("\tCasa: "+this.empresaLabora.getDireccion().casa);
        }
        //imprimir el array de mascotas
        if( this.mascotas != null ){
            System.out.println("Mascotas:");
            for( int i = 0; i < this.mascotas.length; i++ ){
                if( mascotas[i] != null ){
                    System.out.println("\tNombre: "+this.mascotas[i].nombre);
                    System.out.println("\tEspecie: "+this.mascotas[i].especie);
                    System.out.println();
                }
            }
        }
        //imprimir la lista vinculada de diplomas
        if( this.diplomas != null ){
            if( this.diplomas.size() > 0 ) System.out.println("Diplomas:");
            for( int i = 0; i < this.diplomas.size(); i++ ){
                if( this.diplomas.get(i) != null ){
                    System.out.println("\tInstitucion: "+this.diplomas.get(i).institucion);
                    System.out.println("\tNombre: "+this.diplomas.get(i).nombre);
                    System.out.println();
                }
            }
        }
    }
}
