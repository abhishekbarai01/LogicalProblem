package logicalProblemsDay6;

import java.util.Scanner;

public class Perfect_Number {

public static void main(String[] args) 
		   {

			   Scanner scan = new Scanner(System.in);
			   System.out.println("Enter the number: ");
			   int num = scan.nextInt();
			   Perfect(num);
		       
		   }  
		  
		   static void Perfect(int num)
		   {
		    // To store sum of divisors
		    int sum = 0,i=1;
		    while(i<num)
		    {
		        if(num % i == 0)
		        {
		            sum = sum + i;
		        }
		        i++;
		    }
		    if(sum == num)
		    {
		        System.out.println(num+" is a Perfect number");
		    }
		    else
		    {
		        System.out.println(num+" is not a Perfect number");
		    }     
		  } 
		} 



