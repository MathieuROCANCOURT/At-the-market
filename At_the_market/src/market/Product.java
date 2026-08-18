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
	 * @param name
	 * @param unitPrice
	 * @param unit
	 * @param stockQuantity
	 * @param pickingDate
	 * @param shelfLifeDays
	 */
	public Product(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.unit = unit;
		this.stockQuantity = stockQuantity;
		this.pickingDate = pickingDate;
		this.shelfLifeDays = shelfLifeDays;
	}
	
	public abstract void calculateExpirationDate();
	
	public void updateProduct() {
		
	}
}
