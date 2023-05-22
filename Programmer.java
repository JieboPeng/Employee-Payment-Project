/*
 * File name: Programmer .java
 * author: Jiebo Peng
 * Course: CST8284 - OOP (314)
 * Assignment: lab06
 * Date: 31 March 2023
 * Professor: George Kriger
 * Purpose: use extends, inheritance and polymorphism
 */
package Lab06;
/**
 * class Programmer implements interface class Payme.
 * @author Jiebo Peng
 * @see Payme
 * @see java.lang.String
 */
public abstract class Programmer implements Payme {

	/**
	 * first name of the class
	 */
	private String firstName;
	/**
	 * last name of the class
	 */
	private String lastName;
	/**
	 * social security number of the class
	 */
	private String socialSecurityNumber;

    /**
     * argument-constructor
     * @param first  the first name
     * @param last   the last name
     * @param ssn    the social security number
     */
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	/** 
	 * Accessor for firstName.
	 * @return Stirng
	 */
	public String getFirstName() {
		return firstName;
	}
	/** 
	 * Accessor for lastName.
	 * @return Stirng
	 */
	public String getLastName() {
		return lastName;
	}
	/** 
	 * Accessor for socialSecurityNumber.
	 * @return Stirng
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * return String representation of Programmer object
	 */
	@Override
	public String toString() {
		//return String.format("%s %s\n%s: %s\n%s: %s", 
		return String.format("%s %s \n%s%s\n", 
				getFirstName(), getLastName(), "social security number: ",getSocialSecurityNumber());
	} 

    /**
     * this method is an abstract method.
     * @return double
     */
	public abstract double earnings(); 
} 


