package homework4task3;

public class HomeWork4Task3 {
    public static void main(String[] args){
        System.out.println("Таблица умножения: ");
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i);
                System.out.print("*");
                System.out.print(j);
                System.out.print("=");
                System.out.println(i*j);
            }
            System.out.println();
        }
    }
}
