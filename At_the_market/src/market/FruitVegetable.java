/**
 * 
 */
package market;

import java.time.LocalDate;

/**
 * 
 */
public class FruitVegetable extends Product implements Consumable {
	/**
	 * @param name
	 * @param unitPrice
	 * @param unit
	 * @param stockQuantity
	 * @param pickingDate
	 * @param shelfLifeDays
	 */
	public FruitVegetable(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
	}

	@Override
	public boolean isRipe() {
		return false;
	}

	@Override
	public boolean isExpired(LocalDate dateVerification) {
		return false;
	}

	@Override
	public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
		return dateVerification.getLong(null) - super.getPickingDate().getLong(null);
	}

	@Override
	public LocalDate calculateExpirationDate() {
		return super.getPickingDate().plusDays(this.getShelfLifeDays());
	}
}
