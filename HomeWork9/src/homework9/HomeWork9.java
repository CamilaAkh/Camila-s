package homework9;

public class HomeWork9 {

    public static abstract class Animal{
        abstract void getName(); //Абстрактный метот, возвращающий название животного
    }

    public static abstract class Human implements Run, Swim{
        public abstract void run();
        public abstract void swim();
    }

    public static class Cat extends Animal implements Run{
        void getName(){                      //Реализация абстрактного метода getName
            System.out.println("Это кошка");
        }
        public void run(){                      //Реализация интерфейсного метода бежать
            System.out.println("Кошка бежит");
        }
    }

    public static class Dog extends Animal implements Run,Swim{
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

    public static class Duck extends Animal implements Run, Swim, Fly{
        void getName(){
            System.out.println("Это утка");
        }
        public void run(){
            System.out.println("Утка бежит");
        }
        public void swim(){
            System.out.println("Утка плывет");
        }
        public void fly(){
            System.out.println("Утка летит");
        }
    }

    public static class Kid extends Human implements Run, Swim{ //Подкласс человека - ребенок
        public void run(){
            System.out.println("Ребенок бежит");
        }
        public void swim(){
            System.out.println("Ребенок плывет");
        }
    }

    public static class Oldster extends Human implements Run, Swim{ //Подкласс человека - старик
        public void run(){
            System.out.println("Старик бежит");
        }
        public void swim(){
            System.out.println("Старик плывет");
        }
    }

/*Интерфейсы летать, бежать и плавать

 */
    interface Fly{
        void fly();
    }

    interface Run{
        void run();
    }

    interface Swim{
        void swim();
    }

    public static void main(String[] args){

        Cat myCat = new Cat();
        myCat.getName();
        myCat.run();
        System.out.println();

        Dog myDog = new Dog();
        myDog.getName();
        myDog.run();
        myDog.swim();
        System.out.println();

        Duck myDuck = new Duck();
        myDuck.getName();
        myDuck.run();
        myDuck.swim();
        myDuck.fly();
        System.out.println();

        Kid myKid = new Kid();
        myKid.run();
        myKid.swim();
        System.out.println();

        Oldster myOldster = new Oldster();
        myOldster.run();
        myOldster.swim();
        System.out.println();
    }
}
