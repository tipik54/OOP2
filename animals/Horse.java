package ru.kaznu.ruslan.OOP2.animals;

public class Horse extends Animal {
    public Horse(String name, int speedOfRun, int speedOfSwim, int endurance) {
        super(name, speedOfRun, speedOfSwim, endurance);
    }

    public Horse(String name, int speedOfRun, int speedOfSwim) {
        super(name, speedOfRun, speedOfSwim);
    }

    public Horse(String name, int speedOfRun) {
        super(name, speedOfRun);
    }

    public Horse(String name) {
        super(name);
    }

    public Horse() {
        super();
    }

    public double swim(int distance) {
        // Проверяем, достаточно ли выносливости
        if (endurance < distance * 4) { // У Лошади на 1 метр плавания тратят 4 единицы
            System.out.println(name + " устал и не может плавать.");
            return -1;
        }
        // Рассчитываем время
        double time = (double) distance / speedOfSwim;
        endurance -= distance * 4; // уменьшаем выносливость
        System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд.");
        return time;
    }

    @Override
    public void voice() {
        System.out.println(name + " ржет");
    }

    @Override
    public void info() {
        System.out.println("Имя лошади: " + name);
        System.out.println("Скорость бега лошади: " + speedOfRun);
        System.out.println("Скорость плаванья лошади: " + speedOfSwim);
        System.out.println("Выносливость лошади: " + endurance);

    }
}
