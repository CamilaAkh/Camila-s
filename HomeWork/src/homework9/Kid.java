package homework9;


class Kid extends Human implements Run, Swim { //Подкласс человека - ребенок
    public void run(){
        System.out.println("Ребенок бежит");
    }
    public void swim(){
        System.out.println("Ребенок плывет");
    }
}