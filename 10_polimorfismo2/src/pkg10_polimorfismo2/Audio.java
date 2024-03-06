package pkg10_polimorfismo2;
import java.util.Calendar;
public class Audio extends Media {
    public String artist;
    public String album;
    public int year;
    public int track;
    //constructor
    public Audio(String name, int size, String extension,
                    Calendar creationDate, Author author, int duration,
                    String artist, String album,
                    int year, int track){
        //construir la super clase
        super(name, size, extension, creationDate, author, duration);
        //inicializar los atributos de la clase hijo
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.track = track;
    }
    //metodos
    @Override
    public void print(){
        super.print();
        System.out.println("Artist: "+this.artist);
        System.out.println("Album: "+this.album);
        System.out.println("Year: "+this.year);
        System.out.println("Track #: "+this.track);
    }
}
