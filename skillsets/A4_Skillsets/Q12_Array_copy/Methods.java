import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Author: Tanner Morlan");
        System.out.println("Program Requirements:\n"
        + "1. Create a string array (str1), based upton users' number of preferred programming languages.\n"
        + "2. Create a second string array (str2) based upon the length of str1 array.\n"
        + "3. Copy str1 array elements into str2.\n"
        + "4. Print elements of both arrays using Java's *enhanced* for loop.\n");
    }
    public static String[] createArray() {
        Scanner sc = new Scanner(System.in);
        int arraySize = 0;

        System.out.print("How many favorite programming languages do you have (min 1)? ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input!\n");
            sc.next();
            System.out.print("Please try again. Enter valid input (min 1): ");
        }
        arraySize = sc.nextInt();

        while(arraySize < 1) {
            System.out.print("\nList must be greater than 0. Please enter number of favorite programming languages: ");
            while (!sc.hasNextInt()) {
                System.out.print("\nMust enter valid data: ");
                sc.next();
                System.out.print("Please try again. Enter valid input (min 1):");
            }
            arraySize = sc.nextInt();
        }

        String yourArray[] = new String[arraySize];
        return yourArray;
    }

    public static void copyArray(String [] str1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your " + str1.length + " favorite programming languages:");
        for (int i = 0; i < str1.length; i++) {
            str1[i] = sc.nextLine();
        }

        String str2[] = new String[str1.length];
        int myCounter = 0;
        for (String myIterator: str1) {
            str2[myCounter++] = myIterator;
        }

        System.out.println();

        System.out.println("Printing str1 array: ");
        for (String myIterator: str1) {
            System.out.println(myIterator);
        }

        System.out.println("\nPrinting str2 array:");
        for (String myIterator: str2) {
            System.out.println(myIterator);
        }

        System.out.println();
        sc.close();
    }
}