package exo4;

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
		boolean answer = true;
		
		return answer;
	}
	
}
