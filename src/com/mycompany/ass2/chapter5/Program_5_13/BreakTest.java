/**
 * 
 */
package com.mycompany.ass2.chapter5.Program_5_13;

/**
 * @author Miles
 *
 */
public class BreakTest //figure 5.13
{
	public static void main(String[] args) 
	{
		int count;
		for (count = 1; count <= 10; count++)
		{
			if (count == 5)
				break;
			
			System.out.printf("%d ", count);
		}
		
		System.out.printf("%nBroke out of loop at count = %d%n", count);
		System.out.println("End of Class BreakTest...");
	}
}
