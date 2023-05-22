/*
 * File name: Payme.java
 * author: Jiebo Peng
 * Course: CST8284 - OOP (314)
 * Assignment: lab06
 * Date: 31 March 2023
 * Professor: George Kriger
 * Purpose: use extends, inheritance and polymorphism
 */
package Lab06;

/**
 * Payme class is an interface class.
 * @author Jiebo Peng
 * @see java.io
 */
public interface Payme {
	/**
	 * getPaymentAmount ()is an interface method.
	 * @return double
	 */
	public double getPaymentAmount ();
	
	/**
	 * display() is a default interface method. it print the class itself.
	 */
	default void display() {
		System.out.println(toString());
	}

}
