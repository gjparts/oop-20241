/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_polimorfismo2;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
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
    //metodos
    @Override
    public void print(){
        super.print();
        System.out.println("Author: "+this.author.name);
        if( this.modificationDate != null ){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("Modification Date: "+formato.format(this.modificationDate.getTime()));
        }
        System.out.println("Number of words: "+this.words);
    }
}
