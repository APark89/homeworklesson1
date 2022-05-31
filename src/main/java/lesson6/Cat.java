package lesson6;

public class Cat extends Animal {

    private int runLimitDistance;
    private static int count = 0;


    public Cat (String name, int runLimitDistance) {
        this.name = name;
        this.runLimitDistance = runLimitDistance;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void doRun(int runDistance) {
        if (runDistance <= runLimitDistance) {
            System.out.println(name + " пробежал " + runDistance + " м.");
        } else {
            System.out.println(name + " " + runDistance + " м. не пробежит");
        }
    }

    @Override
    public void doSwim(int swimDistance) {
        System.out.println(name + " не умеет плавать");

    }
}

