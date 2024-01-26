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
public class Carro {
    //atributos
    public String marca;
    public String modelo;
    public String color;
    public int anio;
    //constructores
    public Carro( String marca, String modelo, String color, int anio ){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }
    public Carro( String marca, String modelo, int anio ){
        //esto de aqui se puede optimizar:
        this.marca = marca;
        this.modelo = modelo;
        this.color = "No determinado";
        this.anio = anio;
    }
}
