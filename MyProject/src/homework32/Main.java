package homework32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Введите последовательно целые числа для заполнения дерева, для остановки введите '0'");

        while((n = scn.nextInt()) != 0)
            tree.insert(n);

        tree.CountLeaves();
        System.out.println("Количество листьев в дереве: " + tree.getCount());
    }
}
