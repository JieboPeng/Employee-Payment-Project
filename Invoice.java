/*
 * File name: Invoice.java
 * author: Jiebo Peng
 * Course: CST8284 - OOP (314)
 * Assignment: assignment 2
 * Date: 31 March 2023
 * Professor: George Kriger
 * Purpose: use inheritance and polymorphism
 */
package Lab06;

/**
 * Invoice class implement interface lass Payme.
 * @author Jiebo Peng
 * @see Payme
 * @see java.lang.String
 */
public class Invoice implements Payme {
    /**
     * the number of part.
     */
	private String partNumber; 
	/**
     * the description of part.
     */
	private String partDescription;
	/**
     * quantity of part
     */
	private int quantity;
	/**
     * price for each item.
     */
	private double pricePerItem;

	/**
     * four-argument constructor
     * @param part  part 
     * @param description  description
     * @param count  count
     * @param price  price
     */
	public Invoice(String part, String description, int count, 
			double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	}
	/**
     * set part number
     * @param part part
     */
	public void setPartNumber(String part) {
		partNumber = part; 
	}

	/**
     * get part number
     * @return String
     */
	public String getPartNumber() {
		return partNumber;
	}

	/**
     * set description
     * @param description description
     */
	public void setPartDescription(String description) {
		partDescription = description; 
	}

	/**
     * get description
     * @return String
     */
	public String getPartDescription() {
		return partDescription;
	}

	/**
     * set quantity
     * @param count count
     */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}

	/**
     * get quantity
     * @return int
     */
	public int getQuantity() {
		return quantity;
	}

	/**
     * set price per item
     * @param price price
     */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

	/**
     * get price per item
     * @return String
     */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
     * return String representation of Invoice object
     * @return String
     */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(), 
				"quantity", getQuantity(), "price per item", getPricePerItem());
	} 

	/**
     * method required to carry out contract with interface Payme
     * @return double
     */
	@Override
	public double getPaymentAmount() {
		double result = getQuantity() * getPricePerItem(); // calculate total cost
		return result;
	}
}


