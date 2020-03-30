package homework6;
import java.util.Scanner;
import java.util.Random;

public class HomeWork6 {
    public static class Lake {
        public void toPlunge() {
            System.out.println("Вы окунулись в пруду");
        }
    }
    public static class Duck extends Lake {
        protected boolean isItADrake;
        public boolean isItHungry=true;
        public void toFeed() {
            System.out.println("Утка покормлена");
            isItHungry=false;
        }
        public void setHunger(boolean hunger) {
            isItHungry=hunger;
        }
        public boolean getHunger() {
            return (isItHungry);
        }
        public void setDrake(boolean gender) {
            isItADrake=gender;
        }
        public boolean getDrake() {
            return (isItADrake);
        }
    }
    public static class Fish extends Lake {
        public void toCatch() {
            System.out.println("Рыбка поймана");
        }
    }
    public static class Mosquito extends Lake {
        protected boolean biter;
        private void toKill() {
            System.out.println("Комар прихлопнут");
        }
        public void setBiter(boolean biting) {
            biter=biting;
        }
        public boolean getBiter() {
            return (biter);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        Lake newLake = new Lake();
        System.out.println("Вы находитесь возле пруда");
        System.out.println("Хотите окунуться в пруду? '1' - да, '0' - нет");
        byte choice1 = scn.nextByte();
        if (choice1==1)
            newLake.toPlunge();
        Mosquito pest = new Mosquito();
        pest.setBiter(random.nextBoolean());
        System.out.println("Вы видите комара");
        if (pest.getBiter()) {
            System.out.println("Комар кусается. Прихлопнуть комара? '1' - да, '0' - нет");
            byte choice2 = scn.nextByte();
            if (choice2==1)
                pest.toKill();
        }
        Fish carp = new Fish();
        System.out.println("Вы увидели в пруду карпа. Поймать его? '1' - да, '0' - нет");
        byte choice3 = scn.nextByte();
        if (choice3==1)
            carp.toCatch();
        Duck donald = new Duck();
        System.out.println("В пруду плавает уточка");
        donald.setDrake(random.nextBoolean());
        if (donald.getDrake())
            System.out.println("Это селезень");
        if (donald.getHunger()) {
            System.out.println("Уточка голодная. Покормить? '1' - да, '0' - нет");
            byte choice4 = scn.nextByte();
            if (choice4 == 1)
                donald.toFeed();
        }
    }
}
