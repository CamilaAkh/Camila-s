package homework13;

public class Kid {
    Food[] kidsPreferences = {Food.CARROT, Food.APPLE, Food.CABBAGE, Food.BANANA, Food.STRAWBERRY, Food.CHICKEN};  //вкусовые пердпочтения ребенка

    public void toEat(Food dish) throws FoodException {   //метод для кормления ребенка
        Boolean flag = true;
        for(int i=0; i<kidsPreferences.length; i++ ){
            if (kidsPreferences[i].equals(dish)){
                System.out.println("Съел... за обе щеки");
                flag = false;
            }
        }
        if (flag) throw new FoodException();
    }
}
