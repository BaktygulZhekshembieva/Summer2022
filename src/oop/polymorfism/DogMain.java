package oop.polymorfism;

public class DogMain {
    public static void main(String[] args) {

        Dog laika = new Dog();
        System.out.println(laika.sumOfNums(23, 89));
        System.out.println(laika.sumOfNums(12, 11, 89));
        System.out.println(laika.sumOfNums(23,89));

        String str = "Hello Word";
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,5));

    }
}
