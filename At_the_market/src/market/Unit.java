/**
 * 
 */
package market;

/**
 * Choose unit between "piece" or kg"
 * 
 * @author RocancourtM
 */
public enum Unit {
	KG("kg"),
	PIECE("pièces");
	
	public final String label;

    private Unit(String label) {
        this.label = label;
    }
}
