package org.example;

import java.util.Scanner;

public class Menu {
    int choice;

    public void showMenu() {
        System.out.println("Возможные действия:");
        System.out.println("1 - отобразить весь список");
        System.out.println("2 - добавить книгу");
        System.out.println("3 - удалить книгу");
        System.out.println("4 - выполнить поиск по названию");
        System.out.println("5 - выход");
        System.out.print("Введите число:");

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        System.out.println("");
    }
}
