package homework31;

import java.util.Scanner;

public class Main {

    /**
     * метод, проверяющий идентичность символов с двух концов строки
     * @param string
     * @return
     */
    static boolean firstIsPalindrome(String string){
        for(int i=0; i<(string.length()/2); i++)
            if (string.charAt(i) != string.charAt(string.length() - 1 - i))
                return false;

        return true;
    }

    /**
     * метод, проверяющий палиндром при помощи reverse()
     * @param string
     * @return
     */
    static boolean secondIsPalindrome(String string){
        StringBuffer buffer = new StringBuffer(string);
        buffer = buffer.reverse();
        System.out.println(buffer);
        return (buffer.toString().equals(string));
    }

    public static void main(String[] args) {
        String string;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите строку для проверки на полиндром");
        string = scn.next();
        if (firstIsPalindrome(string))
            System.out.println("Введенная строка - палиндром (выяснено первым способом)");
        else System.out.println("Введенная строка - не палиндром (выяснено первым способом)");
        if (secondIsPalindrome(string))
            System.out.println("Введенная строка - палиндром (выяснено вторым способом)");
        else System.out.println("Введенная строка - не палиндром (выяснено вторым способом)");
    }

}
