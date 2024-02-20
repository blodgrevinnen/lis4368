import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSwap {
    //getRequirements() method to check if value is a float or not
    public static boolean getRequirements(float value) {
        //check num
        boolean isFloat;
        
        if (value == (float)value) {
            isFloat = true;
        } else {
            isFloat = false;
        }

        return isFloat;
    }

    //numberSwap1() method
    public static float numberSwap1(float num2) {
        float num1_afterSwap = num2;
        return num1_afterSwap;
    }

    //numberSwap1() method
    public static float numberSwap2(float num1) {
        float num2_afterSwap = num1;
        return num2_afterSwap;
    }
    //main method
    public static void main (String[] args) {
        //heading
        System.out.println("Author: Tanner Morlan");
        System.out.println("Program Requirements:");
        System.out.println("1. Program swaps two user-entered floating-point values.");
        System.out.println("2. Create at least two user-defined methods: getRequirements() and numberSwap().");
        System.out.println("3. Must perform data validation: numbers must be floats.");
        System.out.println("4. Print numbers before/after swapping.\n");

        //create scanner object
        Scanner scnr = new Scanner(System.in);

        //first input


        //System.out.print("\nEnter num2:");
        //float num2 = scnr.nextFloat();

        //first input
        float num1;
        while (true) {
            try {
                System.out.print("Enter num1:");
                num1 = scnr.nextFloat();

                if (getRequirements(num1)) {
                    break;
                }

            } catch (InputMismatchException e) {
                scnr.nextLine();
                System.out.print("Invalid input! \nPlease try again. ");
            }
        }

        //second input
        float num2;
        while (true) {
            try {
                System.out.print("Enter num2:");
                num2 = scnr.nextFloat();

                if (getRequirements(num2)) {
                    break;
                }

            } catch (InputMismatchException e) {
                scnr.nextLine();
                System.out.print("Invalid input! \nPlease try again. ");
            }
        }

        //before swap
        System.out.println("\nBefore swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //after swap
        System.out.println("\nAfter swap:");
        System.out.println("num1 = " + numberSwap1(num2));
        System.out.println("num2 = " + numberSwap2(num1));

    }
}
