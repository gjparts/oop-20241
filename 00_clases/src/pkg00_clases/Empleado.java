/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00_clases;

/**
 * Define a un empleado de una organizacion
 * @author Gerardo Portillo
 * @since 2024-01-29
 * @version 1.0.0
 */
public class Empleado {
    //atributos
    public String nombre;
    private int edad;
    private char genero;
    private char estadoCivil;
    private char contrato;
    private float salario;
    //constructores
    public Empleado(String nombre, int edad, char genero,
            char estadoCivil, char contrato, float salario){
        this.nombre = nombre;
        this.setEdad(edad); //escribir la edad por medio del set
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.contrato = contrato;
        this.salario = salario;
    }
    //metodos
    /**
     * Metodo set para establecer la edad
     * @param edad solo admite numeros entre 18 y 100
     */
    public void setEdad(int edad){
        if( edad >= 18 && edad <= 100 )
            this.edad = edad;   //se acepta
        else
            throw new IllegalArgumentException("Edad debe estar entre 18 y 100");
    }
    /**
     * Retorna la edad
     * @return un numero entero
     */
    public int getEdad(){
        return this.edad;
    }
}
