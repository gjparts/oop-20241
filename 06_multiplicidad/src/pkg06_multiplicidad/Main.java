package pkg06_multiplicidad;
public class Main {
    public static void main(String[] args) {
        Barrio aurora = new Barrio("La Aurora", "Este", "21101");
        Barrio jardines = new Barrio("Jardines del Valle","Oeste","21102");
        
        Direccion d1 = new Direccion(jardines);
        d1.calle = "Bulevar Universidad";
        
        Empresa unah = new Empresa("UNAH", d1, 12345678);
        
        Mascota m1 = new Mascota("Misingo", "Gato");
        Mascota m2 = new Mascota("Cheems","Perro");
        
        Persona p3 = new Persona("1111","Irene",22222222);
        
        Persona p1 = new Persona("1234", "Gerardo", 99159915);
        p1.conyuge = p3;
        p1.direccion = new Direccion(aurora);
        p1.direccion.calle = "15";
        p1.direccion.avenida = "10";
        p1.empresaLabora = unah;
        Mascota[] mascotas1 = { m1, m2 };
        p1.mascotas = mascotas1;
        
        Diploma di1 = new Diploma("INFOP", "Curso de electronica");
        Diploma di2 = new Diploma("INFOP", "Curso de torno y fresa");
        p1.diplomas.add(di1);
        p1.diplomas.add(di2);
        
        p3.direccion = p1.direccion;
        
        Persona p4 = new Persona("123456", "Josue", 0);
        p1.hijos.add(p4);
        p1.hijos.add(null);
        p1.hijos.add( new Persona("67890","Viena",0) );
        
        p1.imprimir();
        System.out.println(p3.direccion.getColonia().nombre);
        System.out.println("la identidad de Viena es: "+p1.hijos.get(2).identidad);
        
        p1.direccion.casa = "56";
        System.out.println(p3.direccion.casa);
        p3.direccion.casa = "0816";
        System.out.println(p1.direccion.casa);
        
        Persona p2 = new Persona("77777","Filomeno Colinas",78787878);
        p2.imprimir();
    }
    
}
