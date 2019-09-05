package exo1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Inventory {
	
  private List<Guitar> guitars;

  public Inventory() {
    guitars = new LinkedList<>();
  }

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    guitars.add(new Guitar(serialNumber,price,builder, model, type, backWood, topWood));
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
  
  public Guitar search(Guitar searchGuitar) {
	  Optional<Guitar> findFirst = guitars.stream().filter(guitar -> guitar.equals(searchGuitar)).findFirst();
	  return findFirst.isPresent() ? findFirst.get() : null;
  }
  
}
