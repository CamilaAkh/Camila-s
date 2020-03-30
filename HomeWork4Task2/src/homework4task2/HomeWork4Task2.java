package homework4task2;
import java.util.Scanner;

public class HomeWork4Task2 {
    public static boolean numberParity(int a){ //проверка на четность
        return (a%2==0);
    }
    public static boolean numberPositivity(int a){  //проверка на положительность/отрицательность
        return (a>0);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Привет, я умею определять четность и знак числа. Давай начнем! Введи число для анализа");
        int x = scn.nextInt();
        System.out.print("Число ");
        System.out.print(x);
        if (numberParity(x))
            System.out.print(" четное и ");
        else
            System.out.print(" не четное и ");
        if (x==0)
            System.out.println("нулевое");
        else
            if (numberPositivity(x))
                System.out.println("положительное");
            else
                System.out.println("отрицательное");

    }
}
