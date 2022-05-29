package lesson5;

public class Person {
    private  String name;
    private String position;
    private  String email;
    private int phone;
    private  double salary;
    private  int age;

    public Person (String name, String position, String email, int phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.printf("Имя: %s, должность: %s, e-mail: %s, телефон: %d, зарплата: %.2f, возраст: %d%n",
                name, position, email, phone, salary, age);
    }
}



