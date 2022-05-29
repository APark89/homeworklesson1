package lesson5;

public class Main {
    public static void main(String[] args) {

        Person[] personArr = new Person[5];

        personArr[0] = new Person("Егор Попов", "менеджер", "i.p@gmail.com", 899887755, 99578, 44);
        personArr[1] = new Person("Виктор Хомяков", "инженер", "v.h@gmail.com", 76584915, 102345, 39);
        personArr[2] = new Person("Валерий Кузнецов", "директор", "v.k@gmail.com", 54789544, 89675, 41);
        personArr[3] = new Person("Галина Петрова", "секретарть", "i.p@gmail.com", 9879654, 68954, 25);
        personArr[4] = new Person("Джейсон Стэйтем", "водитель", "j.s@gmail.com", 7689540, 55300, 50);
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i].getAge() > 40) {
                personArr[i].info();
            }
        }
    }
}

