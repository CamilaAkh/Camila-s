package homework8task4;

import java.util.Scanner;

public class Conversion {

    static Act conversion(Contract contr, int day, int mounth, int year){   //метод для конвертирования договора в акт

        Act newAct= new Act(day, mounth, year);
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

        System.out.println("Заполните список товаров(не более 15), вводите названия по одному, когда товары закончатся, введите end");
        String str = scn.nextLine();

        while (!(str.equals("end"))){
            myContract.addList(str);
            str = scn.nextLine();
        }

        System.out.println("Введите пооочередно день, месяц и год создания акта");
        Act myAct = conversion(myContract, scn.nextInt(), scn.nextInt(), scn.nextInt());
        System.out.println("Номер акта: " + myAct.getActNumber());
        System.out.println("Дата акта: " + myAct.getDay() + "." + myAct.getMounth() + "." + myAct.getYear());
        System.out.println("Список товаров акта:");
        for (String s:myAct.productsList) {
            if (!(s==null))
            System.out.println(s);
        }
        }

}
