package data_types;

public class SpecialCharacters {
    public static void main(String[] args) {
        String phone = "iPhone 13 pro";
        System.out.println(phone);

        // /t
        String phone2 = "Samsung S22 Ultra";    // Samsung S22 Ultra
        String phone3 = "Samsung \tS22 Ultra";  // Samsung     S22 Ultra
        System.out.println(phone2);
        System.out.println(phone3);

        // \b
        String laptop = "MacBook Pro";    // MacBook Pro
        String laptop1 = "MacBook \bPro"; // MacBookPro
        System.out.println(laptop);
        System.out.println(laptop1);

        // \n
        String count = "OneTwo";    // OneTwo
        String count1 = "One\nTwo"; // One
        // Two
        System.out.println(count);
        System.out.println(count1);

        // \r

        String book1 = "Harry Potter";   // Harry Potter
        String book2 = "HE was born Harry \rPotter"; // Potter
        System.out.println(book1);
        System.out.println(book2);

        // \f
        String lang1 = "Java language";
        String lang2 = "Java \flanguage";
        System.out.println(lang1);
        System.out.println(lang2);

        // '
        String my1 = "I\'m tester";
        String my2 = "I'm tester";
        System.out.println(my1);
        System.out.println(my2);

        // \""
        String phrase = "She said - \"missing you\"";
        String phrase1 = "She said - 'missing you'";
        System.out.println(phrase);

        // \\
        String streets = "Ahunbaeva/Belinka";
        String streets1 = "Ahunbaeva\\Belinka";  // Ahunbaeva\Belinka
        System.out.println(streets1);

        System.out.println("Dima Bi\blan"); // Dima Bilan
                                            // Dima Blan
        System.out.println("->Dima Bila\rn"); // Dima Bilan
                                              // n


        // I am   --> I'm
        // cat --> cat's
        // Daite mne znat'

        char ch = 'K';
        String str = "Daddy";
        String password = "Bish2102kek$312";

        int number = 1;
        System.out.println(number);

        String str1 = "   Hello   "   ;
        System.out.println(str1);

        byte num1 = 125;
        int num2 = 32678;

        // reassign (perenaznachenie)
        num2 = num1; // num2 = 32678;  num2 = 125;
        System.out.println(num2);  // 125

        byte num3 = 120;
        short num4 = 45;
        // casting
        num3 = (byte)num4; // byte = byte range; byte = short;
        // byte = byte
        System.out.println(num3);

        byte num5 = 113;
        short num6 = 99;

//        num5 = (byte)num6;
//        System.out.println(num5);

        int num7 = 1234567890;
        long num8 = 1234567890;

        num7 = (int)num8;
        System.out.println(num7);
    }
}
