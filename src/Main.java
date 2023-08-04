/*This is a basic program that allows the user to enter numbers of double data type and then
it selects the highest and lowest inputs. It exists upon entering any nonnumerical value.*/
//Author: Daniel Magdziarz

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        enterNumbers();
    }

    public static void enterNumbers() {
        Scanner keyboard = new Scanner(System.in);

        double number;
        double lowestNumber = 0;
        double highestNumber = 0;
        boolean assignmentFlag = true;
        int counter = 0;

        while (true) {
            System.out.print("Enter a number or type any character to quit: ");
            String numberSrt = keyboard.nextLine();

            try {
                number = Double.parseDouble(numberSrt);
            } catch (NumberFormatException e) {
                break;
            }

            if (assignmentFlag) {
                lowestNumber = number;
                highestNumber = number;
                counter++;
                assignmentFlag = false;
            }

            if (number > highestNumber) {
                highestNumber = number;
            }

            if (number < lowestNumber) {
                lowestNumber = number;
            }
        }

        if (counter == 0) {
            System.out.println("User did not enter any numerical values.");
        } else {
            System.out.printf("Highest number entered: %,.2f%n", highestNumber);
            System.out.printf("Lowest number entered: %,.2f%n", lowestNumber);
        }
    }
}