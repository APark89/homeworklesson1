package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(checkNumbers(500, 300));

        checkNumbersAgain(0);

        System.out.println(oneMoreNumber(-8));

        lineAndNumber("А я сейчас вам покажу", 4);

        System.out.println(years(1984));

    }

    private static boolean checkNumbers(int first, int second) {
        int sum = first + second;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void checkNumbersAgain(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    private static boolean oneMoreNumber(int number) {
        if (number < 0) {
            return true;

        } else {
            return false;
        }
    }


    private static void lineAndNumber(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    private static boolean years(int year) {
        boolean leapYear = true;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return leapYear;
        } else if (year % 100 == 0) {
            return !leapYear;
        } else {
            return !leapYear;
        }
    }
}

