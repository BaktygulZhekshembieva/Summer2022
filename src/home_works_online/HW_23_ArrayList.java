package home_works_online;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HW_23_ArrayList {
    public static void main(String[] args) {

        Character[] symbol = {'A', 'B', 'C', 'D', 'E'};

        List<Character> symbolList = Arrays.asList(symbol);
//        System.out.println(symbolList);

        System.out.println("______________________");

//
        if (symbolList.size() == 5 && symbolList.contains('E')){
//            symbolList.add('F');
            System.out.println(symbolList.add('F'));
        }


//        List<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
//        System.out.println(alphabets);
//        String e = "E";
//
//        alphabets.add(e);
//        System.out.println(alphabets);

    }
}

