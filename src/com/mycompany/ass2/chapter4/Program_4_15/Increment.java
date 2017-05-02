/**
 * 
 */
package com.mycompany.ass2.chapter4.Program_4_15;
//Figure 4.15
/**
 * @author Miles
 *
 */
public class Increment 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c);
		System.out.printf("    postincrementing c: %d%n", c++);
		System.out.printf(" c after postincrement: %d%n", c);
		
		System.out.println();
		
		c = 5;
		System.out.printf("c before preincrement: %d%n", c);
		System.out.printf("    preincrementing c: %d%n", ++c);
		System.out.printf(" c after preincrement: %d%n", c);
		
		System.out.println("End of Increment Class...");
	}

}
