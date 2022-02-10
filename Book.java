import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.awt.*;
/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class Book extends PrintedItem
{
    // instance variables 
    private String author;
    private long isbn;

    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        super();
        author = "";
        isbn = 0;
    }

    /**
     * Constructor for objects of class Book
     */
    public Book(String author, long isbn)
    {
        super();
        this.author = author;
        this.isbn = isbn;
    }

    /**
     * set auther
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }

    /**
     * Return the author of the book in this LibraryItem .
     * 
     * @return The book's author.
     */
    public String getAutoer()
    {
        return author;
    }

    /**
     * set isbn
     */
    public void setIsbn(long isbn)
    {
        this.isbn = isbn;
    }

    /**
     * Return the isbs of the book in this LibraryItem .
     * 
     * @return The book's isbn.
     */
    public long getIsbn()
    {
        return isbn;
    }

    public void readData(Scanner scanner)
    {
        author = scanner.next();
        //System.out.println(author);
        isbn  = scanner.nextLong();
        //System.out.println(isbn);
        super.readData(scanner);
    }

    /**
     * print details of the library item 
     */
    public void printDetails()
    {
        System.out.print("Type_Book: Author: " + author +", Iban: " + isbn + ", ");
        super.printDetails();
    }
}
