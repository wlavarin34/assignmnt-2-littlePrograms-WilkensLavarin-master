/**
 * 
 */
package com.mycompany.ass2.chapter5.Program_5_1;

/**
 * @author Miles
 *
 */
public class WhileCounter //figure 5.1
{
	public static void main(String[] args) 
	{
		int counter = 1;
		while (counter <= 10)
		{
			System.out.printf("%d", counter);
			++counter;
		}
		System.out.println();
		System.out.println("End of Class While Counter...");
	}

}
