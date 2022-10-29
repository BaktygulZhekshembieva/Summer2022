package home_works_online;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HW_24_Map {
    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'A');
        map.put(9, 'G');
        map.put(5, 'L');
        map.put(8, 'P');
        map.put(0, 'Y');
        map.put(3, 'T');
        System.out.println(map);

        for (Integer i: map.keySet()) {
            System.out.println(i + " : " + map.get(i));
        }

        System.out.println("________________________");

        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("________________________");

        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });


    }
}
