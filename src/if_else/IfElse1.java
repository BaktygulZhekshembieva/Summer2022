package if_else;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {

        boolean isJavaFun = true;

        Scanner scan = new Scanner(System.in);
        System.out.println("Пиши true");
        String userAnswer = scan.next();
        String baseAnswer = "true";

        if (userAnswer.equals(baseAnswer)){
            System.out.println("That is TRUE");
        } else {
            System.err.println("FALSE FALSE FALSE");
        }

//        System.out.println("Are you married?");
////        String userAnswer = scan.next();  // yes / no
//        String yesAnswer = "yes";
//        String noAnswer = "no";
//        String divorced = "divorced";


// if statement
// if -> else statement
// if -> else if -> else if -> else if -> else



//  (           true            )
//        if (userAnswer.equals(yesAnswer)) {  // ye == yes --> false
//            System.out.println("You are married!");
//        } else if (userAnswer.equals(noAnswer)) {  // bvdfjv == no --> false
//            System.out.println("You aren't married!");
//        } else if (userAnswer.equals(divorced)) {
//            System.out.println("You are divorced");
//        } else {
//            System.out.println("Please write 'yes' or 'no' or 'divorced'");
//        }

// optional
    }
}
