/**
 * 
 */
package market;

import java.util.ArrayList;

/**
 * 
 */
public class Customer implements BasketManager {
	private String firstName;
	private String lastName;
	private ArrayList<Product> basket = new ArrayList<>();
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	@Override
	public void addToBasket(Product product) {
		
	}

	@Override
	public void removeBasket(Product product) {
		
	}

	@Override
	public double totalCost() {
		
	}
}
