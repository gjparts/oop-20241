package pkg08_herencia2;
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
}
