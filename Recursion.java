package tricky_programs;


//
//{
//	public static void main(String[] args) throws Exception
//	{
//	
//        DataInputStream obj=new DataInputStream(System.in);
//        System.out.println("Enter any number");
//        int user_input=Integer.parseInt(obj.readLine());
//        print(user_input);
//	
//	}
//	static int count=1;
////	
////	static void print(int number)
////	{
////		/*System.out.println(count);
////		count++;
//		//++number;
//		if (count==number+1) 
//		
//			return ;
//		print(number);
//		*/
	
	// Recursion:
		
//	if(number==0) {
//		return;  //when we do not denote the return its show the stackoverflow error.
//	}
//	print(number-1);
//	System.out.print(number+" ");
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



