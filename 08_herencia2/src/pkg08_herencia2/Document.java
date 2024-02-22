/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_herencia2;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Calendar;
public class Document extends File {
    //atributos
    public Author author;
    public Calendar modificationDate;
    public int words;
    //constructor
    public Document(String name, int size, String extension,
                    Calendar creationDate, Author author, int words){
        //construir la supoer clase
        super(name, size, "Document File", extension, creationDate);
        //inicializar los atributos de esta clase
        this.author = author;
        this.words = words;
        this.modificationDate = null;
    }
}
