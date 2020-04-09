package homework9;


class Dog extends Animal implements Run,Swim{
    void getName(){
        System.out.println("Это собака");
    }
    public void run(){
        System.out.println("Собака бежит");
    }
    public void swim(){
        System.out.println("Собака плывет");
    }
}
