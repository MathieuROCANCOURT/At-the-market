/**
 * 
 */
package market;

import java.time.LocalDate;

/**
 * 
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	
	/**
	 * @return the stockQuantity
	 */
	public double getStockQuantity() {
		return stockQuantity;
	}

	/**
	 * @return the pickingDate
	 */
	public LocalDate getPickingDate() {
		return pickingDate;
	}

	/**
	 * @return the shelfLifeDays
	 */
	public int getShelfLifeDays() {
		return shelfLifeDays;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param stockQuantity the stockQuantity to set
	 */
	public void setStockQuantity(double stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	/**
	 * @param pickingDate the pickingDate to set
	 */
	public void setPickingDate(LocalDate pickingDate) {
		this.pickingDate = pickingDate;
	}

	/**
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
	
	public void updateProduct() {
		
	}
}
