package exo3;

import java.util.List;

import exo3.Guitar;

public class FindGuitarTester {
	
private static Inventory inventory = new Inventory();

public static void main(String[] args) {
    // Set up Rick's guitar inventory
	 initializeInventory(inventory);

	    GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	    List<Guitar> guitars = inventory.search(whatErinLikes);
	    for(Guitar guitar : guitars) {
	    	if (guitar != null) {
	    		GuitarSpec guitarSpec = guitar.getGuitarSpec();
	    		System.out.println("Erin, you might like this " +
	    		guitarSpec.getBuilder() + " " + guitarSpec.getModel() +  " " +
	    		guitarSpec.getType() + " guitar:\n   " +
	    		guitarSpec.getBackWood() + " back and sides,\n   " +
	    		guitarSpec.getTopWood() + " top.\nYou can have it for only $" +
	    		guitar.getPrice() + "!");
	    	} else {
	    		System.out.println("Sorry, Erin, we have nothing for you.");
	    	}
	    }
  }

  public static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, 
                        "CJ", Type.ACOUSTIC, 
                        Wood.INDIAN_ROSEWOOD, Wood.SITKA);
    inventory.addGuitar("V95693", 1499.95, Builder.FENDER, 
                        "Stratocastor", Type.ELECTRIC,
                        Wood.ALDER, Wood.ALDER);
    inventory.addGuitar("V9512", 1549.95, Builder.FENDER, 
                        "Stratocastor", Type.ELECTRIC,
                        Wood.ALDER, Wood.ALDER);
    inventory.addGuitar("122784", 5495.95, Builder.MARTIN, 
                        "D-18", Type.ACOUSTIC,
                        Wood.MAHOGANY, Wood.ADIRONDACK);
    inventory.addGuitar("76531", 6295.95, Builder.MARTIN, 
                        "OM-28", Type.ACOUSTIC,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK);
    inventory.addGuitar("70108276", 2295.95, Builder.GIBSON, 
                        "Les Paul", Type.ELECTRIC,
                        Wood.MAHOGANY, Wood.MAHOGANY);
    inventory.addGuitar("82765501", 1890.95, Builder.GIBSON, 
                        "SG '61 Reissue", Type.ELECTRIC,
                        Wood.MAHOGANY, Wood.MAHOGANY);
    inventory.addGuitar("77023", 6275.95, Builder.MARTIN, 
                        "D-28", Type.ACOUSTIC,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK);
    inventory.addGuitar("1092", 12995.95, Builder.OLSON, 
                        "SJ", Type.ACOUSTIC,
                        Wood.INDIAN_ROSEWOOD, Wood.CEDAR);
    inventory.addGuitar("566-62", 8999.95, Builder.RYAN, 
                        "Cathedral", Type.ACOUSTIC,
                        Wood.COCOBOLO, Wood.CEDAR);
    inventory.addGuitar("6 29584", 2100.95, Builder.PRS, 
                        "Dave Navarro Signature", Type.ELECTRIC, 
                        Wood.MAHOGANY, Wood.MAPLE);
  }
}
