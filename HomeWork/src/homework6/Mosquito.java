package homework6;

public class Mosquito extends Main.LakeHabitant { //подкласс пруда - комары

    void toDetect() {  System.out.println("Обнаружен комар "); }
    private boolean biter; //переменная, определяющая кусачесть комара
    void toKill() { //метод, для уничтожения комара
        System.out.println("Комар прихлопнут");
    }
    void setBiter(boolean biting) {
        biter=biting;
    }
    boolean getBiter() {
        return (biter);
    }

}

