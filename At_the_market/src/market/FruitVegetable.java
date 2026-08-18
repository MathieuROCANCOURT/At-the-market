/**
 * 
 */
package market;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 * 
 */
public class FruitVegetable extends Product implements Consumable {
	/**
	 * @param name          Fruit or vegetable name
	 * @param unitPrice     Price to piece or kg
	 * @param unit          "piece" or "kg"
	 * @param stockQuantity Quantity available in the shop
	 * @param pickingDate   Harvest date
	 * @param shelfLifeDays Number of days to keep
	 */
	public FruitVegetable(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
	}

	@Override
	public boolean isRipe() {
		return calculateExpirationDate().minusDays(4).isBefore(LocalDate.now(ZoneId.of("UTC")))
				&& calculateExpirationDate().isAfter(LocalDate.now(ZoneId.of("UTC")).plusDays(1));
	}

	@Override
	public boolean isExpired(LocalDate dateVerification) {
		return this.daysRemainingBeforeExpiration(dateVerification) < 0;
	}

	@Override
	public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
		return dateVerification.compareTo(super.getPickingDate().plusDays(super.getShelfLifeDays()));
	}

	@Override
	public LocalDate calculateExpirationDate() {
		return super.getPickingDate().plusDays(this.getShelfLifeDays());
	}
}
