
import java.io.DataInputStream;
import java.io.IOException;

public class Recursion {
    // Static variable to current number being printed
    static int i = 1;

    // Main method
    public static void main(String args[]) throws Exception {
        // Variable to store user input
        int n;

        // DataInputstream to read user input
        DataInputStream ob = new DataInputStream(System.in);
        System.out.print("Enter the number:");
        n = Integer.parseInt(ob.readLine());

        // Call the recursion function
        one(n);
    }

    // Recursion function that prints numbers from 1 to the given user input
    static void one(int user) {
        // Print the current number
        System.out.print(i+" ");
        i++;

        // Check if the current number is less than or equal to the user input
        if (i <= user) {
            // Call the function recursively with the same user input
            one(user);
        }
    }
}



