/* Throw, it stops program and prints the exception which we thrown, in the console
 * Throws - here the method in which the exception raised is passing the exception to
 * the method which it is called. we will handle the exception in that class or else, 
 * we can also pass it to the JVM. (Note: We must extends the "Exception or Throwable")
   */

class ZeroException extends Exception{
    public ZeroException(String string) {
        super(string);
    }
}
public class ThrowAndThrows{
    public static void main(String args[]) throws Exception{
        int a = 5, b = 0;
        ///int arr[] = new int[5];
        try {
            //arr[5] = 6; // ArrayIndexOutOfBoundsException
            int c = a/50; // ArithmeticException: / by zero
            if (c == 0){
                throw new ZeroException("You cant divide a number with zero ");
            }
        } 
        //we can also give the custom exceptions i.e., user defined exceptions
        catch (ZeroException e1){
            int c = a/1;
            System.out.println(e1.getMessage());
            System.out.println("output is: "+c);
            System.out.println("This is default output");
        }
        try{
        int d = a/b;
        }
        catch (Exception e) {
            System.out.println("An Exception occurred.");
            throw e; // It throws the exception and it will not execute the remaining 
            // lines in the respective block (here catch block)
            //System.out.println("This will not print in the console ..."); 
            // if we hover it, it says unrechable content
        }
        finally {
            System.out.println("The program executed successfully ....");
        }
    }
}
