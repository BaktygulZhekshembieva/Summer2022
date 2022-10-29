package array_list;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        int [] num = {78,12,3,1,7,9,3};

        // Generic
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Clark");
        list1.add("John");
        list1.add("Kate");
        System.out.println(list1); //[Clark, John, Kate]

        for (String i : list1){
            System.out.println(i);
        } //Clark
          // John
          // Kate

        // non generic
        ArrayList list2 = new ArrayList();
        list2.add("Will");
        list2.add('K');
        list2.add(456);
        list2.add(99);
        list2.add(true);

        System.out.println(list2); //[Will, K, 456, 99, true]

        for (Object i : list2){
            System.out.println(i);
        } //Will
          // K
          // 456
          // 99
          // true

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(555);
        list4.add(90);
        list4.add(17);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(90);
        list3.add(67);
        list3.add(10);
        list3.addAll(list2);
        System.out.println(list3); //[90, 67, 10, Will, K, 456, 99, true]
        System.out.println(list3.get(2)); // 10

//        list3.add(list2.get(0)); // ошибка т.к. типы разные

        list3.add(list4.get(0));
        System.out.println(list3); //[90, 67, 10, Will, K, 456, 99, true, 555]

        list3.addAll(list4);
        System.out.println(list3); //[90, 67, 10, Will, K, 456, 99, true, 555, 555, 90, 17]

        System.out.println(list3.remove(0)); // 90
        System.out.println(list3); //[67, 10, Will, K, 456, 99, true, 555, 555, 90, 17]
        System.out.println(list3.remove(4)); // 456
        System.out.println(list3); //[67, 10, Will, K, 99, true, 555, 555, 90, 17]

        System.out.println("----> " + list3.removeAll(list2));   //----> true
        System.out.println(list3); //[67, 10, 555, 555, 90, 17]

        System.out.println("----> " + list3.containsAll(list2)); //----> false
        System.out.println(list3); // [67, 10, 555, 555, 90, 17]


        ArrayList<String> listOfColors = new ArrayList<>();
        listOfColors.add("Yellow");
        listOfColors.add("Black");
        listOfColors.add("Green");
        listOfColors.add("Blue");
        listOfColors.add("Purple");
        System.out.println(listOfColors);                   // [Yellow, Black, Green, Blue, Purple]
        System.out.println(listOfColors.remove(1));   // Black
        System.out.println(listOfColors);                   // [Yellow, Green, Blue, Purple]
        System.out.println(listOfColors.remove("Blue")); // true
        System.out.println(listOfColors);                   // [Yellow, Green, Purple]

        System.out.println(listOfColors.get(2)); //Purple
        System.out.println(listOfColors.isEmpty()); //false
        System.out.println(listOfColors.size()); // 3

        System.out.println(listOfColors.contains("Green")); //true
        System.out.println(listOfColors.contains("Purple"));//true
        System.out.println(listOfColors.contains("Black")); //false

        listOfColors.clear();
        System.out.println(listOfColors); //[]
        System.out.println(listOfColors.isEmpty()); //true

    }
}
