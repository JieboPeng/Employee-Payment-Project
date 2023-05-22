/*
 * File name: BasePlusCommissionProgrammer.java
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
 * @see CommissionProgrammer
 * @see java.lang.String
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
    /**
     * base salary per week
     */
	private double baseSalary; 

	/**
	 * parameter-constructor
	 * @param firstName  first name 
	 * @param lastName   last name
	 * @param socialSecurityNumber   social security number
	 * @param grossSales  gross sales
	 * @param commissionRate  commission rate
	 * @param baseSalary  base salary
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	}

	 /**
     * set base salary
     * @param baseSalary base salary 
     */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	} 

	 /**
     * return base salary
     * @return double
     */
	public double getBaseSalary() {
		return baseSalary;
	}

	 /**
     * calculate earnings; override method earnings in CommissionProgrammer
     */        
	@Override 
	public double earnings() {                                             
		return getBaseSalary() + super.earnings();                        
	}

	 /**
     * calculate payment amount
     */ 
	@Override 
	public double getPaymentAmount() {
		double newSalary = super.getPaymentAmount() + baseSalary;
		return newSalary;
	}

	 /**
     * return a string of the object
     * @return String
     */
	@Override 
	public String toString() {
		return String.format("base-plus commission programmer%s; base salary: %,.2f", super.toString(), getBaseSalary());
	}
}



