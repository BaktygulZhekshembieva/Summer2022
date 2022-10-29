package oop.humans;

public class Human {

    protected int id;
    public String name;
    public int age;


    public String read(){ // method
        return "Reading";
    }

//     String read(){  // method
//         // implenentation
//        return "Reading";
//     }

    public Human(){ // constructor

    }

    public Human(int myId){ // constructor
        id = myId;
    }

    public Human(int myId, String myName){ // constructor
        id = myId;
        name = myName;
    }

    public Human(int id, String name, int age) {
        this.id = id;

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int id, int age) {
        this.id = id;
        this.age = age;
    }
}
