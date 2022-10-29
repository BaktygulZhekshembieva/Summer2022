package oop.animals;

import java.util.Arrays;

public class AnimalsMain2 {
    public static void main(String[] args) {

        Animals dog = new Animals("Rex", 5);

//        Animals monkey = new Animals();

        Animals giraffe = new Animals("Melman", 3);

        Animals cat = new Animals("Djack");

        Animals mouse = new Animals(1);

        Animals horse = new Animals();



        Animals o = new Animals("cat", 5, "kisa");

        o.voi(); // cats voice is aaaaaaaaaaa

        System.out.println(o.name + " " + o.age + " " + o.breed); //cat 5 kisa

        System.out.println(o.toString());
        // Animals{name='cat', age=5, breed='kisa'} --> auto to.String
        // name='cat, age=5, breed='kisa --> izmenila sama
        // cat
        // [cat]
    }
}
