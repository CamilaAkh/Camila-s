package homework9;


class Duck extends Animal implements Run, Swim, Fly{
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

