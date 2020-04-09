package homework7;
import java.util.Scanner;

public class VendingMachine {
    enum Drink{
        TEA(30, "Чай"), ESPRESSO(40, "Эспрессо"), AMERICANO(60, "Американо"), CAPPUCCINO(60, "Капучинно"), LATTE(60, "Латте"), RISTRETTO(60, "Ристретто"), HOT_CHOCOLATE(50, "Горячий шоколад"), MOCHACCINO(60, "Моккачино"), HOT_MILK(40, "Горячее молоко");

        private int price;
        private String name;

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
        deposit = scn.nextInt();
        while (deposit==0){
            System.out.println("Деньги не внесены. Попробуйте еще раз.");
            deposit = scn.nextInt();
        }
        return deposit;
    }

    /*Метод выбора напитка

     */
    private static byte getNumber(){
        Scanner scn = new Scanner(System.in);
        byte number = 0;
        System.out.println("Выберите номер напитка(от 1 до 9)");
        number = scn.nextByte();
        while ((number<1)|(number>9)){
            System.out.println("Номер не корректен. Попробуйте еще раз.");
            number = scn.nextByte();
        }
        return number;
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        Drink[] drinks = Drink.values();//вывод меню аппарата

        System.out.println("Меню напитков:");
        for(Drink drink : Drink.values()){
            System.out.println((drink.ordinal()+1) + " " + drink.name + " " + drink.price + "р.");
        }

        int credit = getDeposit();
        byte choice = getNumber();

        /*проверка достатка средств

         */
        while (credit < drinks[choice-1].price){
            System.out.println("Денег не достаточно. Добваьте денег до необходимой суммы");
            credit = credit + scn.nextInt();
        }

        System.out.println("Спасибо, заберите свой " + drinks[choice-1].name);
        /*проверка наличия сдачи

         */
        if (credit > drinks[choice-1].price)
            System.out.println("Заберите сдачу " + (credit - drinks[choice-1].price) + " рублей");
    }
}
