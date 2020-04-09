package homework9;


class Cat extends Animal implements Run{
    void getName(){                      //Реализация абстрактного метода getName
        System.out.println("Это кошка");
    }
    public void run(){                      //Реализация интерфейсного метода бежать
        System.out.println("Кошка бежит");
    }
}

