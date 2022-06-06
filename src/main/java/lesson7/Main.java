package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 15, false);
        Plate plate = new Plate(50);
        plate.printInfo();
        for (int i = plate.getFoodCount(); i > 0; i = i - cat.getAppetite()) {
            cat.eat(plate);
            cat.getFull();
            plate.printInfo();
        }


        plate.increaseFood(50);
        plate.printInfo();


        plate = new Plate(50);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 15, false);
        cats[1] = new Cat("Маркиз", 20, false);
        cats[2] = new Cat("Цицерон", 25, false);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].getFull();
            plate.printInfo();
        }
    }
}
