/**
 * 
 */
package market;

import java.time.LocalDate;

/**
 * 
 */
public interface Consumable {
	/**
	 * @return true if is ripe, else false.
	 */
	public boolean isRipe();

	/**
	 * 
	 * @param dateVerification
	 * @return
	 */
	public boolean isExpired(LocalDate dateVerification);
	
	/**
	 * 
	 * @param dateVerification
	 * @return
	 */
	public long daysRemainingBeforeExpiration(LocalDate dateVerification);

}
