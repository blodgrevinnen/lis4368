import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Methods {
    public static void getRequirements() {
        System.out.println("Author: Tanner Morlan");
        System.out.println("Program Requirements: \n"
        + "1. Calculates amount of money saved for a period of years, at a *monthly* compounded interest rate.\n"
        + "2. Returned amount is formatted in U.S. currency, and rounded to two decimal places.\n"
        + "3. Must perform data validation: for non-numeric values, as well as only integer values for years.\n");
    }

    public static void getInterestValues() {
        Scanner sc = new Scanner(System.in);
        double principal = 0.0;
        double rate = 0.0;
        int time = 0;

        System.out.print("Currennt principal: $");
        while (!sc.hasNextDouble()) {
            System.out.println("Not valid number!\n");
            sc.next();
            System.out.print("Please try again. Enter principal: $");
        }
        principal = sc.nextDouble();

        System.out.print("Interest Rate (per year): ");
        while (!sc.hasNextDouble()) {
            System.out.println("Not valid number!\n");
            sc.next();
            System.out.print("Please try again. Enter interest rate: ");
        }
        rate = sc.nextDouble();
        rate = rate / 100;
        
        System.out.print("Total time (in years): ");
        while (!sc.hasNextInt()) {
            System.out.println("Not valid integer!\n");
            sc.next();
            System.out.print("Please try again. Enter years: ");
        }
        time = sc.nextInt();
        
        sc.close();

        calculateInterest(principal, rate, time);
    }

    public static void calculateInterest(double p, double r, int t) {
        int n = 12;
        double i = 0.0;
        double a = 0.0;

        a = p * Math.pow(1+ (r / n), n * t);
        i = a - p;
        r = r * 100;

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("\nInitial principal: " + nf.format(p));
        System.out.printf("Annual interest rate: %.1f%%%n", r);
        System.out.println("Total monthly compunded interest after " + t + " years: " + nf.format(i));
        System.out.println("Total amount: " + nf.format(a));
    }
}