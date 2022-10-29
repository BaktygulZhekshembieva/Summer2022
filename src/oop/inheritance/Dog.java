package oop.inheritance;

//sub class --> child class
public class Dog extends Animal{

    public String bread;

    public Dog(String name, int age, int id) {
        super(name, age, id);
    }

    public Dog(String name, int age, int id, String bread) {
        super(name, age, id);
        this.bread = bread;
    }

    public Dog(String bread) {
        super();
        this.bread = bread;
    }



    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + getId() +
                '}';
    }
}
