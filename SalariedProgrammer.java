/*
 * File name: SalariedProgrammer.java
 * author: Jiebo Peng
 * Course: CST8284 - OOP (314)
 * Assignment: assignment 2
 * Date: 31 March 2023
 * Professor: George Kriger
 * Purpose: use inheritance and polymorphism
 */
package Lab06;
/**
 * class SalariedProgrammer  extends class Programmer.
 * @author Jiebo Peng
 * @see Programmer
 * @see java.lang.String
 */
public class SalariedProgrammer extends Programmer  {
	/**
	 * weekly salary
	 */
	
	private double weeklySalary;

	/**
	 * parameter-constructor 
	 * @param firstName first name
	 * @param lastName last name
	 * @param socialSecurityNumber social security number
	 * @param weeklySalary weekly salary
	 */
	public SalariedProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber); 

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	 * set salary
	 * @param weeklySalary weekly salary
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	 * return salary
	 * @return double
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 

	/**
	 * calculate earnings; override abstract method earnings in Programmer
	 */      
	 @Override  
	public double earnings() {                                          
		return getWeeklySalary();                                        
	}
	
	/**
	 * get payment amount
	 * @return double
	 */  
	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}
	
	/**
	 * return string of obeject
	 * @return String
	 */ 
	 @Override   
	public String toString() {
		return String.format("SalariedProgrammer: %sweekly salary: $%,.2f", super.toString(), getWeeklySalary());
	}                                             
}

