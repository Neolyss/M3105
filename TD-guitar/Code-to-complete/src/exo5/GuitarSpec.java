package exo5;

import java.util.Objects;

public class GuitarSpec extends InstrumentSpec {
	
	public static final int NO_PREF_NUM_STRINGS = -1;
	private int numStrings;
	
	
	public GuitarSpec(Builder builder, String model,int numStrings,Type type,Wood backWood, Wood topWood) {
		super(builder,model,type,backWood,topWood);
		this.numStrings = numStrings;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	@Override
	public boolean matches(InstrumentSpec searchInstrumentSpec) {
		boolean filterNumStrings = true;
		if(searchInstrumentSpec instanceof GuitarSpec) {
			GuitarSpec searchGuitarSpec = (GuitarSpec) searchInstrumentSpec;
			filterNumStrings = (!(Objects.nonNull(searchGuitarSpec.getNumStrings()) && NO_PREF_NUM_STRINGS != searchGuitarSpec.getNumStrings())
			|| Objects.equals(numStrings, searchGuitarSpec.getNumStrings()));
		}
		else {
			filterNumStrings = false;
		}
		
		return super.matches(searchInstrumentSpec) && filterNumStrings;
	}
	
}
