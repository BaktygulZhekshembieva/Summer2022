package loops;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i >= -3) {
            System.out.println(i + "" + " While loop");
            i--;
        } //0 While loop
//        -1 While loop
//        -2 While loop
//        -3 While loop

        int j = 0;
        while (j <= 3) {
            System.out.println(j + " Hello World");
            j++;
        } //0 Hello World
//        1 Hello World
//        2 Hello World
//        3 Hello World

        int k = 0;
        while (k >= 3 && k <= 3) {
            System.out.println("Hello");
            k++;
        } // false

        boolean isWin = true;
        int count = 1;
        int win = 5;
        while (count <= win) {
            System.out.println(count + " Thank you for inviting me");
            count++;
        } //1 Thank you for inviting me
//        2 Thank you for inviting me
//        3 Thank you for inviting me
//        4 Thank you for inviting me
//        5 Thank you for inviting me


        int num2 = 2;
        while (num2 >= -3 && num2 > 0) {
            System.out.println(num2 + " Digital Nomads");
            num2--;
        } //2 Digital Nomads
//        1 Digital Nomads


        String str = "Windows";
        for (int b = 1; b <= str.indexOf('d'); b++) {
            System.out.println(b + " " + str);
        } //1 Windows
//        2 Windows
//        3 Windows


        String str1 = "Windows ";
//                                 [WINDOWS ]  [WINDOWS] [DOWS]-->0 1 2 3         [2]
        for (int b = 1; b <= str1.toUpperCase().trim().substring(3).indexOf('W'); b++) {
            System.out.println(b + " " + str);
        } //1 Windows
//        2 Windows
    }
}
