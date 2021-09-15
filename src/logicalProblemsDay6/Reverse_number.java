package logicalProblemsDay6;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
        int number = scan.nextInt();
        int reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);

}
	 
		
}
