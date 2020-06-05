package homework7;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;

public class VendingMachine {

    public static final Logger logger = Logger.getLogger(VendingMachine.class.getName());


    enum Drink{
        TEA(30, "Чай"), ESPRESSO(40, "Эспрессо"), AMERICANO(60, "Американо"), CAPPUCCINO(60, "Капучинно"), LATTE(60, "Латте"), RISTRETTO(60, "Ристретто"), HOT_CHOCOLATE(50, "Горячий шоколад"), MOCHACCINO(60, "Моккачино"), HOT_MILK(40, "Горячее молоко");

        private final int price;
        private final String name;

        Drink(int price, String name){

            this.price = price;
            this.name = name;

        }
    }

    /*Метод внесения денег

     */
    private static int getDeposit(){
        Scanner scn = new Scanner(System.in);
        int deposit = 0;
        System.out.println("Внесите деньги на счет. Принимаются только рубли, без копеек.");
        try {
            deposit = scn.nextInt();
            while (deposit == 0) {
                System.out.println("Деньги не внесены. Попробуйте еще раз.");
                logger.log(Level.WARNING, "Деньги для оплаты напитка не внесены");
                deposit = scn.nextInt();
            }
            return deposit;
        }catch (InputMismatchException e){
            System.err.println("Произошла ошибка. Введенные данные имеют тип, несоответствующий требуемому");
            logger.log(Level.SEVERE, "Произошла ошибка. Введенные данные имеют тип, несоответствующий требуемому", e);
            return getDeposit();
        }
    }

    /*Метод выбора напитка

     */
    private static byte getDrink(){
        Scanner scn = new Scanner(System.in);
        byte number = 0;
        System.out.println("Выберите номер напитка(от 1 до 9)");
        try {
            number = scn.nextByte();
            while ((number < 1) | (number > 9)) {
                logger.log(Level.WARNING, "Введен некорректный номер для выбора напитка");
                System.out.println("Номер не корректен. Попробуйте еще раз.");
                number = scn.nextByte();
            }
            return number;
        }catch (InputMismatchException e){
            logger.log(Level.SEVERE, "Произошла ошибка. Введенные данные имеют тип, несоответствующий требуемому");
            System.err.println("Произошла ошибка. Введенные данные имеют тип, несоответствующий требуемому");
            return getDrink();
        }
    }

    public static void main(String[] args) throws IOException {

        Handler fileHandler;
        fileHandler = new FileHandler("loggingFile");
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);


        Scanner scn = new Scanner(System.in);
        Drink[] drinks = Drink.values();//вывод меню аппарата

        System.out.println("Меню напитков:");
        for(Drink drink : Drink.values()){
            System.out.println((drink.ordinal()+1) + " " + drink.name + " " + drink.price + "р.");
        }

        int credit = getDeposit();
        byte choice = getDrink();
        System.out.printf("Выбранный вами напиток: %s, стоимость которого: %d рублей", drinks[choice-1].name, drinks[choice-1].price);
        System.out.println();

        /*проверка достатка средств

         */
        while (credit < drinks[choice-1].price){
            logger.log(Level.WARNING, "Внесенной суммы не достаточно");
            System.out.println("Денег не достаточно. Добваьте денег до необходимой суммы");
            System.out.printf("Текущая внесенная сумма: %d", credit);
            System.out.println();
            credit = credit + scn.nextInt();
        }

        System.out.println("Спасибо, заберите свой " + drinks[choice-1].name);
        /*проверка наличия сдачи

         */
        if (credit > drinks[choice-1].price)
            System.out.println("Заберите сдачу " + (credit - drinks[choice-1].price) + " рублей");
    }
}
