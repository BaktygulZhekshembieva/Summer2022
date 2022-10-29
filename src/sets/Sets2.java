package sets;

import java.util.*;

public class Sets2 {
    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        list.add('E');
        list.add('E');
        list.add('o');
        list.add('A');
        list.add('c');
        list.add('F');
        list.add('F');
        list.add('a');
        list.add('G');
        System.out.println(list);

        HashSet<Character> symbols1 = new HashSet<>(list);
        System.out.println(symbols1);

        TreeSet<Character> symbols2 = new TreeSet<>(symbols1);
        System.out.println(symbols2);
    }
}
