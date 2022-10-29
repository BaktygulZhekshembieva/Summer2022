package oop.encapsulation;

public class CatMain {
    public static void main(String[] args) {

        Cat cat = new Cat(12345, "Lilly", 3);
        System.out.println(cat);
        System.out.println(cat.toString());
        // toString - readanted. gh

        cat.id = 56780;
        cat.name = "Kate";
//        cat.age --> ee ne vidno (private)
        System.out.println(cat);

        System.out.println(cat.getAge());
        cat.setAge(4);
        System.out.println(cat.getAge());

    }
}
