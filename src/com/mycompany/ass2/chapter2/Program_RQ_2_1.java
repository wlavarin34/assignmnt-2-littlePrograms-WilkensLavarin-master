/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author Miles
 *
 */
public class Program_RQ_2_1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.printf("The result of 5.5 * 2.5 - 1.3 * 3: " + "\t" + DisplayNumber1(5.5, 2.5, 1.3, 3) + "\n");
		System.out.printf("The result of 31.5 - 1.5: " + "\t\t" + DisplayNumber2(31.5, 1.5) + "\n");	
	}
	
	public static double DisplayNumber1(double x, double y, double z, double a)
	{
		double number;
		number = x * y - z * a;
		return number;
	}
	
	public static double DisplayNumber2(double y, double z)
	{
		double number;
		number = y - z;
		return number;
	}

}
