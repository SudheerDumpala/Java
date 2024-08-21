// Taking Input from the user

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class UserInput{
    public static void main(String[] args) throws IOException{

        //using the bufferReader
        InputStreamReader intake = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(intake);
        System.out.print("Enter the name: ");
        String name = bf.readLine();
        System.out.print("Enter a Age:  ");
        int age = Integer.parseInt(bf.readLine());
        System.out.println("Name: "+name+" Age: "+age);

        // using the Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int num = input.nextInt();
        System.out.println("The number is: "+num);

        /* To get the ASCII values for the given input
        * ASCII: American Standard Code for Information Interchange
        * ASCII values: 0 to 9 - 48 to 57, A to Z - 65 yo 90, a to z - 97 to 122
        */
        System.out.print("Enter a number: ");
        int ascii = System.in.read();
        System.out.println("The ASCII value for the given Input is: "+ascii);
        bf.close();
        input.close();
    }
}