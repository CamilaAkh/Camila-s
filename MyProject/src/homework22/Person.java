package homework22;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
