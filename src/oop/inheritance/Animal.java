package oop.inheritance;

//super class --> parend class
public class Animal {

    public String name;
    protected int age;
    private int id;

    public Animal(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Animal() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String voice(){
        return "aaaaaa";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
