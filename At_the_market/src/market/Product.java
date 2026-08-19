/**
 * 
 */
package market;

import java.time.LocalDate;

/**
 * Generate a product with a name, the price with unit, the quantity, the
 * harvest date and the number of days to keep.
 * 
 * We can calculate the expiration date and update the product.
 * 
 * @author RocancourtM
 */
public abstract class Product {
	private String name;
	private double unitPrice;
	private String unit;
	private double stockQuantity;
	private LocalDate pickingDate;
	private int shelfLifeDays;

	/**
	 * @param name          Fruit or vegetable name
	 * @param unitPrice     Price to piece or kg
	 * @param unit          "piece" or "kg"
	 * @param stockQuantity Quantity available in the shop
	 * @param pickingDate   Harvest date
	 * @param shelfLifeDays Number of days to keep
	 */
	protected Product(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.unit = unit;
		this.stockQuantity = stockQuantity;
		this.pickingDate = pickingDate;
		this.shelfLifeDays = shelfLifeDays;
	}

	/** 
	 * Get the product name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the unit price.
	 * 
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * Get "pièces" or "kg".
	 * 
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Get the quantity in the stock.
	 * 
	 * @return the stockQuantity
	 */
	public double getStockQuantity() {
		return stockQuantity;
	}

	/**
	 * Get the harvest date.
	 * 
	 * @return the pickingDate
	 */
	public LocalDate getPickingDate() {
		return pickingDate;
	}

	/**
	 * Get the number of days to keep.
	 * 
	 * @return the shelfLifeDays
	 */
	public int getShelfLifeDays() {
		return shelfLifeDays;
	}

	/**
	 * Change the quantity in the stock.
	 * 
	 * @param stockQuantity the stockQuantity to set
	 */
	public void setStockQuantity(double stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	/**
	 * Change the picking date.
	 * 
	 * @param pickingDate the pickingDate to set
	 */
	public void setPickingDate(LocalDate pickingDate) {
		this.pickingDate = pickingDate;
	}

	/**
	 * Change the number of days to keep.
	 * 
	 * @param shelfLifeDays the shelfLifeDays to set
	 */
	public void setShelfLifeDays(int shelfLifeDays) {
		this.shelfLifeDays = shelfLifeDays;
	}

	/**
	 * Calculate the expiration date.
	 * 
	 * @return The expiration date.
	 */
	public abstract LocalDate calculateExpirationDate();

	/**
	 * Update the product.
	 * 
	 * @param quantityWithdawn Quantity withdrawn by the customer.
	 */
	public void updateProduct(double quantityWithdawn) {
		setStockQuantity(this.stockQuantity - quantityWithdawn);
	}
}
