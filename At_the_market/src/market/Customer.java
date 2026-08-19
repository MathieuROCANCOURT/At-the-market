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
	
	private static final String MESSAGE_NOT_IN_LIST = "Le produit n'est pas dans la liste.";

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
	public void reduceQuantity(Product product, double quantity) {
		if (this.basket.contains(product)) {
			Product targetProduct = this.basket.get(this.basket.indexOf(product));
			double newQuantity = targetProduct.getStockQuantity() - quantity;
			
			if (newQuantity >= 0) {
				targetProduct.setStockQuantity(newQuantity);
			} else {
				System.err.println("La quantité enlevée ne peut pas être négative.");
			}
		} else {
			System.err.println(MESSAGE_NOT_IN_LIST);
		}
	}
	
	@Override
	public void raiseQuantity(Product product, double quantity) {
		if (this.basket.contains(product)) {
			this.basket.remove(product);
		} else {
			System.err.println(MESSAGE_NOT_IN_LIST);
		}
	}

	@Override
	public void removeBasket(Product product) {
		if (this.basket.contains(product)) {
			this.basket.remove(product);
		} else {
			System.err.println(MESSAGE_NOT_IN_LIST);
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
