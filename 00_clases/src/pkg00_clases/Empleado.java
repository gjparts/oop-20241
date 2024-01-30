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
        //escribir por medio del set:
        this.setEdad(edad);
        this.setGenero(genero);
        this.setEstadoCivil(estadoCivil);
        this.setContrato(contrato);
        this.setSalario(salario);
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
    /**
     * Metodo set para establecer el salario
     * @param salario un numero float mayor o igual que cero.
     */
    public void setSalario(float salario){
        if( salario >= 0 )
            this.salario = salario; //se acepta
        else
            throw new IllegalArgumentException("Salario debe ser >= 0");
    }
    /**
     * Retorna el salario
     * @return un numero float
     */
    public float getSalario(){
        return this.salario;
    }
    /**
     * Establecer el genero
     * @param genero un char, debe ser M para masculino, F para femenino, X para otros.
     */
    public void setGenero(char genero){
        if( genero == 'M' || genero == 'F' || genero == 'X' )
            this.genero = genero; //se acepta
        else
            throw new IllegalArgumentException("Genero debe ser M F X");
    }
    /**
     * Retorna el genero
     * @return un valor de tipo char
     */
    public char getGenero(){
        return this.genero;
    }
    /**
     * Establece el estado civil
     * @param estadoCivil un valor char que puede ser:
     *                      S soltero
     *                      C casado
     *                      V viudo
     *                      D divorciado
     *                      U union libre
     */
    public void setEstadoCivil(char estadoCivil){
        if( estadoCivil == 'S' || estadoCivil == 'C' || estadoCivil == 'V' ||
                estadoCivil == 'D' || estadoCivil == 'U' )
            this.estadoCivil = estadoCivil; //se acepta
        else
            throw new IllegalArgumentException("Estado civil debe ser S C V D U");
    }
    /**
     * Retorna el estado civil
     * @return un valor char
     */
    public char getEstadoCivil(){
        return this.estadoCivil;
    }
    /**
     * Establece el tipo de contrato
     * @param contrato un valor char que puede ser P para permanente, T para temporal
     */
    public void setContrato(char contrato){
        if( contrato == 'P' || contrato == 'T' )
            this.contrato = contrato; //se acepta
        else
            throw new IllegalArgumentException("contrato debe ser P T");
    }
    /**
     * Retorna el tipo de contrato
     * @return un valor char
     */
    public char getContrato(){
        return this.contrato;
    }
    /**
     * Imprime el perfil del empleado
     */
    public void imprimir(){
        System.out.println("********** PERFIL **********");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Género: "+this.genero);
        System.out.println("Estado Civil: "+this.estadoCivil);
        System.out.println("Contrato: "+this.contrato);
        System.out.println("Salario: "+this.salario);
    }
}
