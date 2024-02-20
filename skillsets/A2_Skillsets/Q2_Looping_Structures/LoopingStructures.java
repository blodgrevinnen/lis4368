public class LoopingStructures {
    public static void main(String[] args) {
        //heading
        System.out.println("Developer: Tanner Morlan");
        System.out.println("Program loops through array of floats.");
        System.out.println("Use following values: 1.0, 2.1, 3.2, 4.3, 5.4");
        System.out.println("Use following loop structures: for, enhanced for, while, do...while\n");

        System.out.println("Note: Pretest loops: for, enhanced for, while. Posttest loop: do...while.\n");

        //array
        double numbers[] = new double[]{1.0, 2.1, 3.2, 4.3, 5.4};
        //for loop
        System.out.println("for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //for-each loop
        System.out.println("\nEnhanced for loop:");
        for (double number : numbers) {
            System.out.println(number);
        }

        //while loop:
        System.out.println("\nwhile loop:");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        //do...while loop:
        int j = 0;
        System.out.println("\ndo...while loop");
        do {
            System.out.println(numbers[j]);
            j++;
        } while (j < numbers.length);
    }
}
