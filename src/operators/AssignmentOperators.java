package operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        // =    (x=5 => x=5)
        String operator = "multiple";

        // +=   (x +=5 => x=x+5)
        int num1 = 10;
        int num2 = 8;
        int result = num1 + num2;
        System.out.println(result);

        num1 += num2; // num1 = num1 + num2  --> num1 = 10 + 8 --> num1 = 18
        System.out.println(num1);

        //naznachenie i perenaznachenie

        int num = 12;  // assign
        num = 90;      // reassign
        num = 17;      // reassign

        num += 5; // num = 22; // eto perenaznachenie
        System.out.println(num);

    }
}
