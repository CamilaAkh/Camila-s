package homework8task4;

public class Contract {
    private static int contractNumber = 0;   //Номер договора
    private static int listNumber = 0;   //Счетчик продуктов
    public String[] productsList = new String[15];   //Массив продуктов
    private final int day, mounth, year;

    public Contract(int day, int mounth, int year){ //Конструктор договора, в котором задается дата
        this.day = day;
        this.mounth = mounth;
        this.year = year;
        contractNumber++;
    }

    public int getContractNumber(){
        return contractNumber;
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

    public void addList(String s){
        productsList[listNumber] = s;
        listNumber++;
    }
}
