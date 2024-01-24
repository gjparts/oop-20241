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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear un objeto de clase Persona
        Persona p1 = new Persona();
        
        System.out.println("Nombre de p1: "+p1.pais);
        
        p1.nombre = "Gerardo Portillo";
        p1.genero = 'M';
        p1.edad = 42;
        p1.pais = "Honduras";
        System.out.println("Direccion de memoria para p1: "+p1);
        System.out.println("Nombre de p1: "+p1.nombre);
        System.out.println("Edad de p1: "+p1.edad);
        
        Persona p2 = new Persona();
        System.out.println("********************************");
        System.out.println("Nombre de p2: "+p2.nombre);
        System.out.println("Edad de p2: "+p2.edad);
        System.out.println("Genero de p2: "+p2.genero);
        System.out.println("Pais de p2: "+p2.pais);
        
        Persona p3 = new Persona("Irene",41,'F',"Honduras");
        System.out.println("********************************");
        System.out.println("Nombre de p3: "+p3.nombre);
        System.out.println("Edad de p3: "+p3.edad);
        System.out.println("Genero de p3: "+p3.genero);
        System.out.println("Pais de p3: "+p3.pais);
        
    }
    
}
