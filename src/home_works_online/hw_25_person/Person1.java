package home_works_online.hw_25_person;

import java.util.HashMap;
import java.util.Map;

public class Person1 {
    public static void main(String[] args) {

        Person aza = new Person();
        aza.name = "Aza";
        aza.age = 25;

        Person baku = new Person();
        baku.name = "Baku";
        baku.age = 35;

        Person vika = new Person();
        vika.name = "Vika";
        vika.age = 30;

        Person gudi = new Person();
        gudi.name = "Gudi";
        gudi.age = 40;

        Person dina = new Person();
        dina.name = "Dina";
        dina.age = 45;

        Map<String, Integer> persons = new HashMap<>();
        persons.put(aza.name, aza.age);
        persons.put(baku.name, baku.age);
        persons.put(vika.name, vika.age);
        persons.put(gudi.name, gudi.age);
        persons.put(dina.name, dina.age);

        System.out.println(persons);

    }
}
