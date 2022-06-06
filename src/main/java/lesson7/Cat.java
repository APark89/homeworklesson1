package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;


    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public void eat(Plate plate) {
        if (plate.getFoodCount() > appetite) {
            plate.decreaseFood(appetite);
            full = true;
            System.out.println("Кот " + name + " съел " + appetite + " корма");
        } else {
            full = false;
            System.out.println("Кот " + name + " съел " + plate.getFoodCount() + " корма");
            plate.setFoodCount();
        }
    }

    public int getAppetite() {
        return appetite;

    }
    public void getFull() {
        if (full == true) {
            System.out.println(name + " сытый");
        } else {
            System.out.println(name + " хочет есть");
        }
    }
}

