package oop.interface1;

import java.util.ArrayList;
import java.util.List;

public class DemoBook {
    public static void main(String[] args) {

        // class                      class
        HarryPotter harryPotter = new HarryPotter("Harry Potter", "JK Rowling", 600);
        harryPotter.setAudioBook(true);
        System.out.println(harryPotter.listening());
        System.out.println(harryPotter.print());
        System.out.println(harryPotter.read());

        // interface                 class
        Printable harryPotter2 = new HarryPotter("Harry Potter - 'Chamber of fire'", "JK Rowling", 769);
        System.out.println(harryPotter2.print());

        Readable harryPotter3 =new HarryPotter("vdfbs", "fvsdv", 2345);
        System.out.println(harryPotter3.read());


        ArrayList<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        Person person = new Person("Jake", 46);
        System.out.println(person.read());

    }
}
