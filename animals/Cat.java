package ru.kaznu.ruslan.OOP2.animals;

public class Cat extends Animal{
    public Cat(String name, int speedOfRun, int speedOfSwim, int endurance) {
        super(name, speedOfRun, speedOfSwim, endurance);
    }
    public Cat(String name, int speedOfRun, int speedOfSwim) {
        super(name, speedOfRun, speedOfSwim);
    }
    public Cat(String name, int speedOfRun) {
        super(name, speedOfRun);
    }
    public Cat(String name) {
        super(name);
    }
    public Cat() {
        super();
    }

    public double swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        return -1; // Кот плавать не умеет
    }

    @Override
    public void voice() {
        System.out.println(name + " мяукнул");
    }

    @Override
    public void info() {
        System.out.println("Имя кота: " + name);
        System.out.println("Скорость бега кота: " + speedOfRun);
        System.out.println("Кот плавать не умеет");
        System.out.println("Выносливость кота: " + endurance);

    }

}
