package homework4task4;
import java.util.Scanner;
public class HomeWork4Task4 {
    public static void printArithmeticProgression(int a1, int d, int n){
        System.out.print("Первые ");
        System.out.print(n);
        System.out.println(" членов арифмитической прогрессии:");
        for (int i=1; i<=n; i++){
            System.out.print("a");
            System.out.print(i);
            System.out.print("=");
            System.out.println(a1+(i-1)*d);
        }
    }
    public static int sumOfArithmeticProgression(int a1, int d, int n){
        return ((2*a1+d*(n-1))*n/2);
    }
    public static void printGeometricProgression(int b1, int q, int n){
        System.out.print("Первые ");
        System.out.print(n);
        System.out.println(" членов геометрической прогрессии:");
        for (int i=1; i<=n; i++){
            System.out.print("b");
            System.out.print(i);
            System.out.print("=");
            System.out.println(b1*((int)Math.pow(q,i-1)));
        }
    }
    public static long sumOfGeometricProgression(int b1, int q, int n){
        if (q==1)
            return(b1*n);
        else
            return ((b1*((int)Math.pow(q,n)-1))/(q-1));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Привет, я умею вычислять первые n членов арифметической и геометрической прогрессии и выводить их сумму.");
        System.out.println("Давай начнем! Введи '1', если хочешь посчитать арифметическую прогрессию, или '2', если хочешь посчитать геометрическую прогрессию.");
        int choice = scn.nextByte();
        switch (choice){
            case 1:
                System.out.println("Укажите первый член арифметической прогрессии");
                int a1 = scn.nextInt();
                System.out.println("Укажите разность арифметической прогрессии");
                int d = scn.nextInt();
                System.out.println("Укажите количество чисел, для которых будем считать арифметическую прогрессию");
                int n1 = scn.nextInt();
                printArithmeticProgression(a1,d,n1);
                System.out.println();
                System.out.print("Сумма арифметической прогрессии: ");
                System.out.println(sumOfArithmeticProgression(a1,d,n1));
                break;
            case 2:
                System.out.println("Укажите первый член геометрической прогрессии");
                int b1 = scn.nextInt();
                System.out.println("Укажите разность геометрической прогрессии");
                int q = scn.nextInt();
                System.out.println("Укажите количество чисел, для которых будем считать геометрическую прогрессию");
                int n2 = scn.nextInt();
                printGeometricProgression(b1,q,n2);
                System.out.println();
                System.out.print("Сумма геометрической прогрессии: ");
                System.out.println(sumOfGeometricProgression(b1,q,n2));
                break;
            default:
                System.out.println("Ошибка! Неверно введеное число");
        }
    }
}
