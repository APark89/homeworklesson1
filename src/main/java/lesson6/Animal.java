package lesson6;

public abstract class Animal {

    protected String name;
    protected int runDistance;
    protected int swimDistance;

    protected static int count = 0;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    public abstract void doRun(int dogRunDistance);

    public abstract void doSwim(int swimDistance);
}


