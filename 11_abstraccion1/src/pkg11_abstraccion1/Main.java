
package pkg11_abstraccion1;
public class Main {
    public static void main(String[] args) {
        //no es posible instanciar una clase abstracta
        //por medios convencionales
        //SerVivo s1 = new SerVivo();
        
        Gato g1 = new Gato("Chispita");
        g1.vivir();
        
        g1.hablar();
        g1.desplazarse();
        g1.dormir();
        g1.alimentarse();
        
        //si es posible apuntar una variable del tipo de una clase abstracta
        //hacia un objeto instanciado de una clase que hereda a la clase abstracta
        //con la limitante que no se tiene acceso a los miembros del objeto
        //instanciado, solo a los de la clase abstracta
        SerVivo s1 = new Gato("Misifus");
        System.out.println(s1.especie);
        
        //existe una forma no convencional de poder instanciar
        //una clase abstracta
        //se puede lograr implementando los metodos abstractos en el momento
        //de la declaracion de la variable
        SerVivo s2 = new SerVivo("Canino"){
            @Override
            public void desplazarse(){
                System.out.println("Camina como loco.");
            }
            @Override
            public void hablar(){
                System.out.println("Guau");
            }
            @Override
            public void dormir(){
                System.out.println("Da dos vueltas y se duerme");
            }
            @Override
            public void alimentarse(){
                System.out.println("Come de todo");
            }
        };
        s2.vivir();
        s2.hablar();
    }
    
}
