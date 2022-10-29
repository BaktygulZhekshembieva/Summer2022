package codingBat;

public class Recursion1 {
    public static void main(String[] args) {

//        System.out.println(factorial(4));

//        System.out.println(bunnyEars(3));

//        System.out.println(fibonacci(3));

//        System.out.println(triangle(2));

        System.out.println(sumDigits(111));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }

    public static int triangle(int rows) {
        if (rows == 0 || rows == 1) {
            return rows;
        } else {
            return rows + triangle(rows - 1);
        }
    }

    public static int sumDigits(int n) {
        if (n <= 9 ) {
            return n;
        } else {
            return sumDigits(n % 10) + sumDigits(n / 10);
        }
    }
}
