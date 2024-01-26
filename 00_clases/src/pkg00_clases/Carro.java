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
import java.util.Calendar;
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
    //metodos
    public void imprimir(){
        System.out.println("******** CARRO ********");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Color: "+this.color);
        System.out.println("Año: "+this.anio);
    }
    public boolean pagaEcoTasa(){
        //si el carro tiene antigüedad de mas de 10 años a la fecha de hoy
        //restar la diferencia entre el año de la PC menos el año del carro
        if( Calendar.getInstance().get(Calendar.YEAR)-this.anio > 10 )
            return true;
        else
            return false;
    }
}
