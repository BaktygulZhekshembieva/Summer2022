package home_works_online;

import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;

public class HW21_Arrays {
    public static void main(String[] args) {
        String [] planets = {"Mercury", "Venus", "Earth", "Mars",  "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));

        planets [0] = "Neptune";
        planets [7] = "Mercury";
        System.out.println(Arrays.toString(planets));

        Collections.swap(Arrays.asList(planets), 0,7 );
        System.out.println(Arrays.toString(planets));

        StringBuilder name = new StringBuilder(planets[1]);
        String str = name.reverse().toString();
        System.out.println(str);

    }
}
