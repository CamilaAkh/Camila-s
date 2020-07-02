package homework22;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Введите последовательно имя и возраст первого человека");
            Scanner scn = new Scanner(System.in);
            Person first = new Person(scn.next(),scn.nextInt());
            System.out.println("Введите последовательно имя и возраст второго человека");
            Person second = new Person(scn.next(),scn.nextInt());
            Comparator<Person> comparator = new PersonSuperComparator();
            System.out.println(comparator.compare(first,second));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }
}
