package home_works_online;

public class HW4_2_AssigmentOper {
    public static void main(String[] args) {

        int num = 15;
        System.out.println(num + 5); //20
        System.out.println(num - 7); //8
        System.out.println(num * 2); //30
        System.out.println(num / 7); //2
        System.out.println(num % 7); //1
        System.out.println(++num); //16
        System.out.println(num++); //16
        System.out.println(num--); //17
        System.out.println(--num); //15

        int num1 = 15;

        num1 += 5;
        System.out.println(num1); //20

        num1 -= 5;
        System.out.println(num1); //15

        num1 *= 5;
        System.out.println(num1); //75

        num1 /= 5;
        System.out.println(num1); //15

        num1 %= 5;
        System.out.println(num1); //0
    }
}
