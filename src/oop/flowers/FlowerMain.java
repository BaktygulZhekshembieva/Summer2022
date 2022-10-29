package oop.flowers;

public class FlowerMain {
    public static void main(String[] args) {

        Plant object = new Plant("Flower", "white");
        System.out.println(object);
        System.out.println(object.blossom());

        Rose rose = new Rose("Rose", "red");
        System.out.println(rose);
        System.out.println(rose.blossom());

        Plant tulip = new Rose("Tulip", "Yellow");
        System.out.println(tulip);
        System.out.println(tulip.blossom());
        //Rose orchid = new Plant("Orchid", "Purple");

        Plant rose1 = new SprayRose("SpayRose1", "white");
        System.out.println(rose1.blossom());
        Rose rose2 = new SprayRose("SpayRose2", "blue");
        System.out.println(rose2.blossom());
        SprayRose rose3 = new SprayRose("SpayRose3", "purple");
        System.out.println(rose3.blossom());

        rose3.setColor("white");
        System.out.println(rose3);

        GolandRose golandRose = new GolandRose("Goland rose", "Red");
        System.out.println(golandRose.blossom());
        System.out.println(golandRose.threeButon());

        final String HOBBY = "dance";

        // final:

        // variable --> we cannot change value
        // method   --> we cannot override it
        // class    --> we cannot inherit




    }
}