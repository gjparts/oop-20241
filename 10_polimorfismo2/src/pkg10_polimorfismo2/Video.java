package pkg10_polimorfismo2;
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
    //metodos
    @Override
    public void print(){
        super.print();
        System.out.println("Codec: "+this.codec);
        System.out.println("Chapters: "+this.chapters);
        //pistas de audio disponibles
        if( this.audio != null ){
            if( this.audio.length > 0 ){
                System.out.println("Audio tracks:");
                for( int i = 0; i < this.audio.length; i++ ){
                    System.out.println( "\t* "+this.audio[i] );
                }
            }
        }
        //subtitulos disponibles
        if( this.subtitles != null ){
            if( this.subtitles.size() > 0 ){
                System.out.println("Subtitles:");
                for( int i = 0; i < this.subtitles.size(); i++ ){
                    if( this.subtitles.get(i) != null ){
                        System.out.print("\t* "+this.subtitles.get(i).language);
                        System.out.println(" ("+this.subtitles.get(i).author.name+")");
                    }
                }
            }
        }
    }
}
