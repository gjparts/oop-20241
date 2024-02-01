/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_cuentaahorro;

/**
 * Representa a una cuenta de ahorro
 * @author Gerardo Portillo
 */
public class CuentaAhorro {
    //atributos
    public String nombreCliente;
    public String numeroCuenta;
    private float saldo;
    //constructores
    public CuentaAhorro(String nombreCliente, String numeroCuenta){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }
    //metodos
    /**
     * Retorna la cantidad de dinero en la cuenta de ahorro
     * @return un valor float
     */
    public float getSaldo(){
        return this.saldo;
    }
    /**
     * Suma mas dinero al saldo de la cuenta de ahorro
     * @param monto el monto a sumar, debe ser >= 0
     */
    public void depositar(float monto){
        //validacion
        if( monto < 0 )
            throw new IllegalArgumentException("Monto a depositar debe ser positivo.");
        else
            this.saldo += monto; //se acepta y se suma al saldo de la cuenta
    }
    /**
     * Resta dinero al saldo de la cuenta de ahorro
     * @param monto el monto a restar, debe ser >= 0
     */
    public void retirar(float monto){
        //validaciones
        if( monto < 0 )
            throw new IllegalArgumentException("Monto a retirar debe ser positivo.");
        else{
            if( monto > this.saldo )
                throw new IllegalArgumentException("No puede retirar mas de lo que hay.");
            else
                this.saldo -= monto; //se acepta y se resta al saldo de la cuenta
        }
    }
}
