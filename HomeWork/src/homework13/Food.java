package homework13;

public enum Food {
    CARROT("Морковка"), APPLE("Яблоко"), SOUP("Суп"), PEAS("Горошек"), CABBAGE("Капуста"), PEAR("Груша"), BANANA("Банан"), RICE("Рис"), PORK("Свинина"), BEEF("Говядина"), STRAWBERRY("Клубника"), CHICKEN("Курица"), KEFIR("Кефир");

    protected String name;

    Food(String name){
        this.name = name;
    }
}
