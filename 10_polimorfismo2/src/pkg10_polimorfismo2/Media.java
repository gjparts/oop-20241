package pkg10_polimorfismo2;
import java.util.Calendar;
public class Media extends File {
    //atributos
    public Author author;
    public int duration;
    //constructor
    public Media(String name, int size, String extension,
                 Calendar creationDate, Author author, int duration){
        //construir la super clase
        super(name, size, "Media File", extension, creationDate);
        //inicializar los atributos de esta clase
        this.author = author;
        this.duration = duration;
    }
    //metodos
    @Override
    public void print(){
        super.print(); //imprimir lo que ya tiene la super clase
        System.out.println("Author: "+this.author.name);
        System.out.println("Duration: "+duration);
    }
}
