package lesson3;

public class HomeWorkApp {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive(5, 8);
        taskSix();

        boolean a = taskSeven(new int[]{25, 25, 14, 5, 5, 60, 14});
        System.out.println(a);
    }

    private static void taskOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    private static void taskTwo() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    private static void taskThree() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void taskFour() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i == 0 && j == 3 || i == 1 && j == 2 || i == 2 && j == 1 || i == 2 && j == 1 || i == 3 && j == 0) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] taskFive(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 8;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    private static void taskSix() {
        int[] arr = {3, 5, 6, 7, 13, 19, -1, 8};
        int low = arr[0];
        int high = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (low > arr[i]) {
                low = arr[i];
            } else if (high < arr[i]) {
                high = arr[i];
            }
        }
        System.out.println("Минимальное число " + low);
        System.out.println("Максимальное число " + high);
    }

    private static boolean taskSeven(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int balance = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
            balance = balance + arr[i];
            System.out.print(arr[i] + ", ");
            if (balance == sum) {
                return true;
            }
        }
        return false;
    }
}