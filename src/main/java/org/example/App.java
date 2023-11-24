package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException {
        List<Book> books = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("books"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] paramLine = line.split(",");
            books.add(new Book(Integer.parseInt(paramLine[0].trim()), paramLine[1].trim(), paramLine [2].trim(), Integer.parseInt(paramLine[3].trim())));
        }
        Menu menu = new Menu();
        menu.showMenu();

        ListHandler handler = new ListHandler(books, menu.choice);
    }
}
