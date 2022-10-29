import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Iterator1 {
    public static void main(String[] args) {

        TreeMap<String, Double> pricesOfFruits = new TreeMap<>();
        pricesOfFruits.put("Apple", 50.20);
        pricesOfFruits.put("Strawberry", 20.50);
        pricesOfFruits.put("Banana", 80.17);
        System.out.println(pricesOfFruits); //{Apple=50.2, Banana=80.17, Strawberry=20.5}

        TreeMap<String, Double> pricesOfVegetables = new TreeMap<>();
        pricesOfVegetables.put("Potato", 28.90);
        pricesOfVegetables.put("Onion", 37.47);
        pricesOfVegetables.putAll(pricesOfFruits);
        System.out.println(pricesOfVegetables);

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
    }
}
