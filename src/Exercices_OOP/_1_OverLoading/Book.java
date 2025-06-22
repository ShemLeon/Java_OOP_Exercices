package Exercices_OOP._1_OverLoading;// import unit4.collectionsLib.Node;

public class Book {
    public String title;
    public Book(String title) {
        this.title = title;
    }
}

class Library {
    public Book book;
    public Library(String title){
        this.book = new Book(title);
    }
}

class Test{
    public static void main(String[] args) {
    Library library = new Library("Java Programming");
    System.out.println("Book Title: " + library.book.title);
    //    Book Title: Java Programming
    }
}