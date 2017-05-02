/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Miles
 *
 */
public class Program_2_17 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
//		2.17 (Arithmetic, Smallest and Largest) 
//		Write an application that inputs three integers 
//		from the user and displays the sum, average, product, 
//		smallest and largest of the numbers. Use the techniques 
//		shown in Fig. 2.15. [Note: The calculation of the average 
//		in this exercise should result in an integer representation 
//		of the average. So, if the sum of the values is 7, the average 
//		should be 2, not 2.3333….]
		
		Scanner input = new Scanner(System.in);
		int sum, average, product, smallest, largest;
		int x, y, z;
		System.out.print("Please input the first integer: ");
		x = input.nextInt();
		System.out.print("Please input the second integer: ");
		y = input.nextInt();
		System.out.print("Please input the third integer: ");
		z = input.nextInt();
		
		sum = x + y + z;
		average = sum / 3;
		product = x * y * z;
		
		if (x < y && x < z)
			smallest = x;
		else if (z < y)
			smallest = z;
		else
			smallest = y;
		
		if (x > y && x > z)
			largest = x;
		else if (z > y)
			largest = z;
		else
			largest = y;
		
		System.out.println("The sum of your three numbers: " + sum);
		System.out.println("The average of your three numbers: " + average);
		System.out.println("The product of your three numbers: " + product);
		System.out.println("The smallest of your three numbers: " + smallest);
		System.out.println("The largest of your three numbers: " + largest);
	}

}
