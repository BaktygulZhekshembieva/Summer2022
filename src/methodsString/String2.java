package methodsString;

public class String2 {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("Hello world");

        System.out.println(str1);
        System.out.println(str2);

//              0123456
        String phone = "SAMSUNG";
//              1234567  --> length [7]

// .length()
        System.out.println(phone.length());

// .indexOf()
        System.out.println(phone.indexOf('G')); // 6
        System.out.println(phone.indexOf('U')); // 4
        System.out.println(phone.indexOf("un")); // -1
        System.out.println(phone.indexOf('S', 2)); // 3
        System.out.println(phone.indexOf('S', 0)); // 0

// .lastIndexOf()
        System.out.println(phone.lastIndexOf('S')); // 3

// .charAt()
        System.out.println(phone.charAt(5)); // N
        System.out.println(phone.charAt(2)); // M

// .concat()
        String mark = "iPhone";
        String version = " 13Pro";
        String version2 = "Pro";
        int digit = 13;

        String result = mark.concat(version);
        String result2 = mark + digit + version2;
        String result3 = mark.concat(version2);
        System.out.println(result3); // iPhonePro

// subString()
        //              0123456789012345678
        String mouse = "Magic mouse is cool";
        System.out.println(mouse.substring(6)); // mouse
        System.out.println(mouse.substring(6,17)); // mouse is co
        System.out.println(mouse.substring(0,7)); // Magic m

// .trim()
        String juice = "     San        dora  ";
        System.out.println(juice.trim());

// .equals()

        boolean bool = "LapTop" == "Laptop";
        System.out.println(bool);

        String laptop1 = "acer";
        String laptop2 = "aCEr";

        if (laptop1 != laptop2 && laptop1 == "Lenovo"){
            System.out.println("That is true");
        } else {
            System.out.println("That is false");
        }

        boolean bool4 = true == false;
        System.out.println(bool4);

        System.out.println("Will Smith".equals("Will Smith"));

        boolean bool5 = "Leo".equals("leo");
        System.out.println(bool5);

        System.out.println("Elton John".equals(89));
        int one = 1;
        String lesson = "java";

        System.out.println("Programming language ".concat(lesson).concat(" is ") + one);

        String str3 = "Programming language ".concat(lesson).concat(" is ");
        System.out.println(str3 == "Programming language java is 1");
        System.out.println(str3.equals("Programming language java is 1"));

        String str4 = "12";
        System.out.println("For Talgat " + str4.equals(34));
        System.out.println("For Maral " + "one".equals(str4));
        lesson.length();
        int hello = "Hello".indexOf(0); // 5

// .equalsIgnoreCase()
        String student1 = "AzaMAt ".trim(); // [AzaMAt]
        String student2 = "aZAmat";         // [aZAmat]
//                 azamat                    azamat    // A : a, B:b, C:c;
        System.out.println(student1.equalsIgnoreCase(student2));

// Method chaining
        System.out.println("   HelLO woRlD!!!".trim().substring(0,5).indexOf('O'));
// [   HelLO woRlD!!!].trim() --> [HelLO woRlD!!!]
//  01234567890123
// [HelLO woRlD!!!].substring(0,5) --> [HelLO]
//  01234
// [HelLO].indexOf(2) -->

// pool && heap

// pool --> different variables with same values
        String color1 = new String("RED");
        String color2 = new String("RED");

//                                       pool        pool-heap      heap-heap
        boolean res1 = color1 == color2;      // true    -->    false   -->   false
        boolean res2 = color1.equals(color2); // true    -->    true    -->   true
        System.out.println(res2);

// pool --> "hi"
        String hi = "hi";
        String aloha = "hi";
        String salam = "hi";
        String privet = "hi";
        boolean bool7 = aloha == salam;      // true
        boolean bool8 = aloha.equals(salam); // true
        System.out.println("hi --> " + bool7);  // true
        System.out.println("hi --> " + bool8);  // true

//            1      2      3
// heap --> "bye", "bye", "bye"
        String bye = new String("bye");
        String poka = new String("bye");
        String adyos = new String("bye");
        boolean bool9 = poka == adyos;          // false
        boolean bool10 = poka.equals(adyos);    //
        System.out.println("bye --> " + bool9); // false
        System.out.println("bye --> " + bool10); // true

// ==        --> links
// .equals() --> values
    }
}
