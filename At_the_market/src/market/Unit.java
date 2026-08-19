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
	/** Price expressed per kilogram. */
	KG("kg"),
	/** Price expressed per piece. */
	PIECE("pièces");

	/** Display label associated with the unit. */
	public final String label;

	/**
	 * Creates a unit.
	 * 
	 * @param label "pièces" or "kg".
	 */
	private Unit(String label) {
		this.label = label;
	}
}
