package logicalProblemsDay6;

import java.util.Scanner;


public class Fibonacci_Series {
	  public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.print("Enter the number: ");
		  int n=scan.nextInt();

		  int firstTerm = 0, secondTerm = 1;
		  System.out.println("Fibonacci Series till " + n + " terms:");

		  for (int i = 1; i <= n; ++i) {
			  System.out.print(firstTerm + ", ");

			  // compute the next term
			  int nextTerm = firstTerm + secondTerm;
			  firstTerm = secondTerm;
			  secondTerm = nextTerm;
		  }
	  }
}
