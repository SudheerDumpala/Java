// Exception Handling in java using try, catch and finally blocks

import java.lang.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5, b = 0;
        int arr[] = new int[5];
        try {
            arr[5] = 6; // ArrayIndexOutOfBoundsException
            int c = a/b; // ArithmeticException: / by zero
        } 
        catch (java.lang.IndexOutOfBoundsException e) {
            System.out.println("An array index out-of-bounds error occurred.");
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("An arithmetic error occurred in the program.");
        }
        finally {
            System.out.println("The program executed successfully ....");
        }
    }
}
