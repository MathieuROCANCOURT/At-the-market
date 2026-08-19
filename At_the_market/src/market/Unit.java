/**
 * 
 */
package market;

/**
 * Choose unit between "pièces" or kg"
 * 
 * @author RocancourtM
 */
public enum Unit {
	KG("kg"), PIECE("pièces");

	public final String label;

	/**
	 * Indicate whether the price of fruits or vegetables is per piece or per
	 * kilogram.
	 * 
	 * @param label "pièces" or "kg".
	 */
	private Unit(String label) {
		this.label = label;
	}
}
