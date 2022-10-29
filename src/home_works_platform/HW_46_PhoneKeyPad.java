package home_works_platform;

import java.util.Scanner;

public class HW_46_PhoneKeyPad {
    public static void main(String[] args) {
        phoneKeyPad1();
        phoneKeyPad2();
    }
    static void phoneKeyPad1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String str = scanner.next().toUpperCase();

        int digit = 1;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A': case 'B': case 'C':
                    digit = 2; break;
                case 'D': case 'E': case 'F':
                    digit = 3; break;
                case 'G': case 'H': case 'I':
                    digit = 4; break;
                case 'J': case 'K': case 'L':
                    digit = 5; break;
                case 'M': case 'N': case 'O':
                    digit = 6; break;
                case 'P': case 'Q': case 'R': case 'S':
                    digit = 7; break;
                case 'T': case 'U': case 'V':
                    digit = 8; break;
                case 'W': case 'X': case 'Y': case 'Z':
                    digit = 9;break;
            }
            System.out.print(digit);
        }
        System.out.println();
    }

    static void phoneKeyPad2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String str = scanner.next().toUpperCase();

        int digit = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C')
                digit = 2;
            else if (str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F')
                digit = 3;
            else if (str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I')
                digit = 4;
            else if (str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L')
                digit = 5;
            else if (str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O')
                digit = 6;
            else if (str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S')
                digit = 7;
            else if (str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V')
                digit = 8;
            else if (str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z')
                digit = 9;
            System.out.print(digit);
        }
    }
}

