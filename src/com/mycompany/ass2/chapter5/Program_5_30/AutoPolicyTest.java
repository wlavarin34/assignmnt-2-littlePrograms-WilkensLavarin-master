/**
 * 
 */
package com.mycompany.ass2.chapter5.Program_5_30;
import java.util.Scanner;
/**
 * @author Miles
 *
 */
//	5.30 (programming based on 5.11 + 5.12, make 
//	sure to have and if needed update caller/test 
//	code from 5.12)

//	5.30 (Modified AutoPolicy Class) Modify class AutoPolicy 
//	in Fig. 5.11 to validate the two-letter state codes for the 
//	northeast states. The codes are: CT for Connecticut, MA for 
//	Massachusetts, ME for Maine, NH for New Hampshire, NJ for 
//	New Jersey, NY for New York, PA for Pennsylvania and VT for Vermont. 
//
//	In AutoPolicy method setState, use the logical OR (||) operator 
//	(Section 5.9) to create a compound condition in an if…else statement 
//	that compares the method’s argument with each two-letter code. If the code 
//	is incorrect, the else part of the if…else statement should display an error 
//	message. In later chapters, you’ll learn how to use exception handling to 
//	indicate that a method received an invalid value.

public class AutoPolicyTest 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int account;
		String model;
		String state;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Auto Policy.");
		System.out.println("\tPlease enter for policy 1: ");
		System.out.println("Six number Account Number: ");
		account = input.nextInt();
		input.nextLine(); // have to add this to consume the \n
		System.out.println("Make and Model of the vehicle: ");
		model = input.nextLine();
		System.out.println("State the vehicle was issued (East Coast State in Two Letters): ");
		state = input.nextLine();
		AutoPolicy policy1 = new AutoPolicy(account, model, state);
		System.out.println();
		
		System.out.println("\tPlease enter for policy 2: ");
		System.out.println("Six number Account Number: ");
		account = input.nextInt();
		input.nextLine();
		System.out.println("Make and Model of the vehicle: ");
		model = input.nextLine();
		System.out.println("State the vehicle was issued (East Coast State in Two Letters): ");
		state = input.nextLine();
		AutoPolicy policy2 = new AutoPolicy(account, model, state);
		
		
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}
	
	public static void policyInNoFaultState(AutoPolicy policy)
	{
		System.out.println("The auto policy:");
		System.out.printf(
				"Acount #: %d; Car: %s; %nState %s %S a no-fault State.%n%n",
				policy.getAccountNumber(), policy.getMakeAndModel(),
				policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
	}
}
