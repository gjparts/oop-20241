/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_calendar;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Calendar; //importar la clase
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear un objeto de clase Calendar
        Calendar fecha1 = Calendar.getInstance();
        //que fecha y hora tiene?
        System.out.println( fecha1.get(Calendar.YEAR) );
        System.out.println( fecha1.get(Calendar.MONTH) );
        System.out.println( fecha1.get(Calendar.DAY_OF_MONTH) );
        System.out.println( fecha1.get(Calendar.HOUR) );
        System.out.println( fecha1.get(Calendar.MINUTE) );
        System.out.println( fecha1.get(Calendar.SECOND) );
        //crear un objeto Calendar con fecha determinada
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1982, 9, 15, 0, 0, 0);
        System.out.println("***********************");
        System.out.println( fecha2.get(Calendar.YEAR) );
        System.out.println( fecha2.get(Calendar.MONTH) );
        System.out.println( fecha2.get(Calendar.DAY_OF_MONTH) );
        System.out.println( fecha2.get(Calendar.HOUR) );
        System.out.println( fecha2.get(Calendar.MINUTE) );
        System.out.println( fecha2.get(Calendar.SECOND) );
    }
    
}
