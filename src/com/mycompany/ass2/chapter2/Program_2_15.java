/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Miles
 *
 */
public class Program_2_15 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
//		(Arithmetic) Write an application that asks the user to enter two integers, 
//		obtains them from the user and prints their sum, product, difference and 
//		quotient (division). Use the techniques shown in Fig. 2.7. 
		
		// This application prints the sum, product, difference and quotient
		
		Scanner input = new Scanner(System.in);
		int x, y;
		int sum, product, difference, quotient;
		System.out.println("Please enter integer one: ");
		x = input.nextInt();
		System.out.println("Please enter integer two: ");
		y = input.nextInt();
		
		sum = x + y;
		product = x * y;
		difference = x - y;		
		System.out.println("The sum of the numbers: " + sum);
		System.out.println("The difference of the numbers: " + difference);
		System.out.println("The product of the numbers: " + product);
		if (y != 0)
		{
			quotient = x / y;
			System.out.println("The quotient of the numbers: " + quotient);
		}
		else
		{
			System.out.println("DATS A ZERO!");
		}
	}
}
