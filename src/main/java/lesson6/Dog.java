package lesson6;

public class Dog extends Animal {

    private int runLimitDistance;
    private int swimLimitDistance;
    private static int count = 0;

    public Dog(String name, int runLimitDistance, int swimLimitDistance) {
        this.name = name;
        this.runLimitDistance = runLimitDistance;
        this.swimLimitDistance = swimLimitDistance;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void doRun(int runDistance) {
        if (runDistance <= runLimitDistance) {
            System.out.println(name + " пробежал " + runDistance + " м.");
        } else {
            System.out.println(name + " " + runDistance + " м. не пробежит");
        }
    }

    @Override
    public void doSwim(int swimDistance) {
        if (swimDistance <= swimLimitDistance) {
            System.out.println(name + " проплыл " + swimDistance + " м.");
        } else {
            System.out.println(name + " " +  swimDistance + " м. не проплывёт");
        }
    }
}

