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
	 * Checks if the fruits or vegetables are expired or not.
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
