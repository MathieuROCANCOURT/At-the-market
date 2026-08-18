/**
 * 
 */
package market;

import java.time.LocalDate;

/**
 * 
 */
public class FruitVetetable extends Product implements Consumable {
	/**
	 * @param name
	 * @param unitPrice
	 * @param unit
	 * @param stockQuantity
	 * @param pickingDate
	 * @param shelfLifeDays
	 */
	public FruitVetetable(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
	}

	@Override
	public boolean isRipe() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExpired(LocalDate dateVerification) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void calculateExpirationDate() {
		// TODO Auto-generated method stub
		
	}
}
