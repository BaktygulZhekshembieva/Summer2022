package array_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {

        ArrayList<String> listLang = new ArrayList<>();
        listLang.add("Java");
        listLang.add("Python");
        listLang.add("Swift");
        listLang.add("Kotlin");
        listLang.add("C++");
        listLang.add("JavaScript");
        System.out.println("ArrayList: " + listLang);

        LinkedList<String> linkedLang = new LinkedList<>();
        linkedLang.addAll(listLang);
        linkedLang.addFirst("C#");
        System.out.println(linkedLang);
        linkedLang.addLast("PHP");
        System.out.println(linkedLang);
        linkedLang.removeFirst();
        System.out.println("LinkedList: " + linkedLang);

        List<String> list2 = new ArrayList<>();

        List<String> list3 = new LinkedList<>();

        LinkedList list4 = new LinkedList();
        list4.add("Yellow");
        list4.add("Red");
        list4.add(true);



        ArrayList<Integer> list11 = new ArrayList<>();
        list11.add(12);
        list11.add(8);
        list11.add(297);
        System.out.println("ArrayList: " + list11 + "\n" + list11.get(0));

        LinkedList<Integer> list12 = new LinkedList<>(list11);
        System.out.println("LinkedList: " + list12 + "\n" + list12.get(0));


    }
}
