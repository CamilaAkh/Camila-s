package homework8task4;
import java.util.Scanner;

public class Conversion {
    public static class Act{           //Класс актов
        protected static int actNumber = 0;  //Номер акта

        public Act(int day, int mounth, int year){  //Конструктор, параметры - дата акта, в конструкторе считается номер акта
            this.day = day;
            this.mounth = mounth;
            this.year = year;
            actNumber++;
        }
        public int getActNumber(){
            return actNumber;
        }
        protected int day, mounth, year;
        public int getDay() {
            return (this.day);
        }
        public int getMounth() {
            return (this.mounth);
        }
        public int getYear() {
            return (this.year);
        }

        public String[] productsList = new String[100];   //Список товаров
        public void addList(String s){     //Метод для заполнения списка
            productsList[productsList.length] = s;
        }
    }

    public static class Contract{       //Класс договоров
        protected static int contractNumber = 0;   //Номер договора
        protected static int listNumber = 0;

        public Contract(int day, int mounth, int year){
            this.day = day;
            this.mounth = mounth;
            this.year = year;
            contractNumber++;
        }
        public int getContractNumber(){
            return contractNumber;
        }
        protected int day, mounth, year;
        public int getDay() {
            return (this.day);
        }
        public int getMounth() {
            return (this.mounth);
        }
        public int getYear() {
            return (this.year);
        }

        public String[] productsList = new String[100];
        public void addList(String s){
            productsList[listNumber] = s;
            listNumber++;
        }

    }

    static Act conversion(Contract contr){   //метод для конвертирования договора в акт
        Act newAct= new Act(contr.day,contr.mounth,contr.year);
        for (int i=0; i<contr.productsList.length; i++){
            newAct.productsList[i] = contr.productsList[i];
        }

        return newAct;
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите поочередно день, месяц и год создания договора");
        Contract myContract = new Contract(scn.nextInt(), scn.nextInt(), scn.nextInt());
        System.out.println("Договор создан");

        System.out.println("Заполните список товаров, вводите названия по одному, когда товары закончатся, введите end");
        String str = scn.nextLine();

        while (!(str.equals("end"))){
            myContract.addList(str);
            str = scn.nextLine();
        }

        Act myAct = conversion(myContract);
        System.out.println("Номер акта: " + myAct.getActNumber());
        System.out.println("Дата акта: " + myAct.getDay() + "." + myAct.getMounth() + "." + myAct.getYear());
    }

}
