package evil.obstcorp.obstcorpbackend.badpractice;


public class BadPractice {

    public static void bad() {
        System.out.println("Hello, World!"); // Printing a basic message

        // Declaring variables without meaningful names
        int a = 10;
        int b = 20;

        // Using single-letter variable names makes the code hard to understand
        int c = a + b;

        // Lack of comments makes it difficult to understand the purpose of the code
        System.out.println(c);

        // Poor indentation makes the code hard to read
    for(int i=0;i<10;i++){
    System.out.println(i);
}

        // Mixing of code logic and output in the main method
        System.out.println("Sum of a and b is: " + c);

        // Not using meaningful variable names
        int x = 5;
        int y = 7;
        int z = x * y;

        // Inconsistent spacing and indentation
        if(z>20){System.out.println("z is greater than 20");}
else{System.out.println("z is less than or equal to 20");}

        // Lack of proper error handling
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[10]); // This line will throw an ArrayIndexOutOfBoundsException

        // Using hardcoded values instead of constants or variables
        System.out.println("The value of PI is: " + 3.14);

        // Not closing resources properly
        // Scanner scanner = new Scanner(System.in); // Resource leak: 'scanner' is never closed
        // int input = scanner.nextInt();
        // System.out.println("You entered: " + input);

        // Not following Java naming conventions
        int BadlyNamedVariable = 100;

        // Using magic numbers instead of named constants
        if (BadlyNamedVariable > 50) {
            System.out.println("BadlyNamedVariable is greater than 50");
        }
    }
}

