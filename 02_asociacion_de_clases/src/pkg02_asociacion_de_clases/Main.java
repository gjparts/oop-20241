package pkg02_asociacion_de_clases;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objetos de ejemplo
        Operador tigo =  new Operador("TIGO", "Honduras");
        Operador claro =  new Operador("Claro C.A.", "Honduras");
        
        Fabricante samsung = new Fabricante("SAMSUNG", "Korea", "Algun Kim");
        Fabricante sony = new Fabricante("Sony","Japon","No se");
        Fabricante apple = new Fabricante("Apple","USA","Tim Cook");
        
        Bateria b1 = new Bateria(samsung, 5000);
        Bateria b2 = new Bateria(samsung, 3500);
        Bateria b3 = new Bateria(sony, 6000);
        Bateria b4 = new Bateria( new Fabricante("TSMC","Taiwan","Alguien"), 6500 );
        
        Chip sim1 = new Chip(tigo, 99159915);
        Chip sim2 = new Chip(tigo, 97479747);
        Chip sim3 = new Chip(new Operador("Digicel", "Honduras"), 88988898);
        Chip sim4 = new Chip(claro, 33443344);
        
        Smartphone s21 = new Smartphone(samsung, "Galaxy S21", 256, 8, b1, sim1, null);
        s21.imprimir();
        
        Smartphone iPhone15 = new Smartphone(apple,"iPhone 15", 512, 16, b4, sim2, sim4);
        iPhone15.imprimir();
    }
    
}
