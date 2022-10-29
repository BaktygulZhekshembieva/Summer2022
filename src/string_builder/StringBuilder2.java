package string_builder;

public class StringBuilder2 {
    public static void main(String[] args) {

        // .toString()
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" ");
        sb1.append("world!");
        System.out.println(sb1.toString());

        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(35);
        sb2.append(true);
        sb2.capacity();

        System.out.println(sb2.toString());
        System.out.println( sb2.length());
        System.out.println(sb2.capacity());

        // .insert()
        //                                     0123456
        StringBuilder sb3 = new StringBuilder("Philips");
        //01234567
        sb3.insert(3, 'O'); // PhiOlips
        System.out.println(sb3);
        sb3.insert(6,18);
        System.out.println(sb3);
        sb3.insert(0,true);
        System.out.println(sb3);

        // .replace()
        String str = "Amigo";
        System.out.println(str.replace('o', 'O'));

        //                                     0123456
        StringBuilder sb4 = new StringBuilder("Titanic");
        sb4.replace(1,4, "OOPS");
        System.out.println(sb4);

        // .revers()                           01234567890123        01234567890123       012345678901
        StringBuilder sb5 = new StringBuilder("Digital Nomads");  // sdamoN latigiD       sdaN latigiD
        sb5.reverse();
        System.out.println(sb5);

        // .delete()
        sb5.delete(3,5);
        System.out.println(sb5);
        sb5.deleteCharAt(5);
        System.out.println(sb5);

        // .subString()                        1234567890 10 + 16
        StringBuilder sb6 = new StringBuilder("Baby shark");
        System.out.println(sb6.substring(5));
        System.out.println(sb6.capacity());
    }
}
