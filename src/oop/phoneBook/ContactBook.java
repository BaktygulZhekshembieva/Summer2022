//package oop.phoneBook;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//public class ContactBook {
//
//    public Map<String, Contact> contactDB = new HashMap<>();  // компазиция; непримитивный тип данных Contact --> Object
//
//    public ContactBook(){
//    }
//
//    public void putContactInDB (String nameOfContact, Contact contact){
//        contactDB.put(nameOfContact,contact);
//    }
//
//    public Contact getContactInDB(String nameofContact){
//        return contactDB.get(nameofContact);
//    }
//
//    public Contact getContactInDb(String name) {
//        return contactDB.get(name);
//    }
//
//    public boolean isExistContactInDB (String key, Contact value) {
//        Iterator<String> iterator = contactDB.keySet().iterator();

//        if (contactDB.containsKey(key)) {
//            System.err.println("The key is already in the list");
//
//            return true;
//        } else {
//            while (iterator.hasNext()){
//                String keys = iterator.next();
//                if (value.getPhoneNumber().equals(contactDB.get(keys).getPhoneNumber())){
//                    System.err.println("This number already exists in contact " + contactDB.get(keys).getFirstname() + '\f'
//                            + contactDB.get(keys).getLastname());
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


//}