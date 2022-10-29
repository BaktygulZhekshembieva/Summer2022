package oop.movie;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ActorMain {
    public static void main(String[] args) {

        ArrayList<String> pittLists = new ArrayList<>();
        pittLists.add("Mr & Mrs Smith");
        pittLists.add("Ones upon a time");

        // 1                              String       int      arraylist
        Actor bredPitt = new Actor("Bred Pitt", 47, pittLists);


        Map<String, Integer> oscarMovies = new LinkedHashMap<>();
        oscarMovies.put("Man in black", 1999);
        oscarMovies.put("I'm a legend", 2008);

        // 2                               String       map
        Actor willSmith = new Actor("Will Smith", oscarMovies);



//        Actor tomHardy  = new Actor("Tom Hardy", 55, "Venom");
//        Actor leoDi = new Actor("Leonardo Dicaprio", 61, "Titanic");
//        Actor chokmorov = new Actor("Suimonkul Chokmorov", 55, "Red apple");
//        Actor johnyDepp = new Actor("Johny Depp", 49, "Pirates of Caribbean");
//

    }
}
