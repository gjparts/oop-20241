package pkg08_herencia2;
import java.util.LinkedList;
import java.util.Calendar;
public class Video extends Media {
    //atributos
    public String codec;
    public int chapters;
    public String[] audio;
    public LinkedList<Subtitle> subtitles;
    //constructor
    public Video(String name, int size, String extension,
                 Calendar creationDate, Author author, int duration,
                 String codec, int chapters, String[] audio){
        //construir la super clase
        super(name, size, extension, creationDate, author, duration);
        //inicializar los atributos de la clase hijo
        this.codec = codec;
        this.chapters = chapters;
        this.audio = audio;
        this.subtitles = new LinkedList();
    }
}
