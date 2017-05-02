/**
 * 
 */
package com.mycompany.ass2.chapter5.Program_5_30;
/**
 * @author Miles
 *
 */
public class AutoPolicy 
{
	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	public AutoPolicy(int accountNumber, String makeAndModel, String state)
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		setState(state);
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setMakeAndModel(String makeAndModel)
	{
		this.makeAndModel = makeAndModel;
	}
	
	public String getMakeAndModel()
	{
		return makeAndModel;
	}
	
	public void setState(String state)
	{
		if (state == "MA" || state == "NJ" || state == "NY" || state == "PA" ||
				state == "CT" || state == "ME" || state == "VT")
		{
			this.state = state;
		}
		else
		{
			System.out.printf("%S%n", "The state is incorrect.");
			System.exit(0);
		}
	}
	
	public String getState()
	{
		return state;
	}
	
	public boolean isNoFaultState()
	{
		boolean noFaultState;
		switch (getState())
		{
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
		case "CT":
		case "ME":
		case "VT":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;				
		}
		
		return noFaultState;
	}
}
