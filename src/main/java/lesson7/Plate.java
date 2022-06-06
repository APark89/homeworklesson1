package lesson7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("Корма в тарелке: " + foodCount);
        System.out.println();
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public void setFoodCount() {
        foodCount -= foodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void increaseFood(int newFood) {
        foodCount = foodCount + newFood;
        System.out.println("В тарелку добавлено: " + newFood + " корма");
    }
}

