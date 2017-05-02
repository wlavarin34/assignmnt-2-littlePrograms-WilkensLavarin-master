/**
 * 
 */
package com.mycompany.ass2.chapter5.Program_5_7;

/**
 * @author Miles
 *
 */
public class DoWhileTest //figure 5.7
{
	public static void main(String[] args) 
	{
		int counter = 1;
		do
		{
			System.out.printf("%d ", counter);
			++counter;
		} while (counter <= 10);

		System.out.println();
		System.out.println("End of Class DoWhileTest...");
	}

}
