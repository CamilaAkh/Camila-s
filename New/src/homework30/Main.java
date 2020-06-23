package homework30;

import java.util.Scanner;

public class Main {

    static char firstUniqueSymbol(String string){

        for (int i=0; i<string.length(); i++){
            if((i==string.lastIndexOf(string.charAt(i)))&&(i==string.indexOf(string.charAt(i)))){
                return string.charAt(i);
            }
        }
        return '\u0000';
    }
    public static void main(String[] args) {

        String string;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите строку для проверки на вхождение первого уникального символа");
        string = scn.next();
        if(firstUniqueSymbol(string)!='\u0000')
            System.out.print("Первый уникальный символ в строке " + " '" + string + "' - " + firstUniqueSymbol(string));
        else System.out.println("В строке отсутствуют уникальные символы");

    }
}
