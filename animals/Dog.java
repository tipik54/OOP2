package ru.kaznu.ruslan.OOP2.animals;

public class Dog extends Animal {
    public Dog(String name, int speedOfRun, int speedOfSwim, int endurance) {
        super(name, speedOfRun, speedOfSwim, endurance);
    }
    public Dog(String name, int speedOfRun, int speedOfSwim) {
        super(name, speedOfRun, speedOfSwim);
    }
    public Dog(String name, int speedOfRun) {
        super(name, speedOfRun);
    }
    public Dog(String name) {
        super(name);
    }
    public Dog() {
        super();
    }

    public double swim(int distance) {
        // Проверяем, достаточно ли выносливости
        if (endurance < distance * 2) { // У Собаки на 1 метр плавания - 2 ед
            System.out.println(name + " устал и не может плавать.");
            return -1;
        }
        // Рассчитываем время
        double time = (double) distance / speedOfSwim;
        endurance -= distance * 2; // уменьшаем выносливость
        System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд.");
        return time;
    }

    @Override
    public void voice() {
        System.out.println(name + " гавкнул");
    }
    @Override
    public void info() {
        System.out.println("Имя собаки: " + name);
        System.out.println("Скорость бега собаки: " + speedOfRun);
        System.out.println("Скорость плаванья собаки: " + speedOfSwim);
        System.out.println("Выносливость собаки: " + endurance);

    }
}
