package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ListHandler {
    public ListHandler(List<Book> list, int action) throws IOException {
        listHandle(list, action);
    }

    public void listHandle(List<Book> list, int action) throws IOException {
        switch (action) {
            case 1: printAll(list);
                    break;
            case 2: bookAdd(list);
                    break;
            case 3: deleteBook(list);
                    break;
            case 4: searchByTitle(list);
                    break;
            case 5: System.out.println("Завершение работы");
                    break;

        }
    }

    public void printAll(List<Book> list) {
        for (Book book : list) {
            System.out.println(book.toString());
        }
    }

    private void bookAdd(List<Book> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название книги:");
        String title = reader.readLine();
        System.out.println("Введите автора книги:");
        String author = reader.readLine();
        System.out.println("Введите количество страниц");
        int numberOfPages = Integer.parseInt(reader.readLine());
        int id = list.size() + 1;

        list.add(new Book(id, title, author, numberOfPages));

        BufferedWriter writer = new BufferedWriter(new FileWriter("books", true));
        writer.write( id + ", " + title + ", " + author + ", " + numberOfPages + "\n");
        writer.close();

        System.out.println("Добавлена книга:");
        System.out.println(list.get(list.size() - 1).toString());

    }

    private void deleteBook(List<Book> list) throws IOException {
        System.out.println("Введите номер книги в списке:");
        int numberOfDeletable;
        Scanner sc = new Scanner(System.in);
        numberOfDeletable = sc.nextInt();
        sc.close();
        list.remove(numberOfDeletable - 1);
        FileWriter rewriter = new FileWriter("books");
        rewriter.write("");
        BufferedWriter writer = new BufferedWriter(new FileWriter("books", true));
        for (int i = 0; i < list.size(); i++) {
            writer.write((i + 1) + ", " + list.get(i).getTitle() + ", " + list.get(i).getAuthor() + ", "
                    + list.get(i).getNumberOfPages() + "\n");
        }
        writer.close();
    }

    private void searchByTitle(List<Book> list) throws IOException {
        System.out.println("Введите название:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();
        for (Book book : list) {
            if (book.getTitle().contains(key)) {
                System.out.println(book.toString());
            }
        }
    }

}
