/**
 * 
 */
package market;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Generate a Shop selling with Products that are fruits and vegetables.
 * 
 * @author RocancourtM
 */
public class Shop {
	/** Actual date and time on the local machine. */
	public static LocalDate dateTime = LocalDate.now(ZoneId.of("UTC"));

	/** Fruit and vegetables list */
	public FruitVegetable[] listFruitVegetable;

	/**
	 * Create fruits and vegetables list.
	 */
	public Shop() {
		FruitVegetable clementine = new FruitVegetable("Clémentine", 2.9, Unit.KG.label, 6, dateTime, 10);
		FruitVegetable date = new FruitVegetable("Datte", 7, Unit.KG.label, 4, dateTime, 10);
		FruitVegetable pomegranate = new FruitVegetable("Grenade", 3, Unit.KG.label, 3.5, dateTime, 10);
		FruitVegetable persimmon = new FruitVegetable("Kaki", 4.5, Unit.KG.label, 3, dateTime, 10);
		FruitVegetable kiwi = new FruitVegetable("Kiwi", 3.5, Unit.KG.label, 3, dateTime, 10);
		FruitVegetable tangerine = new FruitVegetable("Mandarine", 2.8, Unit.KG.label, 6, dateTime, 10);
		FruitVegetable orange = new FruitVegetable("Orange", 1.5, Unit.KG.label, 8, dateTime, 10);
		FruitVegetable grapefruit = new FruitVegetable("Pamplemousse", 2, Unit.PIECE.label, 8, dateTime, 10);
		FruitVegetable pear = new FruitVegetable("Poire", 2.5, Unit.KG.label, 5, dateTime, 10);
		FruitVegetable apple = new FruitVegetable("Pomme", 1.5, Unit.KG.label, 8, dateTime, 10);

		FruitVegetable carrot = new FruitVegetable("Carotte", 1.3, Unit.KG.label, 7, dateTime, 10);
		FruitVegetable brusselsSprouts = new FruitVegetable("Choux de Bruxelles", 4, Unit.KG.label, 4, dateTime, 10);
		FruitVegetable greenCabbage = new FruitVegetable("Chou vert", 2.5, Unit.PIECE.label, 12, dateTime, 10);
		FruitVegetable butternutSquash = new FruitVegetable("Courge butternut", 2.5, Unit.PIECE.label, 6, dateTime, 10);
		FruitVegetable endive = new FruitVegetable("Endive", 2.5, Unit.KG.label, 5, dateTime, 10);
		FruitVegetable spinach = new FruitVegetable("Épinard", 2.6, Unit.KG.label, 4, dateTime, 10);
		FruitVegetable leek = new FruitVegetable("Poireau", 1.20, Unit.KG.label, 5, dateTime, 10);
		FruitVegetable pumpkin = new FruitVegetable("Potiron", 2.50, Unit.PIECE.label, 6, dateTime, 10);
		FruitVegetable blackRadish = new FruitVegetable("Radis noir", 5, Unit.PIECE.label, 10, dateTime, 10);
		FruitVegetable salsify = new FruitVegetable("Salsifis", 2.5, Unit.KG.label, 3, dateTime, 10);

		this.listFruitVegetable = new FruitVegetable[] { clementine, date, pomegranate, persimmon, kiwi, tangerine,
				orange, grapefruit, pear, apple, carrot, brusselsSprouts, greenCabbage, butternutSquash, endive,
				spinach, leek, pumpkin, blackRadish, salsify };
	}
	
	@Override
	public String toString() {
		String display = "Voici la liste des fruits et légumes.";
		display += "----------------------------------------------";
		
		StringBuilder strBuilder = new StringBuilder();
		for (Product product : this.listFruitVegetable) {
			strBuilder.append(product.getName());
			strBuilder.append(": ");
			strBuilder.append(product.getStockQuantity() + ' ');
			strBuilder.append(product.getUnit());
			strBuilder.append(", prix: ");
			strBuilder.append(product.getUnitPrice());
			strBuilder.append("€/");
			strBuilder.append(product.getUnit());
			strBuilder.append('\n');
		}
		
		display += strBuilder.toString();
		display += "----------------------------------------------";
		return display;
	}

	/**
	 * Main program
	 * 
	 * @param args Arguments in command line.
	 */
	public static void main(String[] args) {
		Shop shop = new Shop();

		System.out.println(shop.listFruitVegetable[0].daysRemainingBeforeExpiration(dateTime.plusDays(3)));
		System.out.println(shop.listFruitVegetable[0].daysRemainingBeforeExpiration(dateTime.plusDays(9)));

		System.out.println(shop.listFruitVegetable[0].isRipe()); // false

		dateTime = dateTime.plusDays(8);
		System.out.println(shop.listFruitVegetable[0].isRipe()); // true

		dateTime = dateTime.plusDays(3);
		System.out.println(shop.listFruitVegetable[0].isRipe()); // false
	}

}
