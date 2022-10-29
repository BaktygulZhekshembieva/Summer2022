package practice_OOP.animals;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalsMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();

//        Beterinar animals = new Beterinar();
//        animals.treatAnimal(dog);
//        animals.treatAnimal(cat);
//        animals.treatAnimal(horse);
//        System.out.println("--> " + animals);


        ArrayList<Animals> animal = new ArrayList<>();
        animal.add(dog);
        animal.add(cat);
        animal.add(horse);

        Iterator iterator = animal.iterator();

        while (iterator.hasNext()){
            System.out.println(" -->" + iterator.next());
        }

    }
}