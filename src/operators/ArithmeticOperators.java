package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // Arithmetic operators

        // +
        int num1 = 36;
        int num2 = 78;
        int result = num1 + num2;
        System.out.println(result);

        // -
        int yearNow = 2022;
        int dateOfBirthArlen = 1999;
        int arlensAge = yearNow - dateOfBirthArlen;
        System.out.println("Arlens age: \t\t\t" + arlensAge);

        // *
        float priceOfApple = 50;
        float kg = 3;
        float threeKgOfApples = priceOfApple * kg;
        System.out.println("Three kgs of Apples: \t" + threeKgOfApples + "\fsom");

        System.out.println("Bishkek" + 3 + 1 + 2); // Bishkek312
        System.out.println(3 + 1 + 2 + "Bishkek"); // 6Bishkek
        System.out.println('B' + 2357 + "PL"); // 2423PL  -> 66 + 2357 = 2423
        System.out.println("B" + 2357 + "PL");  // B2357PL
        System.out.println(2 + 0 + 2 + 1 + " Iphone " + (1 + 3) + "Pro"); //5 Iphone 4Pro
        System.out.println( "Dreams come " + true + '!'); //Dreams come true!

        String movie = "Madagascar";
        String actor = "Alex";
        String actress = "Melmon";
        String str = movie + " players are " + actor + " & " + actress;
        System.out.println(str); //Madagascar players are Alex & Melmon
        System.out.println(str); // mojem vyzvat' neskol'lo raz
        System.out.println(str);

        // /
        long num3 = 348;
        long num4 = 11;
        long result3 = num3 / num4;
        System.out.println(result3); // 31

        // %
        float num5 = 348f;
        float num6 = 11f;
        float result4 = num5 % num6;
        System.out.println(result4); // 7.0 (okruglennyi ostatok)

        int n1 = 8;
        int n2 = 2;
        int r1 = n1 / n2; // 4
        int r2 = n1 % n2; // 0
        System.out.println(r1); //4
        System.out.println(r2); //0 (ostatok 0)

        int n3 = 9;
        int n4 = 5;
        int r3 = n3 / n4;
        int r4 = n3 % n4;
        System.out.println(r3); // 1
        System.out.println(r4); // 4

        // ++ increment

        int five = 5;
        System.out.println(five); //5
        five++;
        System.out.println(five); //6
        five++;
        System.out.println(five); //7
        five++;
        System.out.println(five); //8

        // prefix [++var]
        int ten = 10;
        ++ten;
        ++ten;
        ++ten;
        System.out.println(ten); //13

        // postfix [var++]
        int one = 1;
        one++; // 2
        one++; // 3
        one++; // 4
        ++one; // 5
        System.out.println(one++); // 5
        System.out.println(++one); // 7
        System.out.println(++one); // 8
        System.out.println(++one); // 9
        System.out.println(one); // 9
        System.out.println(one++); //9
        System.out.println(one); // 10

        // decrement --
        int seven = 7;
        --seven;  // 6
        System.out.println(--seven); // 5
        System.out.println(--seven); // 4
        System.out.println(--seven); // 3
        System.out.println(--seven); // 2
        System.out.println(--seven); // 1
        System.out.println(--seven); // 0
        System.out.println(--seven); // -1

        int three = 3;
        System.out.println(three--); // 3  [2]
        System.out.println(three--); // 2  [1]
        System.out.println(three--); // 1  [0]
        System.out.println(three--); // 0  [-1]
        System.out.println(three--); // -1 [-2]
        System.out.println(three); // -2

        int six = 6;
        System.out.println(six++); // 6 [7]
        System.out.println(++six); // 8
        System.out.println(six--); // 8 [7]
        System.out.println(six); // 7
        System.out.println(six--); // 7 [6]
        System.out.println(six--); // 6 [5]
        System.out.println(--six); // 4
    }
}
