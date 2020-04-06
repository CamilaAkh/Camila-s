package homework8task3;
import java.util.Scanner;

public class HomeWork8Task3 {

    static class Counted {
        protected static int count = 0; //счетчик созданных объектов

        public Counted(){ //конструктор с счетчиком
            count++;
        }

        public int getNumber() {
            return count;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число создаваемых объектов");
        int n = scn.nextInt();
        for(int i=1; i<n; i++){
            new Counted();
        }
        System.out.println("Количество созданных объектов класса: " + new Counted().getNumber());
    }
}
