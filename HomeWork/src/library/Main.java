package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book [] myLibrary = new Book[100];
        System.out.println("Выберите действие:\n0.Выйти из библиотеки\n1.Добавить книгу\n2.Посмотреть список книг\n3.Посмотреть информацию о книге под номером...\n " );
        Scanner scn = new Scanner(System.in);
        int actionChoice = scn.nextInt();
    }
}
