package homework33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите строку для подсчета наиболее распространенного символа в ней: ");
        String str = scn.nextLine();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            int n = 1;
            if (map.containsKey(c)) {
                n = map.get(c) + 1;
            }
            map.put(c, n);
        }

        Set<Entry<Character, Integer>> setvalue = map.entrySet();
        Iterator<Entry<Character, Integer>> iterator = setvalue.iterator();
        Entry<Character, Integer> max = null;
        while (iterator.hasNext()) {
            Entry<Character, Integer> current = iterator.next();
            if (max == null) {
                max = current;
            } else if (current.getValue() > max.getValue()) {
                max = current;
            }
        }

        System.out.println("Наиболее встречающийся символ в строке : '" + max.getKey() + "' повторяется " + max.getValue() + " раз.");
    }

}

