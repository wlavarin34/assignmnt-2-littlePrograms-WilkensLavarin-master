/**
 * 
 */
package com.mycompany.ass2.chapter4.Programs_4_8;
// Figure 4.8
import java.util.Scanner;
/**
 * @author Miles
 *
 */
public class ClassAverage //class ClassAverage
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		while (gradeCounter <= 10)
		{
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total += grade;
			gradeCounter += 1;
		}
		
		int average = total / 10;
		
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
		
		System.out.println("Run of class ClassAverage...");
	}
}
