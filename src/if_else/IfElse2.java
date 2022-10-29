package if_else;

public class IfElse2 {
    public static void main(String[] args) {

        // 0 - 50 = D
        // 51 - 60 = C
        // 61 - 70 = B
        // 71 - 100 = A

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your points");
//        int marks = scanner.nextInt();
//

        // if-else ladder
//        if (marks >= 0 && marks <= 50){  // 30 31 32 33 ......48 49 50
//            System.out.println("Your mark is [D]");
//        } else if (marks >= 51 && marks <= 60){  // 51 - 60
//            System.out.println("Your mark is [C]");
//        } else if (marks >= 61 && marks <= 70) { // 61 - 70
//            System.out.println("Your mark is [B]");
//        } else if (marks >= 71 && marks <= 100){
//            System.out.println("Your mark is [A]");
//        } else {
//            System.err.println("Please enter 1 - 100");
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter your age");
//        int talgatsAge = scan.nextInt();
//
//
//        //   16    16  = true
//        //  ( true   )      && (     false   )
//        //  (            false                )
//        if (talgatsAge >= 0 && talgatsAge < 16){
//            System.out.println("Get international passport");
//        } else if (talgatsAge >= 16 && talgatsAge <= 100){
//            System.out.println("Get ID Passport");
//        }
//        else {
//            System.err.println("Please enter your age from 0 to 100");
//        }

        String citizen = "KG";
        int alibekAges = 5;


        // nested if
        if (citizen.equals("KG")){
            if (alibekAges >= 16 && alibekAges <= 100){
                System.out.println("Get ID passport");
            } else {
                System.out.println("Can't get ID passport, BC Under 16 year of age");
            }
        } else {
            System.out.println("You are not a citizen of KG");
        }
    }
}
