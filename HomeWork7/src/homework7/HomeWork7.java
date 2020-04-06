package homework7;
import java.util.Scanner;

public class HomeWork7 {
    enum Drink{
        ЧАЙ(30), ЭСПРЕССО(40), АМЕРИКАНО(60), КАПУЧИННО(60), ЛАТТЕ(60), РИСТРЕТТО(60), ГОРЯЧИЙ_ШОКОЛАД(50), МОККАЧИНО(60), ГОРЯЧЕЕ_МОЛОКО(40);

        protected int price;

        Drink(int price){
            this.price = price;
        }
    }

    public static int getDeposit(){ //Метод внесения денег
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

    public static byte getNumber(){  //метод выбора напитка
        Scanner scn = new Scanner(System.in);
        byte number = 0;
        System.out.println("Выберите номер напитка(от 1 до 9)");
        number = scn.nextByte();
        while ((number<0)|(number>9)){
            System.out.println("Номер не корректен. Попробуйте еще раз.");
            number = scn.nextByte();
        }
        return number;
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        Drink[] drinks = Drink.values();
        /*вывод меню аппарата

         */
        System.out.println("Меню напитков:");
        for(Drink drink : Drink.values()){
            System.out.println((drink.ordinal()+1) + " " + drink + " " + drink.price + "р.");
        }

        int credit = getDeposit();
        byte choice = getNumber();

        /*проверка достатка средств

         */
        while (credit < drinks[choice-1].price){
            System.out.println("Денег не достаточно. Добваьте денег до необходимой суммы");
            credit = credit + scn.nextInt();
        }

        System.out.println("Спасибо, заберите свой " + drinks[choice-1]);
        /*проверка наличия сдачи

         */
        if (credit > drinks[choice-1].price)
            System.out.println("Заберите сдачу " + (credit - drinks[choice-1].price) + " рублей");
    }
}
