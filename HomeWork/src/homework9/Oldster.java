package homework9;


class Oldster extends Human implements Run, Swim { //Подкласс человека - старик
    public void run(){
        System.out.println("Старик бежит");
    }
    public void swim(){
        System.out.println("Старик плывет");
    }
}