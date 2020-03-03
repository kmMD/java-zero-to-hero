package ee.itcollage.level6;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner sc = new Scanner(System.in);
        int insertedInt = sc.nextInt(); //or sc.nextLine() for String
        System.out.println("You are: " + insertedInt + " years old");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int birthYear = year - insertedInt;
        System.out.println("You were born " + birthYear);

        if (insertedInt >= 18) {
            System.out.println("Have you coded java?");
            String answer = sc.next();

            if (answer.equals("yes")) {
                System.out.println("respect");
            }
            else {
                System.out.println("good luck");
            }
        }


        // calculate and print which year person was born in
        // if person is 18+ ask them whether they have coded java
        // if yes, print respect, if no, print good luck
        // we will use scanner only in this project, but it's a new thing you can google about a bit
    }
}
