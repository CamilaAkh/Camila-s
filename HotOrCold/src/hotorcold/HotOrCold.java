package hotorcold;
import java.util.Scanner;
import java.lang.Math;

public class HotOrCold {
    public static void main(String[] args) {
        int x;
        x = (int) (Math.random() * 101);
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int next = scn.nextInt();
        int difference = 100;
        int previous = 0;
        int nextdifference;
        boolean chek = true;
        do {
            nextdifference = Math.abs(next - x);
            if (nextdifference < difference) {
                if (next == x) {
                    chek = false;
                    System.out.print("Верно! Загаданное число: ");
                    System.out.println(next);
                } else {
                    previous = next;
                    difference = nextdifference;
                    System.out.println("горячо");
                    System.out.println("Хотите ли продолжить угадывать число? '1' - продолжить; '2' - прервать игру");
                    int query = scn.nextByte();
                    switch (query) {
                        case 1:
                            chek = true;
                            break;
                        case 2:
                            chek = false;
                            break;
                    }
                    if (chek) {
                        System.out.println("Введите следующее число");
                        next = scn.nextInt();
                    }
                }
            } else {
                System.out.println("холодно");
                System.out.println("Хотите ли продолжить угадывать число? '1' - продолжить; '2' - прервать игру");
                int query = scn.nextByte();
                switch (query) {
                    case 1:
                        chek = true;
                        break;
                    case 2:
                        chek = false;
                        break;
                }
                if (chek) {
                    System.out.println("Попробуйте другое число");
                    next = scn.nextInt();
                }
            }
        }
        while (chek);
        System.out.print("Проверка. x = ");
        System.out.println(x);
    }
}
