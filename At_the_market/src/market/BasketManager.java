/**
 * 
 */
package market;

/**
 * 
 */
public interface BasketManager {
	public void addToBasket(Product product);

	public void reduceQuantity(Product product, double quantity);
	
	public void raiseQuantity(Product product, double quantity);

	public void removeBasket(Product product);

	public double totalCost();
}
