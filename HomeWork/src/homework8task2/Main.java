package homework8task2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите два целых числа для вычисления над ними арифметических операций");
        int inta = scn.nextInt(), intb = scn.nextInt();
        System.out.println("Сумма двух чисел:" + Calculator.summation(inta,intb));
        System.out.println("Разность двух чисел: " + Calculator.subtraction(inta,intb));
        System.out.println("Произведение двух чисел: " + Calculator.multiplication(inta,intb));
        System.out.println("Частное двух чисел: " + Calculator.division(inta,intb));
        System.out.println("Процентное соотношение первого числа относительно второго:" + Calculator.percentage(inta,intb));

        System.out.println("Введите два дробных числа для вычисления над ними арифметических операций");
        float floata = scn.nextFloat(), floatb = scn.nextFloat();
        System.out.println("Сумма двух чисел:" + Calculator.summation(floata,floatb));
        System.out.println("Разность двух чисел: " + Calculator.subtraction(floata,floatb));
        System.out.println("Произведение двух чисел: " + Calculator.multiplication(floata,floatb));
        System.out.println("Частное двух чисел: " + Calculator.division(floata,floatb));
        System.out.println("Процентное соотношение первого числа относительно второго:" + Calculator.percentage(floata,floatb));
    }
}
