/*
 * File name: CommissionProgrammer.java
 * author: Jiebo Peng
 * Course: CST8284 - OOP (314)
 * Assignment: lab06
 * Date: 31 March 2023
 * Professor: George Kriger
 * Purpose: use extends, inheritance and polymorphism
 */
package Lab06;
/**
 * class CommissionProgrammer extends class Programmer 
 * @author Jiebo Peng
 * @see Programmer
 * @see java.lang.String
 */
public class CommissionProgrammer extends Programmer { 
    /**
     * gross weekly sales
     */
	private double grossSales; 
	 /**
     * commission percentage
     */
	private double commissionRate;

	/**
	 * parameter-constructor
	 * @param firstName first name
	 * @param lastName last name
	 * @param socialSecurityNumber social security number
	 * @param grossSales gross sales
	 * @param commissionRate commission rate
	 */
	public CommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 
    /**
     * set gross sales amount on the creation of apps
     * @param grossSales gross sales 
     */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	} 
	/**
	 * return gross sales amount 
	 * @return double
	 */
	public double getGrossSales() {
		return grossSales;
	} 
	/**
	 * set commission rate
	 * @param commissionRate  commission rate
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	} 
	/**
	 * return commission rate
	 * @return double
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 

	/**
	 * calculate earnings; override abstract method earnings in Programmer.
	 */      
	@Override   
	public double earnings() {                                            
		return getCommissionRate() * getGrossSales();                    
	}

	/**
	 * calculate payment amount
	 */  
	 @Override  
	public double getPaymentAmount() {
		return grossSales * commissionRate;
	}

	/**
	 * return the string of the object
	
	 * @return Stirng 
	 */  
	@Override  
	public String toString() {
		return String.format("commission programmer: %sgross sales: $%,.2f; commission rate: $%,.2f", 
				super.toString(), getGrossSales(), getCommissionRate());
	}     
	
}

