/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Miles
 *
 */
public class Program_5_18 //based on figure 5.6
{
//	5.18 (Modified Compound-Interest Program) Modify the application 
//	in Fig. 5.6 to use only integers to calculate the compound interest. 
//	[Hint: Treat all monetary amounts as integral numbers of pennies. 
//	Then break the result into its dollars and cents portions by using 
//	the division and remainder operations, respectively. Insert a period 
//	between the dollars and the cents portions.] 
	
	public static void main(String[] args) 
	{
		int pennies = 100000;
		double rate = 0.05;
		int dollars, cents;
		
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; ++year)
		{
			int amount = (int) ((pennies * Math.pow(1.0 + rate, year)) * 100);
			int temp2 = amount;
			
			
			dollars = ((amount / 100) / 100);
			cents = ((temp2 / 100) % 100);
			
			// display each year
			System.out.printf("%4d%,16d.%02d%n", year, dollars, cents);
		}
		System.out.println("End of Program_5_18...");
	}
} // end of class Interest
