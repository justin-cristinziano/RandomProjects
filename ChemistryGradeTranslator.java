/* What's up Ry. Got bored and needed to practice writing some basic
 * code for my exam tomorrow. Hope it saves you some time. Anything in this gray
 * print is just a comment for you to read. I'll kinda guide you on how to
 * actually run it in person but I'll leave some reminders here and there :)
 */

import java.util.Scanner;

public class ChemistryGradeTranslator {
    
    /* Try your best not to crash it. I'll put some crash blockers in 
     * there but it's still definitely possible to crash.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Copy and paste the list of numbers here (from the chem gradebook): ");
        while(!in.hasNextInt()) {
            System.out.println("You gots to input only the numbers gang");
        }
        int numbers = Math.abs(in.nextInt());
        String numbersString = String.valueOf(numbers);
        System.out.println("");
        NumberToLetter(numbersString);
    }

    public static void NumberToLetter(String numbersString) {
        int i = 0;
        while(i < numbersString.length()) {
            System.out.print((i + 1) + ". ");
            char IndividualNumber = numbersString.charAt(i);
            switch(IndividualNumber) {
                case '1':
                    System.out.println("A");
                    break;
                case '2':
                    System.out.println("B");
                    break;
                case '3':
                    System.out.println("C");
                    break;
                case '4':
                    System.out.println("D");
                    break;
                case '5':
                    System.out.println("E");
                    break;
                case '6':
                    System.out.println("F");
                    break;
                default:
                    System.out.println("");
                    System.out.println("You messed up somewhere dawg");
                    break;
            }
            System.out.println("");
            i++;
        }
    }

}
