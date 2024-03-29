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
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    public String pais;
    //constructores
    //constructor sin parametros
    public Persona(){
        //inicializar los atributos con valores predeterminados
        this.nombre = "No tiene";
        this.edad = 0;
        this.genero = 'X';
        this.pais = "No definido";
    }
    //constructor con cuatro parametros
    public Persona(String nombre, int edad, char genero, String pais){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
    }
    //metodos
    public void imprimir(boolean enIngles){
        System.out.println("***** "+(enIngles == true ? "PROFILE" : "PERFIL")+" *****");
        System.out.println((enIngles == true ? "Name" : "Nombre")+": "+this.nombre);
        System.out.println((enIngles == true ? "Age" : "Edad")+": "+this.edad);
        System.out.println((enIngles == true ? "Gender" : "Genero")+": "+this.genero);
        System.out.println((enIngles == true ? "Country" : "Pais")+": "+this.pais);
    }
}
