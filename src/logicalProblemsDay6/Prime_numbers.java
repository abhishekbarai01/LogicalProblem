package logicalProblemsDay6;

import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:" );
        int num = scan.nextInt();
        
		boolean flag = false;
	    for (int i = 2; i <= num; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }


	}


