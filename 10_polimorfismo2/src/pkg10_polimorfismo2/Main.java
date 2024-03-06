package pkg10_polimorfismo2;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar d1 = Calendar.getInstance();
        d1.set(2024, 1, 2);
        File f1 = new File("tarea", 1200, "Text File", "txt", d1);
        f1.print();
        
        Author a1 = new Author("Gerardo", "califik.com", "g@g.com");
        Document doc1 = new Document("Tesis", 890654, "docx",
                Calendar.getInstance(), a1, 1900);
        doc1.modificationDate = Calendar.getInstance();
        doc1.print();
        
        Media m1 = new Media("Multimedios genericos", 548293732,
                "avi", d1, new Author("Kurco Bain", "", ""), 300);
        m1.print();
        
        Audio au1 = new Audio("Right Now", 123456, "mp3",
               Calendar.getInstance(), a1, 180, "Van Halen", "1984", 1984, 0);
        au1.print();
        
        //arreglo de pistas de audio
        String[] pistas = {"English","Spanish"};
        
        Video v1 = new Video("Openheimer", 345623423, "mkv", d1, a1, 10800,
                "Matroska Video", 0, pistas);
        v1.subtitles.add( new Subtitle("English", a1) );
        
        Subtitle st1 = new Subtitle("Spanish", a1);
        v1.subtitles.add( st1 );
        v1.print();
        
        Video v2 = new Video("Barbie", 565623423, "mp4", d1, a1, 9600,
                "H264", 0, new String[]{"English","Spanish","Chinese"});
        v2.print();
    }
    
}
