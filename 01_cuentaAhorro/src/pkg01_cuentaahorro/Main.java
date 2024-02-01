package pkg01_cuentaahorro;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CuentaAhorro c1 = new CuentaAhorro("Gerardo", "14141");
        int opcion;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1) Depositar");
            System.out.println("2) Retirar");
            System.out.println("3) Ver Saldo");
            System.out.println("4) Salir");
            System.out.print("Digite una opcion: ");
            opcion = s.nextInt();
            if( opcion == 1 ) hacerDeposito(c1);
            if( opcion == 2 ) hacerRetiro(c1);
            if( opcion == 3 ) consultarSaldo(c1);
        }while(opcion != 4);
    }
    //metodos
    public static void hacerDeposito(CuentaAhorro cuenta){
        Scanner s = new Scanner(System.in);
        System.out.println("************* DEPOSITAR");
        System.out.print("Digitar el monto: ");
        try{
            cuenta.depositar( s.nextFloat() );
        }catch(Exception ex){
            System.out.println( ex.getMessage() );
        }
    }
    public static void hacerRetiro(CuentaAhorro cuenta){
        Scanner s = new Scanner(System.in);
        System.out.println("************* RETIRAR");
        System.out.print("Digitar el monto: ");
        try{
            cuenta.retirar( s.nextFloat() );
        }catch(Exception ex){
            System.out.println( ex.getMessage() );
        }
    }
    public static void consultarSaldo(CuentaAhorro cuenta){
        System.out.println("************* CONSULTA DE SALDO");
        System.out.println("Saldo actual: "+cuenta.getSaldo());
    }
}
