package homework9;

public class Main {

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
