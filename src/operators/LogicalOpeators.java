package operators;

public class LogicalOpeators {
    public static void main(String[] args) {

        // && --> double ampersand (aksent na FALSE)
        // true - true = true
        // true - false = false
        // false - true = false
        // false - false = false

        int five = 5;
        int seven = 7;
        int ten = 10;
        int eleven = 11;

        //                5  <   7      10  <  11
        boolean bool1 = five > seven && ten > eleven;
        //                false          false

        boolean bool2 = 89 > 45 && 57 < 45;
        //              true       false

        System.out.println(bool2);

        // || double pipeline
        // TRUE
        // true - true = true
        // true - false = true
        // false - true = true
        // false - false = false

        //               false       false
        boolean bool3 = 78 < 67 || 34 > 90;
        System.out.println(bool3);

        // !
        //                 false
        //                 !=true  || false
        boolean bool4 = !(78 != 67 || 34 > 90); // false ! true
        //               ! (       true       )
        //                         false
        System.out.println(bool4);


        //              true       false
        boolean bool5 = !(12 > 90) || !(89 > 65);

        //               (   true  && false   )
        boolean bool6 = !(34 == 34 && 89 != 89);
        //              !( false)

        System.out.println(bool6);

        // !=   !


        boolean bool7 = !(46 != 45);
        System.out.println(bool7);

        boolean bool8 = false;
        boolean bool9 = 34 < 8; // bool9 = false
        boolean bool10 = 89 == 34; // bool10= false
    }
}
