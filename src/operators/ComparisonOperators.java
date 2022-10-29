package operators;

public class ComparisonOperators {
    public static void main(String[] args) {

        // ==
        int num1 = 58;
        int num2 = 90;
        boolean compare = num1 == num2;
        System.out.println(compare);

        // !=
        boolean compare2 = 12 != 12;
        System.out.println(compare2);

        // >
        boolean compare3 = num1 > num2;   // 58 > 90
        System.out.println(compare3);

        // <
        boolean compare4 = num1 < num2;
        System.out.println(compare4);

        // >=
        int num3 = 47;
        int num4 = 47;
        boolean compare5 = num3 >= num4;  // 95 >= 95  > true | == false
        System.out.println(compare5);

        // <=
        boolean compare6 = num3 <= num4;  // 95 <= 47
        System.out.println(compare6);
    }
}
