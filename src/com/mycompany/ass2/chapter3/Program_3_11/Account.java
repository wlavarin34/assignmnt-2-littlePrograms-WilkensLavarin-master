/**
 * 
 */
package com.mycompany.ass2.chapter3.Program_3_11;

/**
 * @author Miles
 *
 */ 
public class Account
{
//	3.11 (Modified Account Class) 
//	Modify class Account (Fig. 3.8) to provide a 
//	method called withdraw that withdraws money 
//	from an Account. Ensure that the withdrawal 
//	amount does not exceed the Account’s balance. 
//	If it does, the balance should be left unchanged 
//	and the method should print a message indicating 
//	"Withdrawal amount exceeded account balance." 
//	Modify class AccountTest (Fig. 3.9) to test method 
//	withdraw.
		
	private String name;
	private double balance;
	
	public Account(String name, double balance)
	{
		this.name = name;
		do
		{
			if (balance > 0.0)
				this.balance = balance;
			else
			{
				System.out.println("The balance is negative please try again.");		
			}
		} while (balance < 0.0);
	}
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
		else
			System.out.println("Deposit amount is not valid.");
	}
	
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount <= balance)
			balance = balance - withdrawAmount;
		else
			System.out.println("Withdrawal amount exceeded account balance.");
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}


