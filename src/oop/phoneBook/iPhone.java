package oop.phoneBook;

import java.util.LinkedHashMap;
import java.util.Map;

public class iPhone {

    static String name;
    public static void main(String[] args) {
        Contact atay = new Contact("Atay", "Turdubaev", "055529575");
        Contact nooruzbek = new Contact("Nooruzbek", "Taalaibek uulu", "055584575");
        Contact alibek = new Contact("Alibek", "Atageldiev", "055529845");
        Contact kiril = new Contact("Kiril", "Manov", "055590575");
        Contact tilek = new Contact("Tilek", "Bektenov", "055554575");
        Contact begimay = new Contact("Begimay", "Smanova", "055534575");
        Contact aiperi = new Contact("Aiperi", "Bozoeva", "055699575");
        Contact azamat = new Contact("Azmat", "Turdubekov", "055009575");

//        ContactBook contactBook = new ContactBook();
////                                  String name,   Contact contact
//        contactBook.putContactInDB(atay.getFirstName(), atay);
//        contactBook.putContactInDB("Nooruzbek", nooruzbek);
//
//        System.out.println(contactBook.toString());
//        System.out.println(contactBook.contactDB);
//
//        //                            age, fName, lName, phoneNum . "+996222222220".        "0222222220"
//        System.out.println(contactBook.getContactInDb("Atay").getPhoneNumber().replace("+996", "0"));
//
//        Map<Integer, String> students = new LinkedHashMap<>();
//        students.put(1, "Pirjan");
//        students.put(2, "Gul'bara");
//        System.out.println(students);
//
//
//        contactBook.putContactInDB(alibek.getFirstName(),alibek);
//        contactBook.putContactInDB(kiril.getFirstName(),kiril);
//        contactBook.putContactInDB(tilek.getFirstName(),tilek);
//        contactBook.putContactInDB(begimay.getFirstName(),begimay);
//        contactBook.putContactInDB(aiperi.getFirstName(),aiperi);
//        contactBook.contactDB.put("Azamat", azamat);
//        System.out.println(contactBook.contactDB);
//
//        System.out.println(contactBook.getContactInDB("Azamat"));
//        System.out.println(contactBook.getContactInDB("Begimay").getPhoneNumber());

//        Map<String, Contact> contactsBook = new HashMap<>();
//        Contact katerina = new Contact("Katerina", "Klimushins", "546245");
//        contactsBook.put("Iphone", katerina);
////        System.out.println(contactsBook.get("Iphone"));
//        System.out.println(contactsBook);


    }
}