package homework4task1;
import java.util.Scanner;

public class HomeWork4Task1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Привет, я умею находить минимальное из двух вещественных чисел. Давай начнем!");
        System.out.println("Введи первое число для поиска минимума");
        float a = scn.nextFloat();
        System.out.println("Введи второе число для поиска минимума");
        float b = scn.nextFloat();
        System.out.print("Минимальное из двух чисел: ");
        System.out.println((a<b)?a:b);
    }
}
