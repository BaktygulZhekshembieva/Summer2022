package array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList2 {
    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList<>();
        days.add("Понедельник");
        days.add("Вторник");
        days.add("Среда");
        days.add("Четверг");
        days.add("Пятница");
        days.add("Суббота");
        days.add("Воскресенье");
        System.out.println(days);

        String [] days2 = new String[5];
        days2 [0] = days.get(0);
        days2 [1] = days.get(1);
        days2 [2] = days.get(2);
        days2 [3] = days.get(3);
        days2 [4] = days.get(4);
        System.out.println(Arrays.toString(days2));

        for(int i=0; i<days2.length;i++){
            System.out.println(i+1+ "-" +days2[i]);
        }

        System.out.println("_________________________");

        int [] name = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < name.length; i++){
            sum= sum + name[i];
        }
        System.out.println(sum);

        System.out.println("_________________________");

        String [] names = {"Islam", "Bema", "Azamat"};
        for (int i = names.length-1; i >= 0; i--){
            System.out.println(names[i]);
        }

    }
}
