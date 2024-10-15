package ru.kaznu.ruslan.OOP2.animals;

public class Animal {

    String name;
    int speedOfRun;
    int speedOfSwim;
    int endurance;

    //Создаем конструкторы для придания свойств животным, конструкторов создаем 5 для возможности не запонять определенные свойства
    public Animal(String name, int speedOfRun, int speedOfSwim, int endurance) {
        this.name = name;
        this.speedOfRun = speedOfRun;
        this.speedOfSwim = speedOfSwim;
        this.endurance = endurance;
    }

    public Animal(String name, int speedOfRun, int speedOfSwim) {
        this(name, speedOfRun, speedOfSwim, 20);
    }

    public Animal(String name, int speedOfRun) {
        this(name, speedOfRun, 3, 20);
    }

    public Animal(String name) {
        this(name, 7, 3, 20);
    }

    public Animal() {
        this("Default Animal", 7, 5, 20);
    }

    public double run(int distance) {
        // Проверяем, достаточно ли выносливости у животного
        if (endurance < distance) {
            System.out.println(name + " устал и не может бежать.");
            return -1;
        }
        // Рассчитываем время затраченно на бег
        double time = (double) distance / speedOfRun;
        endurance -= distance; // Все животные на 1 метр бега тратят 1 ед выносливости, поэтому можно просто отнимать от выносливости дистанцию
        System.out.println(name + " пробежал " + distance + " метров за " + time + " секунд.");
        return time;
    }



    public void info() {
        System.out.println("Имя животного: " + name);
        System.out.println("Скорость бега животного: " + speedOfRun);
        System.out.println("Скорость плаванья животного: " + speedOfSwim);
        System.out.println("Выносливость животного: " + endurance);

    }

    public void voice() {
        System.out.println("Животное издало звук");
    }
}
