import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Developer: Tanner Morlan");
        System.out.println("Program Requirements:\n"
        + "\t1. Counts number and types of characters from user-entered string.\n"
        + "\t2. Count: total, letters (upper-/lower-case), numbers, spaces, and other characters.\n"
        + "\tHint: helpful methods: isLetter(), isDigit(), isSpaceChar(), and others. ;)");

    }

    public static void countCharacters() {
        String userStr = "";
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("\nPlease enter a string: ");
        userStr = sc.nextLine();

        //count stuff
        int letterCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int numberCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < userStr.length(); i++) {
            if (Character.isLetter(userStr.charAt(i))) letterCount++;
            if (Character.isLowerCase(userStr.charAt(i))) lowerCount++;
            if (Character.isUpperCase(userStr.charAt(i))) upperCount++;
            if (Character.isDigit(userStr.charAt(i))) numberCount++;
            if (Character.isSpaceChar(userStr.charAt(i))) spaceCount++;
        }
        int specialCount = userStr.replaceAll("[A-Za-z0-9\\s]", "").length();

        //output
        System.out.println("\nYour string: " + "\"" + userStr + "\" has the following number and types of characters:\n"
        + "Total number of characters: " + userStr.length()
        + "\nLetters: " + letterCount
        + "\nUpper-case letter(s): " + upperCount
        + "\nLower-case letter(s): "+ lowerCount
        + "\nNumber(s): " + numberCount
        + "\nSpace(s): " + spaceCount
        + "\nOther character(s): " + specialCount);

        sc.close();
    }
}
