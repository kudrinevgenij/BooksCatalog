package org.example;

public class Book {
    private int id;
    private String title;
    private String author;
    private int numberOfPages;

    public Book(int id, String title, String author, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return  "№ " + id +
                ", название: '" + title + '\'' +
                ", автор: '" + author + '\'' +
                ", количество страниц " + numberOfPages;
    }
}
