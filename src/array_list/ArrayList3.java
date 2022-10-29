package array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1.add(67);
        list1.add("Hi");
        list1.add("Aloha");
        list1.add(true);

        Iterator iter1 = list1.iterator();

        System.out.println(iter1.next()); // 67
        String str = iter1.next().toString(); // Hi
        Character str2 = str.charAt(0);
        System.out.println(str2); // H


    }
}
