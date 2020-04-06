package homework8task2;
import java.util.Scanner;
public class Calculator {

    public static int summation(int a, int b){
        return (a+b);
    }

    public static int subtraction(int a, int b){
        return (a-b);
    }

    public static int multiplication(int a, int b){
        return (a*b);
    }

    public static float division(float a, float b){
        return (a/b);
    }

    public static float percentage(float a, float b){
        return (a/b*100);
    }

    public static float summation(float a, float b){
        return (a+b);
    }

    public static float subtraction(float a, float b){
        return (a-b);
    }

    public static float multiplication(float a, float b){
        return (a*b);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите два целых числа для вычисления над ними арифметических операций");
        int inta = scn.nextInt(), intb = scn.nextInt();
        System.out.println("Сумма двух чисел:" + summation(inta,intb));
        System.out.println("Разность двух чисел: " + subtraction(inta,intb));
        System.out.println("Произведение двух чисел: " + multiplication(inta,intb));
        System.out.println("Частное двух чисел: " + division(inta,intb));
        System.out.println("Процентное соотношение первого числа относительно второго:" + percentage(inta,intb));

        System.out.println("Введите два дробных числа для вычисления над ними арифметических операций");
        float floata = scn.nextFloat(), floatb = scn.nextFloat();
        System.out.println("Сумма двух чисел:" + summation(floata,floatb));
        System.out.println("Разность двух чисел: " + subtraction(floata,floatb));
        System.out.println("Произведение двух чисел: " + multiplication(floata,floatb));
        System.out.println("Частное двух чисел: " + division(floata,floatb));
        System.out.println("Процентное соотношение первого числа относительно второго:" + percentage(floata,floatb));
    }
}
