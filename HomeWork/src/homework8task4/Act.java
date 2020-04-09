package homework8task4;

public class Act {
    protected static int actNumber = 0;  //Номер акта
    public String[] productsList = new String[15];   //Список товаров
    protected int day, mounth, year;

    public Act(int day, int mounth, int year){  //Конструктор, параметры - дата акта, в конструкторе считается номер акта
        this.day = day;
        this.mounth = mounth;
        this.year = year;
        actNumber++;
    }

    public int getActNumber(){
        return actNumber;
    }
    public int getDay() {
        return (this.day);
    }
    public int getMounth() {
        return (this.mounth);
    }
    public int getYear() {
        return (this.year);
    }

}
