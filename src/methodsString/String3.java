package methodsString;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {

        String str = "ZOOM link";

        // .toLowerCase()
        System.out.println(str.toLowerCase());  // zoom link

        // .toUpperCase()
        System.out.println(str.toUpperCase()); // ZOOM LINK

        // .replace()
        System.out.println(str.replace('k', 'K'));
        System.out.println(str.replace("ZOOM", "Chanel"));

        // mutable / immutable

        // immutable
        String phone = "BlackBerry";
//        phone = "Fonex";
        phone.replace("BlackBerry", "Fonex"); // is ignored
        System.out.println(phone); // BlackBerry

        // mutable
        StringBuilder lapTop = new StringBuilder("Lenovo");
        lapTop.append(2022);
        System.out.println(lapTop);


        String cat1 = "cat";
        String cat2 = "cat";
        cat1.toUpperCase();
        System.out.println("Cat1: " + cat1);

        StringBuilder cat3 = new StringBuilder("cat");
        StringBuilder cat4 = new StringBuilder("cat");
        cat3.append(123);
        System.out.println("Cat3: " + cat3);

        String book = new String("Harry Potter");
        book.substring(0,5);
        System.out.println(book);

    }
}
