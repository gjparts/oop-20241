package pkg07_herencia1;
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Gerardo",42,'M');
        p1.saludar();
        System.out.println("********************");
        Estudiante e1 = new Estudiante("Josue", "20012002049", "Ing. Industrial");
        e1.edad = 21;
        e1.estudiar();
        e1.saludar();
        System.out.println("********************");
        Empleado em1 = new Empleado(12000, "Ayudante");
        em1.nombre = "Dios Eolo";
        em1.edad = 19;
        em1.genero = 'M';
        em1.saludar();
        em1.trabajar();
        System.out.println("mi salario es "+em1.salario);
    }    
}
