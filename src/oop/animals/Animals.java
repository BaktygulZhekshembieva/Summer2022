package oop.animals;

import com.sun.javafx.collections.MappingChange;

import java.util.Locale;
import java.util.Map;

public class Animals {

    String name;
    Integer age;
    String breed;



    public Animals(){

    }

    //constructor --> special method
    public Animals(String aName, int aAge){
        name = aName;
        age = aAge;
    }

    public Animals(String anName){
        name = anName;
    }


    public Animals(int age){
        this.age = age;
    }

//   ait + insert --> dlya windows
//    command + N --> dlya MAC


    public Animals(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Animals(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public Animals(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    
    public void  voice(){
        System.out.println("Voice, voice");
    }

    public void voi(){
        System.out.println(this.name + "s voice is aaaaaaaaaaa");
    }

//    @Override
//    public String toString() {
//        return "Animals{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", breed='" + breed + '\'' +
//                '}';
//    }

    //    @Override
//    public String toString() {
//        return "name='" + name +
//                ", age=" + age +
//                ", breed='" + breed;
//    }


//    @Override
//    public String toString() {
//        if (name.equals(name.toLowerCase())) {
//            return name;
//        } else {
//            return "null";
//        }
//    }

    @Override
    public String toString() {
        String result;
        if (name.equals(name.toLowerCase())) {
            result = "[".concat(name).concat("]");
            return result;
        } else {
            return "null";
        }
    }
}
