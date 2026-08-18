/**
 * 
 */
package market;

import java.time.LocalDate;

/**
 * Calculate the fruits or vegetables are ripe, if is expired and the number of
 * days until expiration date.
 * 
 * @author RocancourtM
 */
public interface Consumable {
	/**
	 * Check if the fruits or vegetables are ripe.
	 * 
	 * @return true if is ripe, else false.
	 */
	public boolean isRipe();

	/**
	 * Check if the fruits or vegetables are expired or not.
	 * 
	 * @param dateVerification The target date.
	 * @return true if is expired, else false.
	 */
	public boolean isExpired(LocalDate dateVerification);

	/**
	 * Say the difference between the expiration date and the target date.
	 * 
	 * @param dateVerification The target date.
	 * @return Number of days until the expiration date.
	 */
	public long daysRemainingBeforeExpiration(LocalDate dateVerification);

}
