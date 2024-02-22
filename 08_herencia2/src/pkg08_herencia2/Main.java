package pkg08_herencia2;

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
        doc1.print();
        
        Media m1 = new Media("Multimedios genericos", 548293732,
                "avi", d1, new Author("Kurco Bain", "", ""), 300);
        m1.print();
    }
    
}
