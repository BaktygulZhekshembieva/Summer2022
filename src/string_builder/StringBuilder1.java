package string_builder;

public class StringBuilder1 {
    public static void main(String[] args) {

        String str = "";

        StringBuffer kk = new StringBuffer();

        StringBuilder sb = new StringBuilder(); // 16
        System.out.println(sb);

        //                                     1234567890123456 --> 16 + 16 = 32
        StringBuilder sb1 = new StringBuilder("Hello world!1234");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder(2);
        //          1234567890123456789012345678901 --> 31
        sb2.append("hi Java! It is me! How are you?");


        System.out.println("SB: " + sb.capacity());  //
        System.out.println("SB1: " + sb1.capacity());//
        System.out.println("SB2: " + sb2.capacity());//

        StringBuilder sb3 = new StringBuilder();  // 16
        //          1234567890
        sb3.append("James Bond");    // 10 --> 16
        //          123456
        sb3.append(" agent");       // 16 --> 16              // capacity -->16
        //         789   --> 19 + 16 = 35
        sb3.append(007);            // 19 !--> (16 + 1) * 2   // capacity --> 34
        //          01234567890 (30)
        sb3.append(" Will Smith");  // 30 --> 34
        //          12345678901 (41)
        sb3.append(" Elton John");  // 41 !--> (34 + 1) * 2   // capacity --> 70
        //          2345678901234   // 54 --> 70
        sb3.append(", Emily Clark");

        System.out.println(sb3.capacity());

        // (oldcapacity+1)X2
        // (     16   + 1) * 2

        StringBuilder sb4 = new StringBuilder(5);
        //          12
        sb4.append("Hi");      // 2 --> 5
        //          34567
        sb4.append("Hello");   // 7 !--> (5 + 1) * 2 = 12
        //          89012 (12)
        sb4.append("salam");   // 12 --> 12
        //          34567
        sb4.append("aloha");   // 17 !--> (12 + 1) * 2 = 26
        //          8901234567890 (30)
        sb4.append("Jenifer Lopes"); // 30 !--> (26 + 1) * 2 = 54
        System.out.println("SB4: " + sb4.capacity());

        StringBuilder sb5 = new StringBuilder(5);
        //          1234567890123  (13)
        sb5.append("Jenifer Lopes");
        //          4567890
        sb5.append("Britney"); // 20 --> (13 + 1) * 2 = 28
        //          12345678901
        sb5.append(" 1234567890"); // 31 --> (28 + 1) * 2 = 58
        System.out.println(sb5.capacity());

        StringBuilder sb6 = new StringBuilder(21);
        //          12345678901234567
        sb6.append("Nazira Sopubekova"); // 17 --> 21
        //          89012
        sb6.append("Erbol"); // 22 !--> (21 + 1) * 2 = 44


        System.out.println(sb6.capacity());

    }
}
