package homework21part2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int size;

    /**
     * Метод, случайным образом заполняющий целочисленный массив
     * @param array
     */
    public static void fillArray(int [] array){
        Random random = new Random();
        for (int i = 0; i<size; i++){
            array[i] = random.nextInt(100);
        }
    }

    /**
     * Метод, выводящий массив в консоль
     * @param array
     */
    public static void printArray(int [] array){
        for (int i = 0; i<size; i++){
            System.out.printf("%5d", array[i]);

        }
    }

    /**
     * Метод, разворачивающий массив в обратном порядке
     * @param array
     */
    public static void reverce(int [] array){
        int tmp;
        for (int i = 0; i < size/2;  i++){
            tmp = array[size-1-i];
            array[size-1-i] = array[i];
            array[i]=tmp;
        }
    }

    public static void main(String[] args) {

        System.out.println("Укажите размер массива, который нужно развернуть");
        Scanner scn = new Scanner(System.in);
        try {
            size = scn.nextInt();
        } catch (InputMismatchException e){
            e.printStackTrace();
        }

        int [] array = new int[size];
        fillArray(array);
        System.out.println("Исходный массив:");
        printArray(array);
        reverce(array);
        System.out.println();
        System.out.println("Развернутый массив:");
        printArray(array);

    }
}
