package exo4;

import java.util.Objects;

public class GuitarSpec {
	
	public static final int NO_PREF_NUM_STRINGS = -1;
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;
	
	
	public GuitarSpec(Builder builder, String model, Type type,int numStrings, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public boolean matches(GuitarSpec searchGuitarSpec) {
		boolean filterBack = true;
		boolean filterTop = true;
		boolean filterNumStrings = true;
		boolean filterType = true;
		boolean filterModel = true;
		boolean filterBuilder = true;
		
		filterBack = (!isFilter(searchGuitarSpec.getBackWood()) || Objects.equals(backWood, searchGuitarSpec.getBackWood()));
		filterTop = (!isFilter(searchGuitarSpec.getTopWood()) || Objects.equals(topWood, searchGuitarSpec.getTopWood()));
		filterType = (!isFilter(searchGuitarSpec.getType()) || Objects.equals(type, searchGuitarSpec.getType()));
		filterModel = (!isFilter(searchGuitarSpec.getModel()) || Objects.equals(model, searchGuitarSpec.getModel()));
		filterBuilder = (!isFilter(searchGuitarSpec.getBuilder()) || Objects.equals(builder, searchGuitarSpec.getBuilder()));
		filterNumStrings = (!(Objects.nonNull(searchGuitarSpec.getNumStrings()) && NO_PREF_NUM_STRINGS != searchGuitarSpec.getNumStrings())
				|| Objects.equals(numStrings, searchGuitarSpec.getNumStrings()));
		
		return filterBack && filterBuilder && filterModel && filterTop && filterType && filterNumStrings;
	}
	
	private boolean isFilter(Object value) {
		return Objects.nonNull(value) && !"".equals(value.toString());
	}
	
}
