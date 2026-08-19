/**
 * 
 */
package market;

import java.util.ArrayList;

/**
 * 
 */
public class Customer {
	private String firstName;
	private String lastName;
	private ArrayList<Product> basket = new ArrayList<>();
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
