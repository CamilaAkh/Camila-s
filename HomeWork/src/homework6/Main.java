package homework6;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        Lake newLake = new Lake();
        System.out.println("Вы находитесь возле пруда");
        System.out.println("Хотите окунуться в пруду? '1' - да, '0' - нет");
        byte choice1 = scn.nextByte();
        if (choice1==1)
            newLake.toPlunge();
        System.out.println();

        Mosquito pest = new Mosquito();
        pest.setBiter(random.nextBoolean());
        pest.toDetect();
        if (pest.getBiter()) {
            System.out.println("Комар кусается. Прихлопнуть комара? '1' - да, '0' - нет");
            byte choice2 = scn.nextByte();
            if (choice2==1)
                pest.toKill();
        }
        System.out.println();

        Fish carp = new Fish();
        carp.toDetect();
        System.out.println("Поймать её? '1' - да, '0' - нет");
        byte choice3 = scn.nextByte();
        if (choice3==1)
            carp.toCatch();
        System.out.println();

        Duck donald = new Duck();
        donald.toDetect();
        donald.setDrake(random.nextBoolean());
        if (donald.getDrake())
            System.out.println("Это селезень");
        else System.out.println("Это не селезень");
        if (donald.getHunger()) {
            System.out.println("Уточка голодная. Покормить? '1' - да, '0' - нет");
            byte choice4 = scn.nextByte();
            if (choice4 == 1)
                donald.toFeed();
        }
    }
}
