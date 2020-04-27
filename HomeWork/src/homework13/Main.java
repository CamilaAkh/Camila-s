package homework13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static boolean checkIt() {  //метод для остановки/продолжения кормления

        Scanner scn = new Scanner(System.in);
        System.out.println("Хотите продолжить кормление 1-да, 0-нет");

        try {
            byte check = scn.nextByte();
            while ((check != 0) && (check != 1)) {
                System.out.println("Номер не корректен. Попробуйте еще раз.");
                check = scn.nextByte();
            }
            if (check == 0){
                return(false);
            } else{
                return(true);
            }
        }catch (InputMismatchException e){
            System.err.println("Произошла ошибка. Введенные данные имеют тип, несоответствующий требуемому");
            return checkIt();
        }
    }

    private static byte getNumber(){ //метод выбора еды для кормленя

        Scanner scn = new Scanner(System.in);
        byte number = 0;
        try {
            System.out.println("Выберите номер еды для кормления ребенка(от 1 до 13)");
            number = scn.nextByte();
            while ((number < 1) | (number > 13)) {
                System.out.println("Номер не корректен. Попробуйте еще раз.");
                number = scn.nextByte();
            }
            return number;
        }catch (InputMismatchException e){
            System.err.println("Произошла ошибка. Введенные данные имеют тип, несоответствующий требуемому");
            return getNumber();
        }

    }

    public static void main(String[] args) {

        Kid myKid = new Kid();
        Boolean flag = true;

        System.out.println("Время кормить ребенка");
        System.out.println("Список доступной еды:");
        for (Food food : Food.values()) {
            System.out.println((food.ordinal() + 1) + " " + food.name);
        }

        while (flag) {

            int choice = getNumber();
            Food[] food = Food.values();
            try {
                myKid.toEat(food[choice - 1]);
            } catch (FoodException e) {
                System.err.println("Ребенок выплюнул еду");
            } finally {
                System.out.println("Ребенок целует и благодарит маму");
            }
            flag = checkIt();

        }
    }
}
