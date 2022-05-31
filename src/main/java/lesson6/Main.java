package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int dogRunDistance = random.nextInt(0, 1000) + 1;
        int catRunDistance = random.nextInt(0, 400) + 1;
        int swimDistance = random.nextInt(0, 15) + 1;

        Dog dog = new Dog("Старый чекист", 500, 10);
        Cat cat = new Cat("Барсик", 200);

        dog.doRun(dogRunDistance);
        cat.doRun(catRunDistance);

        dog.doSwim(swimDistance);
        cat.doSwim(swimDistance);

        System.out.println("Всего котов: " + Cat.getCount() + "\nВсего собак: " + Dog.getCount() + "\nОбщее количество животных: "  + Animal.getCount());

    }
}

