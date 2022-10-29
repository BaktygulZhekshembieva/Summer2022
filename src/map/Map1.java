package map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        //               K        V
        //              key      value
        HashMap<Integer, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put(996, "KG");
        phoneNumbers.put(7, "RU");
        phoneNumbers.put(971, "UAE");
        phoneNumbers.put(90, "TR");
        phoneNumbers.put(39,"IT");
        phoneNumbers.put(1, "USA");
        phoneNumbers.put(82, "KR");
        phoneNumbers.put(23, "KR");
        System.out.println(phoneNumbers);
//        {1=USA, 82=KR, 996=KG, 7=RU, 39=IT, 23=KR, 90=TR, 971=UAE}


        int nums [] = new int[3];
        //index   value
        nums[0] = 359;
        nums[1] = 683;
        nums[2] = 825;
        System.out.println(nums); //[I@1b6d3586
        System.out.println(Arrays.toString(nums));  //[359, 683, 825]

        LinkedHashMap<String, String> abrev = new LinkedHashMap<>();
        abrev.put("USA", "United States of America");
        abrev.put("SK", "South Korea");
        abrev.put("KR", "Kyrgyz Republik");
        abrev.put("UI", "United Kingdom");
        abrev.put("RK", "Kazakh Republic");
        System.out.println(abrev);
        //{USA=United States of America, SK=South Korea, KR=Kyrgyz Republik, UI=United Kingdom, RK=Kazakh Republic}

        TreeMap<Character, Integer> unicode = new TreeMap<>();
        unicode.put('Q', 100);
        unicode.put('A', 0);
        unicode.put('<', 60);
        unicode.put('~', 1);
        System.out.println(unicode); //{<=60, A=0, Q=100, ~=1}

        TreeMap<String, Double> pricesOfFruits = new TreeMap<>();
        pricesOfFruits.put("Apple", 50.20);
        pricesOfFruits.put("Strawberry", 20.50);
        pricesOfFruits.put("Banana", 80.17);
        System.out.println(pricesOfFruits);
        //{Apple=50.2, Banana=80.17, Strawberry=20.5}

        TreeMap<String, Double> pricesOfVegetables = new TreeMap<>();
        pricesOfVegetables.put("Potato", 28.90);
        pricesOfVegetables.put("Onion", 37.47);
        pricesOfVegetables.putAll(pricesOfFruits);
        System.out.println(pricesOfVegetables);
//        {Apple=50.2, Banana=80.17, Onion=37.47, Potato=28.9, Strawberry=20.5}


        // .replace()
        pricesOfVegetables.replace("Potato", 56.27);
        System.out.println(pricesOfVegetables);
//       {Apple=50.2, Banana=80.17, Onion=37.47, Potato=56.27, Strawberry=20.5}
        pricesOfVegetables.replace("Strawberry", 20.5, 200.50);
        System.out.println(pricesOfVegetables);
//       {Apple=50.2, Banana=80.17, Onion=37.47, Potato=56.27, Strawberry=200.5}

        // .get()
        System.out.println(pricesOfVegetables.get("Apple")); // 50.2

        // .values()
        System.out.println(pricesOfVegetables.values());
//        [50.2, 80.17, 37.47, 56.27, 200.5]

        // .keySet()
        System.out.println(pricesOfVegetables.keySet());
//        [Apple, Banana, Onion, Potato, Strawberry]

        // .entrySet()
        System.out.println(pricesOfVegetables.entrySet());
//        [Apple=50.2, Banana=80.17, Onion=37.47, Potato=56.27, Strawberry=200.5]

        // .size()
        System.out.println(pricesOfVegetables.size()); // 5

        // .containsKey()
        System.out.println(pricesOfVegetables.containsKey("Onion")); // true

        // .containsValue()
        System.out.println(pricesOfVegetables.containsValue(56.27)); // true


        // .remove()
        System.out.println(pricesOfVegetables.remove("Banana", 80.17)); //true
//        System.out.println(pricesOfVegetables.remove("Onion")); // 37.47

        // .clear()
//        pricesOfVegetables.clear();
//        System.out.println(pricesOfVegetables); // {}

        // .isEmpty()
        System.out.println(pricesOfVegetables.isEmpty()); // false

        System.out.println(pricesOfVegetables);
        //  {Apple=50.2, Onion=37.47, Potato=56.27, Strawberry=200.5}


//        1
        Iterator<String> itr = pricesOfVegetables.keySet().iterator();
        while (itr.hasNext()){
            String keys = itr.next();
//            System.out.println(keys); //Apple Onion Potato Strawberry
            System.out.println(keys + " : " + pricesOfVegetables.get(keys));
//            Apple : 50.2 Onion : 37.47 Potato : 56.27m Strawberry : 200.5
        }

        System.out.println(pricesOfVegetables.get("Onion")); // 37.47
        System.out.println("______________");

//        2
        Iterator<Map.Entry<String, Double>> itr2 = pricesOfVegetables.entrySet().iterator();
        while (itr2.hasNext()){
            Map.Entry<String, Double> keyAndValue= itr2.next();
            System.out.println(keyAndValue.getKey() + " : " + keyAndValue.getValue());
        }
//        Apple : 50.2
//        Onion : 37.47
//        Potato : 56.27
//        Strawberry : 200.5

//        System.out.println(itr2.next());

        // Map: -> keys is unique, means doesn't work with duplicates, but value can be duplicated
        // 1. HashMap -> unpredictable order
        // 2. LinkedHashMap -> natural order
        // 3. TreeMap -> sorted order

        Map<Integer, String> nameData = new HashMap<>();
        nameData.put(1, "Azamat");
        nameData.put(2, "Alibek");
        nameData.put(7, "Kasiet");
        nameData.put(9, "Meerim");
        nameData.put(3, "Talgat");
        nameData.put(12, "Baku");
        nameData.put(4, "Atai");
        nameData.put(5, "Nargiza");
        nameData.put(0, "Asel'");
        System.out.println(nameData);
//        {0=Asel', 1=Azamat, 2=Alibek, 3=Talgat, 4=Atai, 5=Nargiza, 7=Kasiet, 9=Meerim}
    }
}
