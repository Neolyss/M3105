package exo3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Inventory {
	
  private List<Guitar> guitars;

  public Inventory() {
    guitars = new LinkedList<>();
  }

  public void addGuitar(String serialNumber, double price,
                        Builder builder, String model,
                        Type type, Wood backWood, Wood topWood) {
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
  
  // This method has to find guitar which get the same properties than the guitar searched
  // The properties are : type of back wood and top wood, guitar model, guitar type, 
  // guitar builder.
  
  public List<Guitar> search(GuitarSpec searchGuitarSpec) {
	  List<Guitar> guitarFounds = new ArrayList<>();
	  
	  for(Guitar currentGuitar : guitars) {
		  
		  boolean filterBack = false;
		  boolean filterTop = false;
		  boolean filterModel = false;
		  boolean filterType = false;
		  boolean filterBuilder = false;
		  GuitarSpec guitarSpec = currentGuitar.getGuitarSpec();
		  
		  filterBack = !isFilter(searchGuitarSpec.getBackWood()) || Objects.equals(guitarSpec.getBackWood(), searchGuitarSpec.getBackWood());
		  filterTop = !isFilter(searchGuitarSpec.getTopWood()) || Objects.equals(guitarSpec.getTopWood(), searchGuitarSpec.getTopWood());
		  filterModel = !isFilter(searchGuitarSpec.getModel()) || Objects.equals(guitarSpec.getModel(), searchGuitarSpec.getModel());
		  filterType = !isFilter(searchGuitarSpec.getType()) || Objects.equals(guitarSpec.getType(), searchGuitarSpec.getType());
		  filterBuilder = !isFilter(searchGuitarSpec.getBuilder()) || Objects.equals(guitarSpec.getBuilder(), searchGuitarSpec.getBuilder());
		  if(filterBack && filterBuilder && filterModel && filterTop && filterType) {
			  guitarFounds.add(currentGuitar);
		  }
	  }
	  return guitarFounds;
  }

private boolean isFilter(Object value) {
	return Objects.nonNull(value) && !"".equals(value.toString());
}
  
}
