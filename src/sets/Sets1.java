package sets;

import java.util.*;

public class Sets1 {
    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        set1.add(12);
        set1.add("Hello");
        set1.add('I');
        System.out.println(set1); //[Hello, I, 12]


        HashSet<Character> set2 = new HashSet<>(); // unpredictable order, works with unique values
        set2.add('L'); // 0
        set2.add('B'); // 1
        set2.add('p'); // 2
        set2.add('W'); // 3
        set2.add('W');
        set2.add('x'); // 5
        set2.add('D'); // 6
        set2.add('W');
        System.out.println(set2); //[p, B, D, W, x, L]

        LinkedHashSet<String> setColor = new LinkedHashSet<>(); // natural order
        setColor.add("Blue");
        setColor.add("Red");
        setColor.add("White");
        setColor.add("Green");
        setColor.add("Red");
        setColor.add("blue");
        setColor.add("Black");
        System.out.println(setColor); //[Blue, Red, White, Green, blue, Black]

        TreeSet<Integer> sizes = new TreeSet<>(); // sorted order
        sizes.add(42);
        sizes.add(54);
        sizes.add(40);
        sizes.add(52);
        sizes.add(48);
        sizes.add(48);
        sizes.add(50);
        System.out.println(sizes); //[40, 42, 48, 50, 52, 54]

        // Set -> interface
        // 1. HashSet
        // 2. LinkedHashSet
        // 3. TreesSet

        Set<Double> prices = new HashSet<>();
        prices.add(45.78);
        prices.add(36.90);
        prices.add(9.10);
        prices.add(51.7);
        System.out.println(prices); // [36.9, 9.1, 51.7, 45.78]

        Set<Double> prices2 = new LinkedHashSet<>(prices);
        System.out.println(prices2); //[36.9, 9.1, 51.7, 45.78] без сорта т.к. соут вызван до него

        Set<Double> prices3 = new TreeSet<>(prices2);
        System.out.println(prices3);// [9.1, 36.9, 45.78, 51.7]

        System.out.println(prices3.size()); // 4
        System.out.println(prices3.contains(36.9)); // true
        System.out.println(prices3); // [9.1, 36.9, 45.78, 51.7]

        Set<Double> set4 = new TreeSet<>();
        set4.add(12.7);
        set4.add(34.90);
        set4.add(8.12);
        set4.add(47.67);
        System.out.println(set4); //[8.12, 12.7, 34.9, 47.67]
        System.out.println(set4.contains(8.12)); // true
        set4.addAll(prices3);
        System.out.println(set4);//[8.12, 9.1, 12.7, 34.9, 36.9, 45.78, 47.67, 51.7]
        System.out.println(set4.containsAll(prices3)); //true

//        for (Double i : set4){
        //            i = 8.12
        //            i = 9.1
        //            i = 12.7
        // ...................
//            System.out.println(i);
//        }


        Iterator<Double> iterator = set4.iterator();
        //
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Set: -> values is unique, means doesn't work with duplicates
        // 1. HashSet -> unpredictable order
        // 2. LinkedHashSet -> natural order
        // 3. TreeSet -> sorted order

        // ArrayList -> access fo elements
        // LinkedList -> long list
    }
}
