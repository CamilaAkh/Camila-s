package homework8task3;
import java.util.Scanner;

public class Counter {

    private static int count = 0; //счетчик созданных объектов

    static class Counted {

        public Counted(){ //конструктор с счетчиком
            count++;
        }

    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число создаваемых объектов");
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            new Counted();
        }

        System.out.println("Количество созданных объектов класса: " + count);
    }
}
