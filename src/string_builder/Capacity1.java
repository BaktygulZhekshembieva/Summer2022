package string_builder;

public class Capacity1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());// 16
//          12345
        sb1.append("Hello");            // 5 --> [16]
//          6789012345678901 (21)
        sb1.append("1234567890123456"); // 21 !--> (16 + 1) * 2 = [34]
//          23456
        sb1.append("salam");            // 26 --> [34]
//          78901234567890123456
        sb1.append("I believe I can fly!"); // 46 !--> (34 + 1) * 2 = [70]
        System.out.println(sb1.capacity());


        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println(sb1);
        System.out.println(sb2);

        String str1 = "Hello";
        String str2 = str1;
    }
}
