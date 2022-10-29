package array_list;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
//        ArrayList<String> capitals = new ArrayList<>();
//        capitals.add("Bishkek");
//        capitals.add("London");
//        capitals.add("DC Washington");
//        capitals.add("Nur-Sultan");
//        capitals.add("Istanbul");
//        capitals.add("Dubai");
//        System.out.println(capitals);

//        [Bishkek, London, DC Washington, Nur-Sultan, Istanbul, Dubai]
//
//        Collections.sort(capitals);
//        System.out.println(capitals);
//        [Bishkek, DC Washington, Dubai, Istanbul, London, Nur-Sultan]

//        Iterator<String> iter = capitals.iterator();
//        System.out.println(iter.next()); // Bishkek
//        System.out.println(iter.next()); // DC Washington
//        System.out.println(iter.next()); // Dubai
//        System.out.println(iter.next()); // Istanbul
//        System.out.println(iter.next()); // London
//        System.out.println(iter.next()); // Nur-Sultan
//        System.out.println(iter.next()); // error

//чтобы через соут все не выводит, используем while
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        Bishkek
//        DC Washington
//        Dubai
//        Istanbul
//        London
//        Nur-Sultan

//        System.out.println("___________________");

//        перебор через обычный цикл
//        for (int i = 0; i<capitals.size(); i++){
//            System.out.println(capitals.get(i));
//        }
//        Bishkek
//        DC Washington
//        Dubai
//        Istanbul
//        London
//        Nur-Sultan

//        System.out.println("___________________");

//        удалим элемент 1
//        for (int i = 0; i<capitals.size(); i++){
//            if (capitals.contains("London")){
//                capitals.remove(4);
//            }
//            System.out.println(capitals.get(i));
//        }
//  Bishkek
//  DC Washington
//  Dubai
//  Istanbul
//  Nur-Sultan

//        System.out.println("___________________");
//
//        ArrayList list1 = new ArrayList();
//        list1.add(12);
//        list1.add(678);
//        list1.add("Word");
//        list1.add('P');

//        Collections.sort(list1);
//        System.out.println(list1); // errer --> non generic

//        Iterator iter1 = list1.iterator();
//        while (iter1.hasNext()){
//            System.out.println(iter1.next());
//        }
//        12
//        678
//        Word
//        P

//          String [] names = {"John", "Elon", "Mark", "Jeff", "Justin"};
//
//        List<String> namesList = Arrays.asList(names);
//        System.out.println(namesList);
//
//        List<Integer> yearList = new ArrayList<>();
//        yearList.add(2022);
//        yearList.add(2020);
//        yearList.add(2021);
//        System.out.println(yearList);

//        ArrayList<String> students = new ArrayList<>();
//        students.add("Baha");
//        students.add("Bema");
//        students.add("Baku");
//        students.add("Burul");
//        students.add("Belek");

//        Iterator<String> it = students.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        for (int i = 0; i < students.size(); i++){
//            if (students.contains("Belek")){
//                students.remove(4);
//            }
//        }
//        System.out.println(students);
//
//        int i = 0;
//        while (i < students.size()){
//            if (students.contains("Bema")){
//                students.remove(1);
//            }
//            i++;
//        }
//        System.out.println(students);


    }
}
