/*
 * File name: HourlyProgrammer.java
 * author: Jiebo Peng
 * Course: CST8284 - OOP (314)
 * Assignment: lab06
 * Date: 31 March 2023
 * Professor: George Kriger
 * Purpose: use extends, inheritance and polymorphism
 */
package Lab06;
/**
 * HourlyProgrammer is a subclass of class Programmer.
 * @author Jiebo Peng
 * @see Programmer
 * @see java.lang.String
 */
public class HourlyProgrammer extends Programmer {
	/**
	 * wage per hour
	 */
	private double wage;
	/**
	 *  hours worked for week
	 */
	private double hours;
	/**
	 * parameter-constructor
	 * @param firstName first name 
	 * @param lastName  last name
	 * @param socialSecurityNumber  social security number
	 * @param wage  wage
	 * @param hours  hours
	 */

	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber,double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	} 
	/**
	 * set wage
	 * @param wage  wage
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	} 
	/**
	 * return wage
	 * @return double
	 */

	public double getWage() {
		return wage;
	} 
	/**
	 * set hours worked
	 * @param hours  hours
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	} 
	/**
	 * return hours worked
	 * @return double
	 */
	public double getHours() {
		return hours;
	} 

	/**
	 * earning method is used to get programmer's earning.
	 * @return double 
	 */
	 @Override                                                       
	public double earnings() {                                            
		if (getHours() <= 40) { // no overtime                           
			return getWage() * getHours();   
		}
		else {                                                             
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}                                          
	/**
	 * caculate teh payment amount   
	 * @return double
	 */      
	 @Override
	public double getPaymentAmount () {
		return wage * hours;
	}
	/**
	 * return string of obeject
	 * @return String
	 */
	  @Override
	public String toString() {
		return String.format("hourly Programmer: %shourly wage: $%,.2f; hours worked: $%,.2f", super.toString(), getWage(), getHours());
	}

}

