/**
 * 
 */
package com.mycompany.ass2.chapter2;
import java.util.Scanner;

/**
 * @author Miles
 *
 */
public class Program_2_16 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
//		(Comparing Integers) Write an application that asks the user to enter two 
//		integers, obtains them from the user and displays the larger number 
//		followed by the words "is larger". If the numbers are equal, print the message 
//		"These numbers are equal". Use the techniques shown in Fig. 2.15. 
		
		Scanner input = new Scanner(System.in);
		int x, y;
		System.out.print("Please input the first integer: ");
		x = input.nextInt();
		System.out.println("Please input the second integer: ");
		y = input.nextInt();
		
		if (x > y)
		{
			System.out.println("first is larger.");
		}
		else if (x < y)
		{
			System.out.println("first is smaller.");
		}
		else
		{
			System.out.println("These numbers are equal!");
		}
	}
}
