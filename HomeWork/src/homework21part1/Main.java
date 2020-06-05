package homework21part1;

import java.util.Random;

public class Main {
    public static int size = 5;

    /**
     * Метод, сдвигающий массив на одну позицию влево
     * @param array
     */
    public static void toLeft(int [][] array){
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size-1; j++){
                array[i][j] = array[i][j+1];
            }
            if(i!=size-1) array[i][size-1] = array[i+1][0];
            else array[size-1][size-1] = 0;
        }
    }

    /**
     * Метод, печатающий массив в консоль
     * @param array
     */
    public static void printArray(int [][] array){
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Метод, заполняющий массив случайным образом
     * @param array
     */
    public static void fillArray(int [][] array){
        Random random = new Random();
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                array[i][j] = random.nextInt(100);
            }
        }
    }


    public static void main(String[] args) {

        int  [] [] array = new int[size][size];
        fillArray(array);
        System.out.println("Исходный массив:");
        printArray(array);
        toLeft(array);
        System.out.println();
        System.out.println("Массив со сдвигом:");
        printArray(array);

    }
}
