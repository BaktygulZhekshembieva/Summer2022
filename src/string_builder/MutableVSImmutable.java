package string_builder;

public class MutableVSImmutable {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Sherlock");
        StringBuilder sb2 = new StringBuilder("Sherlock");
        String str = new String("Sherlock");

        boolean compare3 = sb2.equals(str);
        System.out.println(compare3);

        // ==
        boolean compare1 = sb1 == sb2;
        System.out.println(compare1);

        // .equals()
        boolean compare2 = sb1.equals(sb2);
        System.out.println(compare3);

        System.out.println(sb1.equals(str));

        StringBuffer buff = new StringBuffer("Hello");
        StringBuilder build = new StringBuilder("Hello");
        System.out.println(buff.equals(build));
        System.out.println(buff.equals(str));
        System.out.println(build.equals(str));

        System.out.println(str.equals(sb1));
        System.out.println(str.equals(sb2));
        System.out.println(str.equals(build));
        System.out.println(str.equals(buff));

        System.out.println(str.equals(build.toString()));

        StringBuffer buff1 = new StringBuffer();
        System.out.println(buff1.capacity());
        System.out.println(buff1.append("BuFF buff"));

        // StringBuffer   | old | thread save     |  slowly

        // StringBuilder  | new | not thread save |   fast

        StringBuffer buff3 = new StringBuffer("Phone");
        buff3.insert(0, 'I');
        System.out.println(buff3);
    }
}
