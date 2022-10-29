package home_works_platform;

import java.util.Scanner;

public class HW_47_EnterPIN {
        public static void main( String[] args ) {

                Scanner keyboard = new Scanner(System.in);
                int pin = 12345;

                System.out.println("WELCOME TO THE BANK OF MITCHELL.");
                System.out.print("ENTER YOUR PIN: ");
                int entry = keyboard.nextInt();

                while ( entry != pin )
                {
                        System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                        System.out.print("ENTER YOUR PIN: ");
                        entry = keyboard.nextInt();
                }

                System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }

// 1. How is a while loop similar to an if statement? --> принимают условие
// 2. How is a while loop different from an if statement? --> while-цикл возвращается обратно в условие, а if не возвр.
// 3. Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
//    --> int entry уже создан до цикла while.
// 4. Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
//    --> если пользователь введет неправильный пин, то while loop будет работать бесконечно, т.к. условие всегда true
// 5. (Put the entry = keyboard.nextInt(); back before you turn in the assignment.

}