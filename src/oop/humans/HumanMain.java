package oop.humans;

public class HumanMain {
    public static void main(String[] args) {

        Human jake = new Human(12456283, "kmklmlk");

        jake.id = 12456789;
        jake.name = "Jake";
        jake.age = 29;

        System.out.println(jake.id);
        System.out.println(jake.name);
        System.out.println(jake.age);

        Human john = new Human(124568766);
        System.out.println(john.id);
        System.out.println(john.name);
    }
}
