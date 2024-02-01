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
        
        Carro c1 = new Carro("Honda", "Civic", "Negro", 2004);
        //debe mandar los 4 param: Carro c2 = new Carro("","");
        Carro c3 = new Carro("Nissan", "Sentra", 2022);
        System.out.println("Color de c3: "+c3.color);
        c3.color = "Blanco";
        System.out.println("Color de c3: "+c3.color);
        
        Producto pr1 = new Producto("CC01", "Coca Cola 3L", "Cerveceria HN", 5);
        System.out.println("********************************");
        System.out.println("Codigo de pr1: "+pr1.codigo);
        System.out.println("Nombre de pr1: "+pr1.nombre);
        System.out.println("Fabricante de pr1: "+pr1.fabricante);
        System.out.println("Existencias de pr1: "+pr1.existencias);
        System.out.println("pr1 es Importado? "+pr1.importado);
        
        Producto pr2 = new Producto("T01", "Tomate Unidad", "FRUVETSA", 100, true);
        System.out.println("********************************");
        System.out.println("Codigo de pr2: "+pr2.codigo);
        System.out.println("Nombre de pr2: "+pr2.nombre);
        System.out.println("Fabricante de pr2: "+pr2.fabricante);
        System.out.println("Existencias de pr2: "+pr2.existencias);
        System.out.println("pr2 es Importado? "+pr2.importado);
        
        System.out.println("********************************");
        //puede cambiar el atributo de importado para pr1 desde fuera del constructor
        pr1.importado = true;
        System.out.println("pr1 es Importado? "+pr1.importado);
        
        //usar metodos
        c1.imprimir();
        c3.imprimir();
        System.out.println("c1 paga ecoTasa? "+c1.pagaEcoTasa());
        System.out.println("c3 paga ecoTasa? "+c3.pagaEcoTasa());
        
        p1.imprimir(false);
        p1.imprimir(true);
        
        Empleado e1 = new Empleado("Gerardo", 18, 'M', 'C', 'P', 2000);
        e1.setEdad(42);
        System.out.println("La edad de e1 es "+e1.getEdad());
        e1.setSalario(3000);
        e1.setEdad(41);
        e1.setEstadoCivil('D');
        e1.setContrato('T');
        e1.imprimir();
        
    }
    
}
