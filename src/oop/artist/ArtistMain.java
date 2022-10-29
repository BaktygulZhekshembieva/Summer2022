package oop.artist;

import java.util.Scanner;

public class ArtistMain {
    public static void main(String[] args) {


        Artist song = new Singer("Singer");
        Artist rap = new Rapper("Rapper");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"Singer\" or \"Rapper\"");
        String enter = scanner.next();

        if (enter.equalsIgnoreCase(song.toString())){
            System.out.println(song.sing());
        }else if(enter.equalsIgnoreCase(rap.toString())) {
            System.out.println(rap.sing());
        }else {
            System.out.println("Enter \"Singer\" or \"Rapper\"");
        }

    }
}
