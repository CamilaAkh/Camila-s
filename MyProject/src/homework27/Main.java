package homework27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void fibonacсiRecursive(int n) {
        for (int i = 1; i<=n; i++){
            System.out.print(f(i) + " ");
        }
    }

    public static int f(int n) {
        int i;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    public static void fibonacсiIterative(int n){
        int a=1,b=1,c;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i<=n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

        public static void main(String[] args) {
        int n , k = 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Укажите количество чисел Фибоначчи для вывода");
        try {
            n = scn.nextInt();
            System.out.print("Первые " + n + " чисел Фибоначчи подсчитанные рекурсивным способом: ");
            fibonacсiRecursive(n);
            System.out.println();
            System.out.print("Первые " + n + " чисел Фибоначчи подсчитанные итеративным способом: ");
            fibonacсiIterative(n);
            System.out.println();
            System.out.print("Первые " + n + " чисел Фибоначчи подсчитанные с помощью итератора: ");
            FibonacciIterable fib = new FibonacciIterable();
            System.out.print(1 + " ");
            for (int i : fib) {
                k++;
                if (k > n) break;
                System.out.print(i + " ");
            }
        }catch (InputMismatchException e ){
            e.printStackTrace();
        }


    }
}
