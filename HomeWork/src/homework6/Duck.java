package homework6;

public class Duck  extends Main.LakeHabitant { //создается класс уток. наследник класса пруда

    void toDetect() {  System.out.println("Обнаружена утка "); }
    protected boolean isItADrake; //переменная, определяющая гендерную принадлежность утки
    protected boolean isItHungry=true; //переменная, определяющая голодность утки
    void toFeed() { //метод для кормления утки
        System.out.println("Утка покормлена");
        isItHungry=false;
    }
    private void setHunger(boolean hunger) {
        isItHungry=hunger;
    }
    boolean getHunger() {
        return (isItHungry);
    }
    void setDrake(boolean gender) {
        isItADrake=gender;
    }
    boolean getDrake() {
        return (isItADrake);
    }

}

