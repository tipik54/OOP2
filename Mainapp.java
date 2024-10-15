package ru.kaznu.ruslan.OOP2;

import ru.kaznu.ruslan.OOP2.animals.Cat;
import ru.kaznu.ruslan.OOP2.animals.Dog;
import ru.kaznu.ruslan.OOP2.animals.Horse;


public class Mainapp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bedog", 2, 2, 4);
        dog.info();
        dog.run(1);
        dog.info();
        dog.swim(1);
        dog.info();


    }
}
