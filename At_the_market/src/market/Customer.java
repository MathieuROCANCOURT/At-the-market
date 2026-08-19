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
		this.basket.add(product);
	}

	@Override
	public void removeBasket(Product product) {
		if (this.basket.contains(product)) {
			this.basket.remove(product);
		} else {
			System.err.println("Le produit n'est pas dans la liste.");
		}
	}

	@Override
	public double totalCost() {
		double cost = 0;

		for (Product product : this.basket) {
			cost += product.getStockQuantity() * product.getUnitPrice();
		}

		return cost;
	}
}
