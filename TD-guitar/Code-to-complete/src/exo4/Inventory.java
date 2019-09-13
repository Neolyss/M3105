package exo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
		super();
		this.guitars = new ArrayList<>();
		initializeInventory();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		guitars.add(new Guitar(serialNumber, price, guitarSpec));
	}
	
	public Guitar getGuitar(String serialNumber) {
		Iterator<Guitar> iterator = guitars.iterator();
		Guitar guitarFound = null;
		while (Objects.isNull(guitarFound) && iterator.hasNext()) {
			Guitar currentGuitar = iterator.next();
			if (currentGuitar.getSerialNumber().equals(serialNumber)) {
				guitarFound = currentGuitar;
			}
		}
		return guitarFound;
	}
	
	public List<Guitar> search(GuitarSpec searchGuitarSpec) {
		List<Guitar> guitarFounds = new ArrayList<>();
		  
		for(Guitar currentGuitar : guitars) {  
			GuitarSpec currentSpec = currentGuitar.getGuitarSpec();
			if(currentSpec.matches(searchGuitarSpec)) {
				guitarFounds.add(currentGuitar);
			}
		 }
		 return guitarFounds;
	  }
	
	private void initializeInventory() {
		addGuitar("11277", 3999.95,
	      new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
	                     Wood.INDIAN_ROSEWOOD, Wood.SITKA));
	    addGuitar("V95693", 1499.95,
	      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
	                     Wood.ALDER, Wood.ALDER));
	    addGuitar("V9512", 1549.95,
	      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
	                     Wood.ALDER, Wood.ALDER));
	    addGuitar("122784", 5495.95,
	      new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6,
	                     Wood.MAHOGANY, Wood.ADIRONDACK));
	    addGuitar("76531", 6295.95,
	      new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
	                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
	    addGuitar("70108276", 2295.95,
	      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
	                     Wood.MAHOGANY, Wood.MAHOGANY));
	    addGuitar("82765501", 1890.95,
	      new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6,
	                     Wood.MAHOGANY, Wood.MAHOGANY));
	    addGuitar("77023", 6275.95,
	      new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6,
	                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
	    addGuitar("1092", 12995.95,
	      new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12,
	                     Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
	    addGuitar("566-62", 8999.95,
	      new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12,
	                     Wood.COCOBOLO, Wood.CEDAR));
	    addGuitar("6 29584", 2100.95,
	      new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC,
	                     6, Wood.MAHOGANY, Wood.MAPLE));
	}
	
}
