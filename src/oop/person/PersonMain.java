package oop.person;

public class PersonMain {
    public static void main(String[] args) {

        Person singer = new Person();
        singer.name = "Methun Chakrovori";
        singer.age = 59;
        singer.gender = 'm';
        singer.height = 1.78;
        singer.name = "Shahrukh Khan";

        System.out.println(singer.gender); // m

        System.out.println("Name: " + singer.name + "\n" +
                            "Age: " + singer.age + "\n" +
                            "Gender: " + singer.gender + "\n" +
                            "Height: " + singer.height);
//        Name: Methun Chakrovori
//        Age: 59
//        Gender: m
//        Height: 1.78

        System.out.println(singer.dance());
        System.out.println(singer.sleep());

        System.out.println("____________");

        Person dancer = new Person(); //Person-snablon, dancer-object
        System.out.println("Name: " + dancer.name + "\n" +
                "Age: " + dancer.age + "\n" +
                "Gender: " + dancer.gender + "\n" +
                "Height: " + dancer.height);
    }
}
