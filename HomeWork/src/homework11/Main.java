package homework11;

import java.util.Scanner;

public class Main {
    static void censor(String str){
        str = str.replace("бяка","вырезано цензурой");
        System.out.println("Строка, подвергнутая цензуре: " + str);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите строку, цензор вырежет из нее все вхождения слова 'бяка'");
        String str = scn.nextLine();
        censor(str);
    }
}
