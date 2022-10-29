package methodsString;

public class String1 {
    public static void main(String[] args) {

        String name = "James";

        String fullName = new String("James Bond");
        String str1 = "hello";
//        System.out.println(name);
//        System.out.println(fullName);
//
//        int num1 = 49;
//        num1 = 78;
//        num1 = 0;
//        num1 = 26;
//        System.out.println(num1);  // 26
//
//        str1 = "World";
        // optional: else, default, break
        // redundant: not using

        //             012345 --> index
        String word = "Nomads";
        //             123456 --? length

        System.out.println(word.length());     //6
        System.out.println(word.indexOf('s')); // 5
        System.out.println(word.indexOf('m')); // 2
        System.out.println(word.indexOf("ad")); // 3

        //               01234567890
        String phrase = "Good night!";
        System.out.println(phrase.indexOf("n")); // 5

        //                012345678901234567 8901 2345678901 --> index starts from 0
        String phrase2 = "I I believe I'm I \"fly\" can fly";
        //                123456789012345678 9012 34567 --> length starts from 1

        System.out.println(phrase2.indexOf("fly")); // 19
        System.out.println(phrase2.lastIndexOf("fly")); // 28
        System.out.println(phrase2.length()); // 31
        System.out.println(phrase2.lastIndexOf("\"")); // 22
        System.out.println(phrase2.indexOf("\"")); //18


        String str2 = "hello";
        boolean bool = str1.equals(str2);
        System.out.println(bool); //true

        // charAt()
        //               01234567890123456
        String lapTop = "MacMcBookMAc Pro";
        System.out.println(lapTop.charAt(3)); //M
        System.out.println(lapTop.indexOf('M',7)); //9
        System.out.println(lapTop.indexOf("MAc", 5)); //9
        System.out.println(lapTop.indexOf('T', 3)); //-1
        System.out.println(lapTop.indexOf('g', 90)); //-1
        System.out.println(lapTop.indexOf('R')); //-1
        System.out.println(lapTop.indexOf('P')); //13
        System.out.println(lapTop.indexOf('A')); // 10
        System.out.println(lapTop.charAt(10)); // A

        // concat()

        char ch1 = 65; // A
        System.out.println(ch1);
        char ch2 = 'A'; // A
        System.out.println(ch2);
        int num = ch2; // int num = 65;
        System.out.println(num);

    }
}
