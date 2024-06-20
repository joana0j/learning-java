package br.com.things;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookReleaseYear;

    //set
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public void setBookReleaseYear(int bookReleaseYear) {
        this.bookReleaseYear = bookReleaseYear;
    }

    //get
    public String getBookTitle() {
        return bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public int getBookReleaseYear() {
        return bookReleaseYear;
    }

    public void displayDatasheet() {
        System.out.println("---------- BOOK SHELF ----------");
        System.out.println("Title: " + bookTitle);
        System.out.println("Release Year: " + bookReleaseYear);
        System.out.println("Author: " + bookAuthor);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Book firstBook = new Book();

        firstBook.setBookTitle("Pride and Prejudice");
        firstBook.setBookReleaseYear(1813);
        firstBook.setBookAuthor("Jane Austen");
        firstBook.displayDatasheet();
    }
}

