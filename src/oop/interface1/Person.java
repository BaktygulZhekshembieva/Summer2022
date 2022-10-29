package oop.interface1;

public class Person implements Readable {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String read() {
        return this.name + " reads";
    }
}