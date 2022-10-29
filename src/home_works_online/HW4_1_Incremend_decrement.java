package home_works_online;

public class HW4_1_Incremend_decrement {
    public static void main(String[] args) {

        // increment
        int num = 25;
        System.out.println(++num); //26
        System.out.println(num++); //26
        System.out.println(num++); //27
        System.out.println(++num); //29
        System.out.println(num++); //29
        System.out.println(num++); //30
        System.out.println(++num); //32
        System.out.println(num++); //32
        System.out.println(num++); //33

        // decrement
        int num1 = 37;
        System.out.println(--num1); //36
        System.out.println(num1--); //36
        System.out.println(--num1); //34
        System.out.println(--num1); //33
        System.out.println(num1--); //33
        System.out.println(num1--); //32
        System.out.println(--num1); //30
        System.out.println(--num1); //29
        System.out.println(num1--); //29

        // increment & decrement
        int num2 = 87;
        System.out.println(num2);   //87
        System.out.println(--num2); //86
        System.out.println(num2++); //86
        System.out.println(--num2); //86
        System.out.println(--num2); //85
        System.out.println(num2++); //85
        System.out.println(++num2); //87
        System.out.println(++num2); //88
        System.out.println(num2--); //88
        System.out.println(num2--); //87
        System.out.println(++num2); //87
    }
}
